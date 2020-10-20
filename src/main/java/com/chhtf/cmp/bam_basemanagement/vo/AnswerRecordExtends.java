package com.chhtf.cmp.bam_basemanagement.vo;

import java.util.List;

import com.chhtf.cmp.pojo.AnswerRecord;

public class AnswerRecordExtends extends AnswerRecord {
	private List<AnswerBankRelationExtends> answerBankRelationList;

	public List<AnswerBankRelationExtends> getAnswerBankRelationList() {
		return answerBankRelationList;
	}

	public void setAnswerBankRelationList(List<AnswerBankRelationExtends> answerBankRelationList) {
		this.answerBankRelationList = answerBankRelationList;
	}
}
