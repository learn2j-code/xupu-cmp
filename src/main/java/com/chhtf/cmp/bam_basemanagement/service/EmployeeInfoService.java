package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.bam_basemanagement.vo.EmployeeInfoExtends;
import com.chhtf.cmp.pojo.EmployeeInfo;


public interface EmployeeInfoService {
	List<EmployeeInfo> list();
	void add(EmployeeInfo record);
	void update(EmployeeInfo record);
	void delete(int id);
	EmployeeInfo get(int id);
	
	List<EmployeeInfo> findListByCondition(EmployeeInfo condition);
	List<EmployeeInfoExtends> packExtendsListFrom(List<EmployeeInfo> list);
}
