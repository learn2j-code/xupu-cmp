package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.pojo.AptitudeDeclareCondition;


public interface AptitudeDeclareConditionService {
	List<AptitudeDeclareCondition> list();
	void add(AptitudeDeclareCondition record);
	void update(AptitudeDeclareCondition record);
	void delete(int id);
	AptitudeDeclareCondition get(int id);
	
	List<AptitudeDeclareCondition> findListByCondition(AptitudeDeclareCondition condition);
}
