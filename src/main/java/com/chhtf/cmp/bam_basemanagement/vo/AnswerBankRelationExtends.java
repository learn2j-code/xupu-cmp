package com.chhtf.cmp.bam_basemanagement.vo;

import com.chhtf.cmp.pojo.AnswerBankRelation;
import com.chhtf.cmp.pojo.QuestionBank;

public class AnswerBankRelationExtends extends AnswerBankRelation {
	private QuestionBank questionBank;

	public QuestionBank getQuestionBank() {
		return questionBank;
	}

	public void setQuestionBank(QuestionBank questionBank) {
		this.questionBank = questionBank;
	}
}
