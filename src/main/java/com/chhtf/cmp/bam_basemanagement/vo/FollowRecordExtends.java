package com.chhtf.cmp.bam_basemanagement.vo;

import com.chhtf.cmp.pojo.AgencyInfo;
import com.chhtf.cmp.pojo.EmployeeInfo;
import com.chhtf.cmp.pojo.FollowRecord;
import com.chhtf.cmp.pojo.TraineeInfo;

public class FollowRecordExtends extends FollowRecord {
	private TraineeInfo traineeInfo;
	private EmployeeInfo employeeInfo;
	private AgencyInfo agencyInfo;
	public TraineeInfo getTraineeInfo() {
		return traineeInfo;
	}
	public void setTraineeInfo(TraineeInfo traineeInfo) {
		this.traineeInfo = traineeInfo;
	}
	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}
	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}
	public AgencyInfo getAgencyInfo() {
		return agencyInfo;
	}
	public void setAgencyInfo(AgencyInfo agencyInfo) {
		this.agencyInfo = agencyInfo;
	}
}
