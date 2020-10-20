package com.chhtf.cmp.bam_weixinmanagement.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.servlet.ServletContext;

import com.chhtf.cmp.bam_weixinmanagement.util.sdk.IWXPayDomain;
import com.chhtf.cmp.bam_weixinmanagement.util.sdk.WXPayConfig;
import com.chhtf.cmp.bam_weixinmanagement.util.sdk.WXPayConstants;


public class MyConfig extends WXPayConfig{

    private byte[] certData;

    public MyConfig(String path) throws Exception {
//    	String path=System.getProperty("catalina.home");
    	System.out.println(path);
//    	String certPath=MyConfig.class.getResource("/").toString();
//    	System.out.println(certPath);
//    	String path1=System.getProperty("user.dir");
//    	System.out.println(path1);
        String certPath = path+"/WEB-INF/apiclient_cert.p12";
        File file = new File(certPath);
        InputStream certStream = new FileInputStream(file);
        this.certData = new byte[(int) file.length()];
        certStream.read(this.certData);
        certStream.close();
    }

    public String getAppID() {
        return "wx8601730651ff2073";
    }

    public String getMchID() {
        return "1484631372";
    }

    //API 密钥
    public String getKey() {
        return "WxBb1234AaBb12341234AaBbAaBb1234";
    }

    public InputStream getCertStream() {
        ByteArrayInputStream certBis = new ByteArrayInputStream(this.certData);
        return certBis;
    }

    public int getHttpConnectTimeoutMs() {
        return 8000;
    }

    public int getHttpReadTimeoutMs() {
        return 10000;
    }

	@Override
	public IWXPayDomain getWXPayDomain() {
		IWXPayDomain iwxPayDomain = new IWXPayDomain() {
            @Override
            public void report(String domain, long elapsedTimeMillis, Exception ex) {

            }
            @Override
            public DomainInfo getDomain(WXPayConfig config) {
                return new IWXPayDomain.DomainInfo(WXPayConstants.DOMAIN_API, true);
            }
        };
        return iwxPayDomain;
	}
}
