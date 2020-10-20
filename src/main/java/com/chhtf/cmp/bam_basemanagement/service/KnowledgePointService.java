package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.pojo.KnowledgePoint;


public interface KnowledgePointService {
	List<KnowledgePoint> list();
	void add(KnowledgePoint record);
	void update(KnowledgePoint record);
	void delete(int id);
	KnowledgePoint get(int id);
	
	List<KnowledgePoint> findListByCondition(KnowledgePoint condition);
}
