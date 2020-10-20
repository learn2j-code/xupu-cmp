package com.chhtf.cmp.bam_weixinmanagement.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.chhtf.cmp.bam_basemanagement.vo.RequestEntity;
import com.chhtf.cmp.bam_basemanagement.vo.ResponseEntity;
import com.chhtf.cmp.bam_weixinmanagement.service.WxTicketService;
import com.chhtf.cmp.bam_weixinmanagement.util.CommonUtil;
import com.chhtf.cmp.bam_weixinmanagement.util.IpKit;
import com.chhtf.cmp.bam_weixinmanagement.util.MyConfig;
import com.chhtf.cmp.bam_weixinmanagement.util.SignUtil;
import com.chhtf.cmp.bam_weixinmanagement.util.sdk.WXPay;
import com.chhtf.cmp.bam_weixinmanagement.util.sdk.WXPayConstants;
import com.chhtf.cmp.bam_weixinmanagement.util.sdk.WXPayUtil;
import com.chhtf.cmp.bam_weixinmanagement.vo.WxSharedEntity;
import com.chhtf.cmp.pojo.WxuserInfo;

@Controller
@RequestMapping("")
public class WechartController {
	Logger logger = LoggerFactory.getLogger("WechartController");
//	@Autowired
//	WXPayConfig iWxPayConfig;
	
//	@Autowired
//	WxuserInfoService wxuserInfoService;
//	@Autowired
//	RechargeRecordService rechargeRecordService;
	@Autowired
	WxTicketService wxTicketService;
	@RequestMapping("wx")
	public void weixinTest(HttpServletRequest request, HttpServletResponse response) throws Exception{
        boolean isGet = request.getMethod().toLowerCase().equals("get");
        PrintWriter print;
        if (isGet) {
            // 微信加密签名
            String signature = request.getParameter("signature");
            // 时间戳
            String timestamp = request.getParameter("timestamp");
            // 随机数
            String nonce = request.getParameter("nonce");
            // 随机字符串
            String echostr = request.getParameter("echostr");
            // 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
            if (signature != null && SignUtil.checkSignature(signature, timestamp, nonce)) {
                try {
                    print = response.getWriter();
                    print.write(echostr);
                    print.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
	
    
    @RequestMapping("redirectwx")
	public ModelAndView redirectwx(){
		ModelAndView mav = new ModelAndView("redirectwx");
		return mav;
	}
	
	/**
     * 微信获取openId
     */
    @RequestMapping("wechart")
    public String getopenid(Model model,HttpServletRequest request){
    	// 用户同意授权后，能获取到code
//        Map<String, String[]> params = request.getParameterMap();//针对get获取get参数  
//        String[] codes = params.get("code");//拿到code的值 
//        String code = codes[0];//code  
    	
    	WxuserInfo wechartInfo = new WxuserInfo();
    	//获取用户openId
        String openid = "";
        
        //用户同意授权，获取返回值code和state
        String code = request.getParameter("code"); 
//        code = parsingCode(code);
        //如果code为空则（请自己实现判断，这里是简写）
        if(code == null){
            return "wechart";
        }
        
        //获取openid的地址
        String getOpenidUri = "https://api.weixin.qq.com/sns/oauth2/access_token"
                + "?appid=" + SignUtil.AppID
                + "&secret=" + SignUtil.AppSecret
                + "&code=" + code
                + "&grant_type=authorization_code";
        try{
    		//发送请求获取返回参数，使用java原生实现，可以使用httpclient或者第三方库实现
    		URL getOpenidUrl = new URL(getOpenidUri);
    		HttpURLConnection openidConnection = (HttpURLConnection) getOpenidUrl.openConnection(); 
    		openidConnection.connect();
		 
    		BufferedReader openidReader = new BufferedReader(new InputStreamReader(openidConnection.getInputStream())); 
    		StringBuffer openidStringBuffer = new StringBuffer();
    		String openidLines; 
    		while ((openidLines = openidReader.readLine()) != null) { 
    			openidStringBuffer.append(openidLines);
    		} 
			openidReader.close(); 
			openidConnection.disconnect(); 
		 
			//返回的参数是json格式
			JSONObject openidJson = JSONObject.parseObject(openidStringBuffer.toString());
			if(openidJson.containsKey("openid")){
				openid = openidJson.getString("openid");
				wechartInfo.setOpenid(openid);
			}
		}catch(Exception e){
		    //连接异常，请求异常，或者json返回值异常均需要处理
		}
        //需要对openId判空，请自行处理
//        System.out.println(openId);
        request.getSession().setAttribute("openid", openid);
        model.addAttribute("openid", openid);
        return "wechart";
    }
   
    /**
     * 获取openId
     */
    @RequestMapping("findOpenidByCode")
    public @ResponseBody ResponseEntity findOpenidByCode(@RequestBody RequestEntity requestEntity){
    	ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
    	//获取用户openId
        String openid = "";
        
        //用户同意授权，获取返回值code和state
        String code = requestEntity.getCode(); 
        
        //获取openid的地址
        String getOpenidUri = "https://api.weixin.qq.com/sns/oauth2/access_token"
                + "?appid=" + SignUtil.AppID
                + "&secret=" + SignUtil.AppSecret
                + "&code=" + code
                + "&grant_type=authorization_code";
        try{
    		//发送请求获取返回参数，使用java原生实现，可以使用httpclient或者第三方库实现
    		URL getOpenidUrl = new URL(getOpenidUri);
    		HttpURLConnection openidConnection = (HttpURLConnection) getOpenidUrl.openConnection(); 
    		openidConnection.connect();
		 
    		BufferedReader openidReader = new BufferedReader(new InputStreamReader(openidConnection.getInputStream())); 
    		StringBuffer openidStringBuffer = new StringBuffer();
    		String openidLines; 
    		while ((openidLines = openidReader.readLine()) != null) { 
    			openidStringBuffer.append(openidLines);
    		} 
			openidReader.close(); 
			openidConnection.disconnect(); 
		 
			//返回的参数是json格式
			JSONObject openidJson = JSONObject.parseObject(openidStringBuffer.toString());
			if(openidJson.containsKey("openid")){
				openid = openidJson.getString("openid");
			}
		}catch(Exception e){
		    //连接异常，请求异常，或者json返回值异常均需要处理
		}
        //需要对openId判空，请自行处理
        data.put("openid", openid);
		responseEntity.setData(data);
		return responseEntity;
    }
    
    /**
     * 微信获取用户基本信息
     */
    @RequestMapping("getWxuserInfo")
    public @ResponseBody ResponseEntity getWxuserInfo(@RequestBody WxuserInfo userInfo){
    	ResponseEntity responseEntity = new ResponseEntity();
    	// 获取接口访问凭证
        String accessToken = CommonUtil.getAccessToken();
        /**
         * 获取用户信息
         */
        WxuserInfo getUserInfo = CommonUtil.getUserInfo(accessToken, userInfo.getOpenid());
        //如果获取到了微信信息则将信息添加或更新到数据表
//        if(getUserInfo!=null) {
//        	WxuserInfo wxuserInfo = wxuserInfoService.findWxuserInfoByOpenid(userInfo.getOpenid());
//	        if(wxuserInfo==null){
//	        	//创建
//        		wxuserInfoService.add(getUserInfo);
//	        }else{
//	        	//更新
//	        	getUserInfo.setId(wxuserInfo.getId());
//	        	wxuserInfoService.update(getUserInfo);
//	        }
//        }
        
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("wxuserInfo", getUserInfo);
        responseEntity.setData(data);
		return responseEntity;
    }
    
    /**
     * 微信分享相关签名
     */
    @RequestMapping("getWinXinShareEntity")
    public @ResponseBody ResponseEntity getWinXinShareEntity(@RequestBody WxSharedEntity record) {
    	ResponseEntity responseEntity = new ResponseEntity();
		WxSharedEntity wx = CommonUtil.getWxSharedEntity(record.getSharedUrl());
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("record", wx);
        responseEntity.setData(data);
		return responseEntity;
	}
    
    /**
     * 微信获取token
     */
    @RequestMapping("getAccessToken")
    public @ResponseBody ResponseEntity getAccessToken() {
    	ResponseEntity responseEntity = new ResponseEntity();
		String token = CommonUtil.getAccessToken();
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("record", token);
        responseEntity.setData(data);
		return responseEntity;
	}
    
    @RequestMapping("pay")
	public ModelAndView pay(){
		ModelAndView mav = new ModelAndView("pay");
		return mav;
	}
//    @RequestMapping("wxpayRechargeRecord")
//	public @ResponseBody ResponseEntity wxpayRechargeRecord(@RequestBody RequestEntity requestEntity, HttpServletRequest request){
//    	ResponseEntity responseEntity = new ResponseEntity();
//    	// 发起微信支付
//    	WXPay wxpay = null;
//    	Map<String, Object> result = new HashMap<>();
//    	
//    	RechargeRecord rechargeRecord = requestEntity.getRechargeRecord();
//    	try {
//    	    // ******************************************
//    	    //
//    	    //  统一下单
//    	    //
//    	    // ******************************************
//    		String path = request.getSession().getServletContext().getRealPath("");
//    		MyConfig config = new MyConfig(path);
//    	    wxpay = new WXPay(config); // *** 注入自己实现的微信配置类, 创建WXPay核心类, WXPay 包括统一下单接口
//    	    Map<String, String> data = new HashMap<String, String>();
//    	    data.put("body", "充值费用");
//    	    data.put("out_trade_no", rechargeRecord.getRechargeNumber()); // 订单唯一编号, 不允许重复
//    	    data.put("total_fee", String.valueOf(rechargeRecord.getRechargeValue().multiply(new BigDecimal(100)).intValue())); // 订单金额, 单位分
//    	    String ip = IpKit.getRealIp(request);
//    		if (StringUtils.isEmpty(ip)) {
//    			ip = "127.0.0.1";
//    		}
//    		Long currentTime = System.currentTimeMillis();
//    	    data.put("spbill_create_ip", ip); // 下单ip
//    	    data.put("openid", rechargeRecord.getOpenid()); // 微信公众号统一标示openid
//    	    data.put("notify_url", "https://pay.chhtf.com/store/payCallback"); // 订单结果通知, 微信主动回调此接口
//    	    data.put("trade_type", "JSAPI"); // 固定填写
//    	    
//    	    logger.info("发起微信支付下单接口, request={}", data);
//    	    Map<String, String> response = wxpay.unifiedOrder(data); // 微信sdk集成方法, 统一下单接口unifiedOrder, 此处请求   MD5加密   加密方式
//    	    logger.info("微信支付下单成功, 返回值 response={}", response);
//    	    String returnCode = response.get("return_code");
//    	    if (!WXPayConstants.SUCCESS.equals(returnCode)) {
//    	        return responseEntity;
//    	    }
//    	    String resultCode = response.get("result_code");
//    	    if (!WXPayConstants.SUCCESS.equals(resultCode)) {
//    	        return responseEntity;
//    	    }
//    	    String prepay_id = response.get("prepay_id");
//    	    if (prepay_id == null) {
//    	        return responseEntity;
//    	    }
//    	    // ******************************************
//    	    //
//    	    //  前端调起微信支付必要参数
//    	    //
//    	    // ******************************************
//    	    String packages = "prepay_id=" + prepay_id;
//    	    String nonceStr = WXPayUtil.generateNonceStr();
//    	    Map<String, String> wxPayMap = new HashMap<String, String>();
//    	    wxPayMap.put("appId", config.getAppID());
//    	    wxPayMap.put("timeStamp", currentTime / 1000 + "");
//    	    wxPayMap.put("nonceStr", nonceStr);
//    	    wxPayMap.put("package", packages);
//    	    wxPayMap.put("signType", "MD5");
//    	    // 加密串中包括 appId timeStamp nonceStr package signType 5个参数, 通过sdk WXPayUtil类加密, 注意, 此处使用  MD5加密  方式
//    	    String packageSign = WXPayUtil.generateSignature(wxPayMap, config.getKey());
//
//    	    // ******************************************
//    	    //
//    	    //  返回给前端调起微信支付的必要参数
//    	    //
//    	    // ******************************************
//    	    result.put("appId", config.getAppID());
//    	    result.put("timeStamp", currentTime / 1000 + "");
//    	    result.put("nonceStr", nonceStr);
//    	    result.put("package", packages);
//    	    result.put("signType", "MD5");
//    	    result.put("paySign", packageSign);
//    	    responseEntity.setData(result);
//    	    
//    	    //向充值记录表添加信息，支付成功后更新success标记
//    	    rechargeRecordService.createRechargeRecord(rechargeRecord);
//    	    
//    	    return responseEntity;
//    	} catch (Exception e) {
//    		return responseEntity;
//    	}
//    }
    
    
    @RequestMapping(value = "/payCallback", method = RequestMethod.POST)
    public String payCallback(HttpServletRequest request, HttpServletResponse response) {
        logger.info("进入微信支付异步通知");
        String resXml="";
        try{
            //
            InputStream is = request.getInputStream();
            //将InputStream转换成String
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            StringBuilder sb = new StringBuilder();
            String line = null;
            try {
                while ((line = reader.readLine()) != null) {
                    sb.append(line + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            resXml=sb.toString();
            logger.info("微信支付异步通知请求包: {}", resXml);
            return wxTicketService.payBack(resXml,request);
        }catch (Exception e){
            logger.error("微信支付回调通知失败",e);
            String result = "<xml>" + "<return_code><![CDATA[FAIL]]></return_code>" + "<return_msg><![CDATA[报文为空]]></return_msg>" + "</xml> ";
            return result;
        }
    }

    /**
     * URL编码（utf-8）
     * 
     * @param source
     * @return
     */
    public static String urlEncodeUTF8(String source) {
        String result = source;
        try {
            result = java.net.URLEncoder.encode(source, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
