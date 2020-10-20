package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.AgencyInfoService;
import com.chhtf.cmp.bam_basemanagement.service.EmployeeInfoService;
import com.chhtf.cmp.bam_basemanagement.service.FollowRecordService;
import com.chhtf.cmp.bam_basemanagement.service.TraineeInfoService;
import com.chhtf.cmp.bam_basemanagement.service.UserInfoService;
import com.chhtf.cmp.bam_basemanagement.vo.FollowRecordExtends;
import com.chhtf.cmp.mapper.FollowRecordMapper;
import com.chhtf.cmp.pojo.FollowRecord;
import com.chhtf.cmp.pojo.FollowRecordExample;
import com.chhtf.cmp.pojo.FollowRecordExample.Criteria;
@Service
public class FollowRecordServiceImpl implements FollowRecordService {
	@Autowired
	FollowRecordMapper mapper;
	
	@Autowired
	TraineeInfoService traineeInfoService;
	@Autowired
	AgencyInfoService agencyInfoService;
	@Autowired
	EmployeeInfoService employeeInfoService;
	@Override
	public List<FollowRecord> list() {
		FollowRecordExample example = new FollowRecordExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(FollowRecord record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(FollowRecord record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public FollowRecord get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<FollowRecord> findListByCondition(FollowRecord condition) {
		FollowRecordExample example = new FollowRecordExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		
		if(condition.getAgencyId()!=null) {
			criteria.andAgencyIdEqualTo(condition.getAgencyId());
		}
		if(condition.getTraineeId()!=null) {
			criteria.andTraineeIdEqualTo(condition.getTraineeId());
		}
		if(condition.getEmployeeId()!=null) {
			criteria.andEmployeeIdEqualTo(condition.getEmployeeId());
		}
		if(StringUtils.isNotBlank(condition.getStringField())) {
			criteria.andStringFieldLike(condition.getStringField());
		}
		if(condition.getIntField()!=null) {
			criteria.andIntFieldEqualTo(condition.getIntField());
		}
		return mapper.selectByExample(example);
	}

	@Override
	public List<FollowRecordExtends> packExtendsListFrom(List<FollowRecord> list) {
		List<FollowRecordExtends> extendsList = new ArrayList<FollowRecordExtends>();
		for(FollowRecord followRecord:list) {
			FollowRecordExtends followRecordExtends = new FollowRecordExtends();
			BeanUtils.copyProperties(followRecord, followRecordExtends);
			if(followRecord.getAgencyId()!=null) {
				followRecordExtends.setAgencyInfo(agencyInfoService.get(followRecord.getAgencyId()));
			}
			if(followRecord.getTraineeId()!=null) {
				followRecordExtends.setTraineeInfo(traineeInfoService.get(followRecord.getTraineeId()));
			}
			if(followRecord.getEmployeeId()!=null) {
				followRecordExtends.setEmployeeInfo(employeeInfoService.get(followRecord.getEmployeeId()));
			}
			extendsList.add(followRecordExtends);
		}
		return extendsList;
	}
}
