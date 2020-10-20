package com.chhtf.cmp.bam_basemanagement.vo;

import java.util.List;

import com.chhtf.cmp.pojo.ExaminationPaper;
import com.chhtf.cmp.pojo.PaperBankRelation;
import com.chhtf.cmp.pojo.QuestionBank;

public class ExaminationPaperExtends extends ExaminationPaper{
	private Integer questionNum;
	private List<PaperBankRelation> paperBankRelationList;
	private List<QuestionBankExtends> questionBankList;

	public List<PaperBankRelation> getPaperBankRelationList() {
		return paperBankRelationList;
	}

	public void setPaperBankRelationList(List<PaperBankRelation> paperBankRelationList) {
		this.paperBankRelationList = paperBankRelationList;
	}

	public List<QuestionBankExtends> getQuestionBankList() {
		return questionBankList;
	}

	public void setQuestionBankList(List<QuestionBankExtends> questionBankList) {
		this.questionBankList = questionBankList;
	}

	public Integer getQuestionNum() {
		return questionNum;
	}

	public void setQuestionNum(Integer questionNum) {
		this.questionNum = questionNum;
	}
}
