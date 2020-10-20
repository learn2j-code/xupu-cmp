package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.pojo.QuestionOption;


public interface QuestionOptionService {
	List<QuestionOption> list();
	void add(QuestionOption record);
	void update(QuestionOption record);
	void delete(int id);
	QuestionOption get(int id);
	
	List<QuestionOption> findListByCondition(QuestionOption condition);
}
