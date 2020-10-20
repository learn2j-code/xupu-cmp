package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;
import com.chhtf.cmp.pojo.SubjectInfo;

public interface SubjectInfoService {
	List<SubjectInfo> list();
	void add(SubjectInfo record);
	void update(SubjectInfo record);
	void delete(int id);
	SubjectInfo get(int id);
	
	List<SubjectInfo> findListByCondition(SubjectInfo condition);
}
