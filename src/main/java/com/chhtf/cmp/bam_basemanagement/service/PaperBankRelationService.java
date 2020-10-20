package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.pojo.PaperBankRelation;


public interface PaperBankRelationService {
	List<PaperBankRelation> list();
	void add(PaperBankRelation record);
	void update(PaperBankRelation record);
	void delete(int id);
	PaperBankRelation get(int id);
	
	List<PaperBankRelation> findListByCondition(PaperBankRelation condition);
	void addList(List<PaperBankRelation> paperBankRelationList);
	
	void deleteListByCondition(PaperBankRelation condition);
	
	List<Integer> findBankIdListBy(Integer paperId,Integer userId);
}
