package com.chhtf.cmp.bam_weixinmanagement.vo;

public class Token {
	// 接口访问凭证
    private String accessToken;
    // 凭证有效期，单位：秒
    private int expiresIn;
    // 到期时间，单位毫秒
    private Long endTime;
    
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

	public Long getEndTime() {
		return endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}
}
