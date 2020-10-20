package com.chhtf.cmp.bam_basemanagement.vo;

import com.chhtf.cmp.pojo.PaperBankRelation;
import com.chhtf.cmp.pojo.QuestionBank;

public class PaperBankRelationExtends extends PaperBankRelation {
	private QuestionBank questionBank;

	public QuestionBank getQuestionBank() {
		return questionBank;
	}

	public void setQuestionBank(QuestionBank questionBank) {
		this.questionBank = questionBank;
	}
}
