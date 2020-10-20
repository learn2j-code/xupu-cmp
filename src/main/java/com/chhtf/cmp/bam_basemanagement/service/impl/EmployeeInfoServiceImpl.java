package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.AgencyInfoService;
import com.chhtf.cmp.bam_basemanagement.service.EmployeeInfoService;
import com.chhtf.cmp.bam_basemanagement.service.UserInfoService;
import com.chhtf.cmp.bam_basemanagement.vo.AgencyInfoExtends;
import com.chhtf.cmp.bam_basemanagement.vo.EmployeeInfoExtends;
import com.chhtf.cmp.mapper.EmployeeInfoMapper;
import com.chhtf.cmp.pojo.AgencyInfo;
import com.chhtf.cmp.pojo.EmployeeInfo;
import com.chhtf.cmp.pojo.EmployeeInfoExample;
import com.chhtf.cmp.pojo.EmployeeInfoExample.Criteria;
@Service
public class EmployeeInfoServiceImpl implements EmployeeInfoService {
	@Autowired
	EmployeeInfoMapper mapper;
	@Autowired
	UserInfoService userInfoService;
	@Autowired
	AgencyInfoService agencyInfoService;
	@Override
	public List<EmployeeInfo> list() {
		EmployeeInfoExample example = new EmployeeInfoExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(EmployeeInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(EmployeeInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public EmployeeInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<EmployeeInfo> findListByCondition(EmployeeInfo condition) {
		EmployeeInfoExample example = new EmployeeInfoExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		
		if(StringUtils.isNotBlank(condition.getEmployeeNo())) {
			criteria.andEmployeeNoLike(condition.getEmployeeNo()+"%");
		}
		if(StringUtils.isNotBlank(condition.getEmployeeName())) {
			criteria.andEmployeeNameLike(condition.getEmployeeName()+"%");
		}
		if(StringUtils.isNotBlank(condition.getPhone())) {
			criteria.andPhoneLike(condition.getPhone()+"%");
		}
		
		if(condition.getAgencyId()!=null) {
			criteria.andAgencyIdEqualTo(condition.getAgencyId());
		}
		if(condition.getUserId()!=null) {
			criteria.andUserIdEqualTo(condition.getUserId());
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
	public List<EmployeeInfoExtends> packExtendsListFrom(List<EmployeeInfo> list) {
		List<EmployeeInfoExtends> extendsList = new ArrayList<EmployeeInfoExtends>();
		for(EmployeeInfo employeeInfo:list) {
			EmployeeInfoExtends employeeInfoExtends = new EmployeeInfoExtends();
			BeanUtils.copyProperties(employeeInfo, employeeInfoExtends);
			if(employeeInfo.getUserId()!=null) {
				employeeInfoExtends.setUserInfo(userInfoService.get(employeeInfo.getUserId()));
			}
			if(employeeInfo.getAgencyId()!=null) {
				employeeInfoExtends.setAgencyInfo(agencyInfoService.get(employeeInfo.getAgencyId()));
			}
			extendsList.add(employeeInfoExtends);
		}
		return extendsList;
	}
}
