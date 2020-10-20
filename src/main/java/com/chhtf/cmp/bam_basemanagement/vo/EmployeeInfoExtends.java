package com.chhtf.cmp.bam_basemanagement.vo;

import com.chhtf.cmp.pojo.AgencyInfo;
import com.chhtf.cmp.pojo.EmployeeInfo;
import com.chhtf.cmp.pojo.UserInfo;

public class EmployeeInfoExtends extends EmployeeInfo {
	private UserInfo userInfo;
	private AgencyInfo agencyInfo;
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public AgencyInfo getAgencyInfo() {
		return agencyInfo;
	}
	public void setAgencyInfo(AgencyInfo agencyInfo) {
		this.agencyInfo = agencyInfo;
	}
}
