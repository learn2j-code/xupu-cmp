package com.chhtf.cmp.bam_weixinmanagement.service.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_weixinmanagement.service.WxTicketService;
import com.chhtf.cmp.bam_weixinmanagement.util.MyConfig;
import com.chhtf.cmp.bam_weixinmanagement.util.sdk.WXPay;
import com.chhtf.cmp.bam_weixinmanagement.util.sdk.WXPayUtil;


@Service
public class WxTicketServiceImpl implements WxTicketService {
	Logger logger = LoggerFactory.getLogger("WxTicketService");
//	@Autowired
//	WXPayConfig iWxPayConfig;
	
	@Override
	public String payBack(String notifyData,HttpServletRequest request) {
		logger.info("payBack() start, notifyData={}", notifyData);
        String xmlBack="";
        Map<String, String> notifyMap = null;
        try {
        	String path = request.getSession().getServletContext().getRealPath("");
        	MyConfig config = new MyConfig(path);
            WXPay wxpay = new WXPay(config);

            notifyMap = WXPayUtil.xmlToMap(notifyData);         // 转换成map
            if (wxpay.isPayResultNotifySignatureValid(notifyMap)) {
                // 签名正确
                // 进行处理。
                // 注意特殊情况：订单已经退款，但收到了支付结果成功的通知，不应把商户侧订单状态从退款改成支付成功
                String return_code = notifyMap.get("return_code");//状态
                String rechargeNumber = notifyMap.get("out_trade_no");//订单号

                if (rechargeNumber == null) {
                    logger.info("微信支付回调失败订单号: {}", notifyMap);
                    xmlBack = "<xml>" + "<return_code><![CDATA[FAIL]]></return_code>" + "<return_msg><![CDATA[报文为空]]></return_msg>" + "</xml> ";
                    return xmlBack;
                }

                //根据充值单号，更新订单状态为已支付
                String updatePaymentStatus = "https://pay.chhtf.com/store/rechargerecord/updatePaymentStatusByRechargeNumber"
                        + "?rechargeNumber=" + rechargeNumber;
                try{
            		//发送请求获取返回参数，使用java原生实现，可以使用httpclient或者第三方库实现
            		URL getOpenidUrl = new URL(updatePaymentStatus);
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
        		 
//        			//返回的参数是json格式
//        			JSONObject openidJson = JSONObject.parseObject(openidStringBuffer.toString());
//        			if(openidJson.containsKey("openid")){
//        				openId = openidJson.getString("openid");
//        				wechartInfo.setOpenid(openId);
//        			}
        		}catch(Exception e){
        		    //连接异常，请求异常，或者json返回值异常均需要处理
        		}
                
                
                
                // 业务逻辑处理 ****************************
                logger.info("微信支付回调成功订单号: {}", notifyMap);
                xmlBack = "<xml>" + "<return_code><![CDATA[SUCCESS]]></return_code>" + "<return_msg><![CDATA[SUCCESS]]></return_msg>" + "</xml> ";
                return xmlBack;
            } else {
                logger.error("微信支付回调通知签名错误");
                xmlBack = "<xml>" + "<return_code><![CDATA[FAIL]]></return_code>" + "<return_msg><![CDATA[报文为空]]></return_msg>" + "</xml> ";
                return xmlBack;
            }
        } catch (Exception e) {
            logger.error("微信支付回调通知失败",e);
            xmlBack = "<xml>" + "<return_code><![CDATA[FAIL]]></return_code>" + "<return_msg><![CDATA[报文为空]]></return_msg>" + "</xml> ";
        }
        return xmlBack;
	}
	public static void main(String[] args) {
		//根据订单号，更新订单状态为已支付
        String updatePaymentStatus = "http://window.100tp.cn:8880/fmp/householdpayment/updateHouseholdPaymentByOutTradeNo"
                + "?outTradeNo=" + 123;
        try{
    		//发送请求获取返回参数，使用java原生实现，可以使用httpclient或者第三方库实现
    		URL getOpenidUrl = new URL(updatePaymentStatus);
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
		 
//			//返回的参数是json格式
//			JSONObject openidJson = JSONObject.parseObject(openidStringBuffer.toString());
//			if(openidJson.containsKey("openid")){
//				openId = openidJson.getString("openid");
//				wechartInfo.setOpenid(openId);
//			}
		}catch(Exception e){
		    //连接异常，请求异常，或者json返回值异常均需要处理
		}
	}
}