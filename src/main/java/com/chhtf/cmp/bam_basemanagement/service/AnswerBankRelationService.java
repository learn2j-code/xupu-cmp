package com.chhtf.cmp.bam_basemanagement.service;

import java.util.List;

import com.chhtf.cmp.bam_basemanagement.vo.AnswerBankRelationExtends;
import com.chhtf.cmp.pojo.AnswerBankRelation;

public interface AnswerBankRelationService {
	List<AnswerBankRelation> list();
	void add(AnswerBankRelation record);
	void update(AnswerBankRelation record);
	void delete(int id);
	AnswerBankRelation get(int id);
	
	List<AnswerBankRelation> findListByCondition(AnswerBankRelation condition);
	List<AnswerBankRelationExtends> packExtendsListFrom(List<AnswerBankRelation> list);
}
