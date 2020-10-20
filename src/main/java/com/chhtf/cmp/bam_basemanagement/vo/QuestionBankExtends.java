package com.chhtf.cmp.bam_basemanagement.vo;

import java.util.List;

import com.chhtf.cmp.pojo.QuestionBank;
import com.chhtf.cmp.pojo.QuestionOption;

public class QuestionBankExtends extends QuestionBank {
	private String entityName;
	private List<QuestionOption> optionList;
	private List<Integer> notInIdList;
	public List<QuestionOption> getOptionList() {
		return optionList;
	}
	public void setOptionList(List<QuestionOption> optionList) {
		this.optionList = optionList;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public List<Integer> getNotInIdList() {
		return notInIdList;
	}
	public void setNotInIdList(List<Integer> notInIdList) {
		this.notInIdList = notInIdList;
	}
}
