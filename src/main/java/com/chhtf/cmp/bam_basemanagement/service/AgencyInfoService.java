package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.bam_basemanagement.vo.AgencyInfoExtends;
import com.chhtf.cmp.pojo.AgencyInfo;


public interface AgencyInfoService {
	List<AgencyInfo> list();
	void add(AgencyInfo record);
	void update(AgencyInfo record);
	void delete(int id);
	AgencyInfo get(int id);
	
	List<AgencyInfo> findListByCondition(AgencyInfo condition);
	List<AgencyInfoExtends> packExtendsListFrom(List<AgencyInfo> list);
}
