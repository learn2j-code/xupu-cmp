package com.chhtf.cmp.bam_weixinmanagement.util;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.URL;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.chhtf.cmp.bam_weixinmanagement.vo.MyX509TrustManager;
import com.chhtf.cmp.bam_weixinmanagement.vo.Token;
import com.chhtf.cmp.bam_weixinmanagement.vo.WxSharedEntity;
import com.chhtf.cmp.pojo.UserInfo;
import com.chhtf.cmp.pojo.WxuserInfo;



public class CommonUtil {
	private static Logger log = Logger.getLogger(CommonUtil.class);
	public static Token ACCESSTOKEN=null;
    // 凭证获取（GET）
    public final static String token_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";

    /**
     * 发送https请求
     * 
     * @param requestUrl 请求地址
     * @param requestMethod 请求方式（GET、POST）
     * @param outputStr 提交的数据
     * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值)
     */
    public static JSONObject httpsRequest(String requestUrl, String requestMethod, String outputStr) {
        JSONObject jsonObject = null;
        try {
            // 创建SSLContext对象，并使用我们指定的信任管理器初始化
            TrustManager[] tm = { new MyX509TrustManager() };
            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
            sslContext.init(null, tm, new java.security.SecureRandom());
            // 从上述SSLContext对象中得到SSLSocketFactory对象
            SSLSocketFactory ssf = sslContext.getSocketFactory();

            URL url = new URL(requestUrl);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setSSLSocketFactory(ssf);
            
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            // 设置请求方式（GET/POST）
            conn.setRequestMethod(requestMethod);

            // 当outputStr不为null时向输出流写数据
            if (null != outputStr) {
                OutputStream outputStream = conn.getOutputStream();
                // 注意编码格式
                outputStream.write(outputStr.getBytes("UTF-8"));
                outputStream.close();
            }

            // 从输入流读取返回内容
            InputStream inputStream = conn.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str = null;
            StringBuffer buffer = new StringBuffer();
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }

            // 释放资源
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            inputStream = null;
            conn.disconnect();
            jsonObject = JSONObject.parseObject(buffer.toString());
        } catch (ConnectException ce) {
            log.error("连接超时：{}", ce);
        } catch (Exception e) {
            log.error("https请求异常：{}", e);
        }
        return jsonObject;
    }

    /**
     * 获取接口访问凭证
     * 
     * @param appid 凭证
     * @param appsecret 密钥
     * @return
     */
    public static Token getToken(String appid, String appsecret) {
        Token token = null;
        String requestUrl = token_url.replace("APPID", appid).replace("APPSECRET", appsecret);
        // 发起GET请求获取凭证
        JSONObject jsonObject = httpsRequest(requestUrl, "GET", null);

        if (null != jsonObject) {
            try {
                token = new Token();
                token.setAccessToken(jsonObject.getString("access_token"));
                token.setExpiresIn(jsonObject.getIntValue("expires_in"));
            } catch (JSONException e) {
                token = null;
                // 获取token失败
                log.error("获取token失败 errcode:{} errmsg:{}"+ jsonObject.getInteger("errcode")+ jsonObject.getString("errmsg"));
            }
        }
        return token;
    }
    
    public static String getAccessToken(){
    	//获取当前时间，毫秒
    	Long ct = System.currentTimeMillis();
    	if(ACCESSTOKEN==null){
    		// 获取接口访问凭证
    		ACCESSTOKEN = CommonUtil.getToken(SignUtil.AppID, SignUtil.AppSecret);
    		ACCESSTOKEN.setEndTime(ct+7200*1000);
    	}else{
    		if(ACCESSTOKEN.getEndTime()<=ct){
    			ACCESSTOKEN = CommonUtil.getToken(SignUtil.AppID, SignUtil.AppSecret);
        		ACCESSTOKEN.setEndTime(ct+7200*1000);
    		}
    	}
    	return ACCESSTOKEN.getAccessToken();
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
    
    /**
     * 根据内容类型判断文件扩展名
     * 
     * @param contentType 内容类型
     * @return
     */
    public static String getFileExt(String contentType) {
        String fileExt = "";
        if ("image/jpeg".equals(contentType))
            fileExt = ".jpg";
        else if ("audio/mpeg".equals(contentType))
            fileExt = ".mp3";
        else if ("audio/amr".equals(contentType))
            fileExt = ".amr";
        else if ("video/mp4".equals(contentType))
            fileExt = ".mp4";
        else if ("video/mpeg4".equals(contentType))
            fileExt = ".mp4";
        return fileExt;
    }
    
    /**
     * 获取用户信息
     * 
     * @param accessToken 接口访问凭证
     * @param openId 用户标识
     * @return WxuserInfo
     */
    public static WxuserInfo getUserInfo(String accessToken, String openId) {
        WxuserInfo weixinUserInfo = null;
        // 拼接请求地址
        String requestUrl = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID";
        requestUrl = requestUrl.replace("ACCESS_TOKEN", accessToken).replace("OPENID", openId);
        // 获取用户信息
        JSONObject jsonObject = CommonUtil.httpsRequest(requestUrl, "GET", null);

        if (null != jsonObject) {
            try {
                weixinUserInfo = new WxuserInfo();
                // 用户的标识
                weixinUserInfo.setOpenid(jsonObject.getString("openid"));
                // 关注状态（1是关注，0是未关注），未关注时获取不到其余信息
                weixinUserInfo.setSubscribe(jsonObject.getInteger("subscribe"));
                // 用户关注时间
                weixinUserInfo.setSubscribeTime(jsonObject.getString("subscribe_time"));
                // 昵称
                weixinUserInfo.setNickname(jsonObject.getString("nickname"));
                // 用户的性别（1是男性，2是女性，0是未知）
                weixinUserInfo.setSex(jsonObject.getInteger("sex"));
                // 用户所在国家
                weixinUserInfo.setCountry(jsonObject.getString("country"));
                // 用户所在省份
                weixinUserInfo.setProvince(jsonObject.getString("province"));
                // 用户所在城市
                weixinUserInfo.setCity(jsonObject.getString("city"));
                // 用户的语言，简体中文为zh_CN
                weixinUserInfo.setLanguage(jsonObject.getString("language"));
                // 用户头像
                weixinUserInfo.setHeadimgurl(jsonObject.getString("headimgurl"));
                
//              System.out.println("OpenID：" + weixinUserInfo.getOpenid());
//              System.out.println("关注状态：" + weixinUserInfo.getSubscribe());
//              System.out.println("关注时间：" + weixinUserInfo.getSubscribeTime());
//              System.out.println("昵称：" + weixinUserInfo.getNickname());
//              System.out.println("性别：" + weixinUserInfo.getSex());
//              System.out.println("国家：" + weixinUserInfo.getCountry());
//              System.out.println("省份：" + weixinUserInfo.getProvince());
//              System.out.println("城市：" + weixinUserInfo.getCity());
//              System.out.println("语言：" + weixinUserInfo.getLanguage());
//              System.out.println("头像：" + weixinUserInfo.getHeadImgUrl());
            } catch (Exception e) {
                if (0 == weixinUserInfo.getSubscribe()) {
                    log.error("用户{}已取消关注" + weixinUserInfo.getOpenid());
                } else {
                    int errorCode = jsonObject.getInteger("errcode");
                    String errorMsg = jsonObject.getString("errmsg");
                    log.error("获取用户信息失败 errcode:{}" + errorCode+" errmsg:{}"+errorMsg);
                }
            }
        }
        return weixinUserInfo;
    }
    
    public static WxSharedEntity getWxSharedEntity(String url) {
    	WxSharedEntity wx = new WxSharedEntity();
		String access_token = getAccessToken();
		String ticket = getTicket(access_token);
		url = URIUtil.decodeURIComponent(url);
		Map<String, String> ret = SignUtil.sign(ticket, url);
		wx.setTicket(ret.get("jsapi_ticket"));
		wx.setSignature(ret.get("signature"));
		wx.setNoncestr(ret.get("nonceStr"));
		wx.setTimestamp(ret.get("timestamp"));
		return wx;
	}
    
    // 获取ticket
 	private static String getTicket(String access_token) {
 		String ticket = null;
 		try {
 			// 拼接请求地址
 	        String requestUrl = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=" + access_token + "&type=jsapi";// 这个url链接和参数不能变
 	        // 获取用户信息
 	        JSONObject jsonObject = CommonUtil.httpsRequest(requestUrl, "GET", null);
 	        if (null != jsonObject) {
 	        	ticket = jsonObject.getString("ticket");
 	        }
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 		return ticket;
 	}
    
    public static void main(String[] args) {
    	// 获取接口访问凭证
        String accessToken = CommonUtil.getToken(SignUtil.AppID, SignUtil.AppSecret).getAccessToken();
        /**
         * 获取用户信息
         */
        WxuserInfo user = getUserInfo(accessToken, "ovoh61i0wYIB4eTQAa4JzU2DAF48");//  28：ooK-yuJvd9gEegH6nRIen-gnLrVw
        System.out.println("OpenID：" + user.getOpenid());
        System.out.println("关注状态：" + user.getSubscribe());
        System.out.println("关注时间：" + user.getSubscribeTime());
        System.out.println("昵称：" + user.getNickname());
        System.out.println("性别：" + user.getSex());
        System.out.println("国家：" + user.getCountry());
        System.out.println("省份：" + user.getProvince());
        System.out.println("城市：" + user.getCity());
        System.out.println("语言：" + user.getLanguage());
        System.out.println("头像：" + user.getHeadimgurl());
	}
}
