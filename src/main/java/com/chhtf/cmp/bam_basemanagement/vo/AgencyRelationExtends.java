package com.chhtf.cmp.bam_basemanagement.vo;

import com.chhtf.cmp.pojo.AgencyInfo;
import com.chhtf.cmp.pojo.AgencyRelation;
import com.chhtf.cmp.pojo.AptitudeInfo;
import com.chhtf.cmp.pojo.CertificateInfo;
import com.chhtf.cmp.pojo.SubjectInfo;

public class AgencyRelationExtends extends AgencyRelation {
	private CertificateInfo certificateInfo;
	private AptitudeInfo aptitudeInfo;
	private SubjectInfo subjectInfo;
	private AgencyInfo agencyInfo;
	public CertificateInfo getCertificateInfo() {
		return certificateInfo;
	}
	public void setCertificateInfo(CertificateInfo certificateInfo) {
		this.certificateInfo = certificateInfo;
	}
	public AptitudeInfo getAptitudeInfo() {
		return aptitudeInfo;
	}
	public void setAptitudeInfo(AptitudeInfo aptitudeInfo) {
		this.aptitudeInfo = aptitudeInfo;
	}
	public SubjectInfo getSubjectInfo() {
		return subjectInfo;
	}
	public void setSubjectInfo(SubjectInfo subjectInfo) {
		this.subjectInfo = subjectInfo;
	}
	public AgencyInfo getAgencyInfo() {
		return agencyInfo;
	}
	public void setAgencyInfo(AgencyInfo agencyInfo) {
		this.agencyInfo = agencyInfo;
	}
	
}
