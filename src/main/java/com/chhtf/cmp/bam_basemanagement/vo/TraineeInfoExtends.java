package com.chhtf.cmp.bam_basemanagement.vo;

import com.chhtf.cmp.pojo.EmployeeInfo;
import com.chhtf.cmp.pojo.TraineeInfo;

public class TraineeInfoExtends extends TraineeInfo {
	private String userName;
	private EmployeeInfo employeeInfo;
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}
}
