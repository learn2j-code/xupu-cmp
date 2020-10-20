package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.bam_basemanagement.vo.FollowRecordExtends;
import com.chhtf.cmp.pojo.FollowRecord;


public interface FollowRecordService {
	List<FollowRecord> list();
	void add(FollowRecord record);
	void update(FollowRecord record);
	void delete(int id);
	FollowRecord get(int id);
	
	List<FollowRecord> findListByCondition(FollowRecord condition);
	
	List<FollowRecordExtends> packExtendsListFrom(List<FollowRecord> list);
}
