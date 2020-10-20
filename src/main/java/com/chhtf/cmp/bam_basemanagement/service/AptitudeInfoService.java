package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.pojo.AptitudeInfo;


public interface AptitudeInfoService {
	List<AptitudeInfo> list();
	void add(AptitudeInfo record);
	void update(AptitudeInfo record);
	void delete(int id);
	AptitudeInfo get(int id);
	
	List<AptitudeInfo> findListByCondition(AptitudeInfo condition);
}
