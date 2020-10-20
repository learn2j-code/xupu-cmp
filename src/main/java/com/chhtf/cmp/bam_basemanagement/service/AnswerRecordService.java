package com.chhtf.cmp.bam_basemanagement.service;

import java.util.List;

import com.chhtf.cmp.bam_basemanagement.vo.AnswerRecordExtends;
import com.chhtf.cmp.pojo.AnswerRecord;

public interface AnswerRecordService {
	List<AnswerRecord> list();
	void add(AnswerRecord record);
	void update(AnswerRecord record);
	void delete(int id);
	AnswerRecord get(int id);
	
	List<AnswerRecord> findListByCondition(AnswerRecord condition);
	
	void addAnswerRecord(AnswerRecordExtends answerRecordExtends);
	
	AnswerRecordExtends packExtendsFrom(AnswerRecord record);
}
