package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.pojo.CertificateExamCondition;


public interface CertificateExamConditionService {
	List<CertificateExamCondition> list();
	void add(CertificateExamCondition record);
	void update(CertificateExamCondition record);
	void delete(int id);
	CertificateExamCondition get(int id);
	
	List<CertificateExamCondition> findListByCondition(CertificateExamCondition condition);
}
