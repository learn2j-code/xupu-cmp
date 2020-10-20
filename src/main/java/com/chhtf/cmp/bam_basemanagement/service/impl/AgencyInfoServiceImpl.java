package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.AgencyInfoService;
import com.chhtf.cmp.bam_basemanagement.service.UserInfoService;
import com.chhtf.cmp.bam_basemanagement.vo.AgencyInfoExtends;
import com.chhtf.cmp.mapper.AgencyInfoMapper;
import com.chhtf.cmp.pojo.AgencyInfo;
import com.chhtf.cmp.pojo.AgencyInfoExample;
import com.chhtf.cmp.pojo.AgencyInfoExample.Criteria;
import com.chhtf.cmp.pojo.UserInfo;
@Service
public class AgencyInfoServiceImpl implements AgencyInfoService {
	@Autowired
	AgencyInfoMapper mapper;
	@Autowired
	UserInfoService userInfoService;
	
	@Override
	public List<AgencyInfo> list() {
		AgencyInfoExample example = new AgencyInfoExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(AgencyInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(AgencyInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public AgencyInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<AgencyInfo> findListByCondition(AgencyInfo condition) {
		AgencyInfoExample example = new AgencyInfoExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(condition.getCompanyName())) {
			criteria.andCompanyNameLike(condition.getCompanyName()+"%");
		}
		if(StringUtils.isNotBlank(condition.getCompanyAddr())) {
			criteria.andCompanyAddrLike(condition.getCompanyAddr()+"%");
		}
		if(condition.getUserId()!=null) {
			criteria.andUserIdEqualTo(condition.getUserId());
		}
		if(condition.getAgencyType()!=null) {
			criteria.andAgencyTypeEqualTo(condition.getAgencyType());
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
	public List<AgencyInfoExtends> packExtendsListFrom(List<AgencyInfo> list) {
		List<AgencyInfoExtends> extendsList = new ArrayList<AgencyInfoExtends>();
		for(AgencyInfo agencyInfo:list) {
			AgencyInfoExtends agencyInfoExtends = new AgencyInfoExtends();
			BeanUtils.copyProperties(agencyInfo, agencyInfoExtends);
			if(agencyInfo.getUserId()!=null) {
				agencyInfoExtends.setUserInfo(userInfoService.get(agencyInfo.getUserId()));
			}
			extendsList.add(agencyInfoExtends);
		}
		return extendsList;
	}
}
