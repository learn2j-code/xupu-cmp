package com.chhtf.cmp.bam_basemanagement.vo;

import com.chhtf.cmp.pojo.UserInfo;

public class UserInfoExtends extends UserInfo {
	private String relationType;

    private Integer relaterId;

	public String getRelationType() {
		return relationType;
	}

	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public Integer getRelaterId() {
		return relaterId;
	}

	public void setRelaterId(Integer relaterId) {
		this.relaterId = relaterId;
	} 
}
