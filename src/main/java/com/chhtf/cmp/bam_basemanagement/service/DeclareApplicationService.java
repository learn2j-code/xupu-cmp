package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.pojo.DeclareApplication;


public interface DeclareApplicationService {
	List<DeclareApplication> list();
	void add(DeclareApplication record);
	void update(DeclareApplication record);
	void delete(int id);
	DeclareApplication get(int id);
	
	List<DeclareApplication> findListByCondition(DeclareApplication condition);
}
