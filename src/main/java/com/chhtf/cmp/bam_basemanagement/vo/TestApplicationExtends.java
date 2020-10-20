package com.chhtf.cmp.bam_basemanagement.vo;

import com.chhtf.cmp.pojo.AgencyInfo;
import com.chhtf.cmp.pojo.CertificateInfo;
import com.chhtf.cmp.pojo.EmployeeInfo;
import com.chhtf.cmp.pojo.TestApplication;
import com.chhtf.cmp.pojo.TraineeInfo;
import com.chhtf.cmp.pojo.UserInfo;

public class TestApplicationExtends  extends TestApplication {
	private CertificateInfo certificateInfo;
	private TraineeInfo traineeInfo;
	private UserInfo userInfo;
	private AgencyInfo agencyInfo;
	private EmployeeInfo employeeInfo;
	public CertificateInfo getCertificateInfo() {
		return certificateInfo;
	}
	public void setCertificateInfo(CertificateInfo certificateInfo) {
		this.certificateInfo = certificateInfo;
	}
	public TraineeInfo getTraineeInfo() {
		return traineeInfo;
	}
	public void setTraineeInfo(TraineeInfo traineeInfo) {
		this.traineeInfo = traineeInfo;
	}
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
	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}
	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}
}
