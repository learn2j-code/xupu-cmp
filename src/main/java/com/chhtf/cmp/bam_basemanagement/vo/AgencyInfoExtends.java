package com.chhtf.cmp.bam_basemanagement.vo;

import com.chhtf.cmp.pojo.AgencyInfo;
import com.chhtf.cmp.pojo.UserInfo;

public class AgencyInfoExtends extends AgencyInfo {
	private UserInfo userInfo;

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
}
