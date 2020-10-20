package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.bam_basemanagement.vo.TestApplicationExtends;
import com.chhtf.cmp.pojo.TestApplication;

public interface TestApplicationService {
	List<TestApplication> list();
	void add(TestApplication record);
	void update(TestApplication record);
	void delete(int id);
	TestApplication get(int id);
	
	List<TestApplication> findListByCondition(TestApplication condition);
	List<TestApplicationExtends> packExtendsListBy(List<TestApplication> list);
	TestApplicationExtends packExtendsBy(TestApplication record);
	
	//处理该申请
	//根据该申请的用户id和机构id找该学员，并更新该申请的学员id（trainee_id），如果没找到学员，则新建一条学员记录
	void dealwithTestApplication(TestApplication record);
}
