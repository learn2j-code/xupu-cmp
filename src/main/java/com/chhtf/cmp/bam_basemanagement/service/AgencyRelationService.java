package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.bam_basemanagement.vo.AgencyRelationExtends;
import com.chhtf.cmp.bam_basemanagement.vo.CertificateInfoExtends;
import com.chhtf.cmp.pojo.AgencyRelation;

public interface AgencyRelationService {
	List<AgencyRelation> list();
	void add(AgencyRelation record);
	void update(AgencyRelation record);
	void delete(int id);
	AgencyRelation get(int id);
	
	List<AgencyRelation> findListByCondition(AgencyRelation condition);
	List<AgencyRelationExtends> packageExtendsListFrom(List<AgencyRelation> list);
	void deleteRecordByRelaterIdAndType(Integer relaterId,String relaterType);
	
	void addAgencyRelationListBy(List<CertificateInfoExtends> certificateInfoList);
}
