package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.EmployeeInfoService;
import com.chhtf.cmp.bam_basemanagement.service.TraineeInfoService;
import com.chhtf.cmp.bam_basemanagement.service.UserInfoService;
import com.chhtf.cmp.bam_basemanagement.vo.TraineeInfoExtends;
import com.chhtf.cmp.mapper.TraineeInfoMapper;
import com.chhtf.cmp.pojo.EmployeeInfo;
import com.chhtf.cmp.pojo.TraineeInfo;
import com.chhtf.cmp.pojo.TraineeInfoExample;
import com.chhtf.cmp.pojo.TraineeInfoExample.Criteria;
import com.chhtf.cmp.pojo.UserInfo;
@Service
public class TraineeInfoServiceImpl implements TraineeInfoService {
	@Autowired
	TraineeInfoMapper mapper;
	@Autowired
	UserInfoService userInfoService;
	@Autowired
	EmployeeInfoService employeeInfoService;
	@Override
	public List<TraineeInfo> list() {
		TraineeInfoExample example = new TraineeInfoExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(TraineeInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(TraineeInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public TraineeInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<TraineeInfo> findListByCondition(TraineeInfo condition) {
		TraineeInfoExample example = new TraineeInfoExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(condition.getTraineeName())) {
			criteria.andTraineeNameLike(condition.getTraineeName()+"%");
		}
		if(StringUtils.isNotBlank(condition.getPhone())) {
			criteria.andPhoneEqualTo(condition.getPhone());
		}
		if(condition.getAgencyId()!=null&&condition.getAgencyId()>=0) {
			criteria.andAgencyIdEqualTo(condition.getAgencyId());
		}
		if(condition.getUserId()!=null&&condition.getUserId()>=0) {
			criteria.andUserIdEqualTo(condition.getUserId());
		}
		if(condition.getEmployeeId()!=null&&condition.getEmployeeId()>=0) {
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
	public void agencyCreateTraineeInfo(TraineeInfoExtends record) {
		// 根据学员的姓名和手机号（用户的昵称也用姓名），先创建对应的用户记录，再创建一条对应对学员记录
		UserInfo userInfo = userInfoService.findUserInfoByPhone(record.getPhone());
		if(userInfo==null) {
			userInfo = new UserInfo();
			userInfo.setPhone(record.getPhone());
			userInfo.setName(record.getUserName());
			userInfo.setNickName(record.getUserName());
			userInfo.setUserType("E");
			userInfoService.add(userInfo);
		}
		record.setUserId(userInfo.getId());
		add(record);
	}

	@Override
	public List<TraineeInfoExtends> packExtendsListFrom(List<TraineeInfo> list) {
		List<TraineeInfoExtends> extendsList = new ArrayList<TraineeInfoExtends>();
		for(TraineeInfo traineeInfo:list) {
			TraineeInfoExtends traineeInfoExtends = new TraineeInfoExtends();
			BeanUtils.copyProperties(traineeInfo, traineeInfoExtends);
			if(traineeInfo.getEmployeeId()!=null) {
				EmployeeInfo employeeInfo = employeeInfoService.get(traineeInfo.getEmployeeId());
				traineeInfoExtends.setEmployeeInfo(employeeInfo);
			}
			extendsList.add(traineeInfoExtends);
		}
		return extendsList;
	}
}
