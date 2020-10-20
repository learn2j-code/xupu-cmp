package com.chhtf.cmp.bam_basemanagement.vo;

import com.chhtf.cmp.pojo.CertificateInfo;

public class CertificateInfoExtends extends CertificateInfo {
	private Integer agencyId;
	private String location;
	private String relationType;
	private Integer relaterId;
	public Integer getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Integer agencyId) {
		this.agencyId = agencyId;
	}

	public String getRelationType() {
		return relationType;
	}

	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getRelaterId() {
		return relaterId;
	}

	public void setRelaterId(Integer relaterId) {
		this.relaterId = relaterId;
	}

}
