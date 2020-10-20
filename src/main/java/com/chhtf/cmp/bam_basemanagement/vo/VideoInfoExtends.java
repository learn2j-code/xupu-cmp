package com.chhtf.cmp.bam_basemanagement.vo;

import java.util.List;

import com.chhtf.cmp.pojo.EmployeeInfo;
import com.chhtf.cmp.pojo.VideoInfo;

public class VideoInfoExtends extends VideoInfo {
	private ExaminationPaperExtends examinationPaper;
	private EmployeeInfo employeeInfo;

	public ExaminationPaperExtends getExaminationPaper() {
		return examinationPaper;
	}

	public void setExaminationPaper(ExaminationPaperExtends examinationPaper) {
		this.examinationPaper = examinationPaper;
	}

	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

}
