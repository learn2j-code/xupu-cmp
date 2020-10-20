package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.bam_basemanagement.vo.TraineeInfoExtends;
import com.chhtf.cmp.pojo.TraineeInfo;

public interface TraineeInfoService {
	List<TraineeInfo> list();
	void add(TraineeInfo record);
	void update(TraineeInfo record);
	void delete(int id);
	TraineeInfo get(int id);
	
	List<TraineeInfo> findListByCondition(TraineeInfo condition);
	List<TraineeInfoExtends> packExtendsListFrom(List<TraineeInfo> list);
	//机构创建学员信息
	void agencyCreateTraineeInfo(TraineeInfoExtends record);
}
