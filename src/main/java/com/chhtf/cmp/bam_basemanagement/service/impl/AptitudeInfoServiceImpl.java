package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.AptitudeInfoService;
import com.chhtf.cmp.mapper.AptitudeInfoMapper;
import com.chhtf.cmp.pojo.AptitudeInfo;
import com.chhtf.cmp.pojo.AptitudeInfoExample;
import com.chhtf.cmp.pojo.AptitudeInfoExample.Criteria;
@Service
public class AptitudeInfoServiceImpl implements AptitudeInfoService {
	@Autowired
	AptitudeInfoMapper mapper;
	@Override
	public List<AptitudeInfo> list() {
		AptitudeInfoExample example = new AptitudeInfoExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(AptitudeInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(AptitudeInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public AptitudeInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<AptitudeInfo> findListByCondition(AptitudeInfo condition) {
		AptitudeInfoExample example = new AptitudeInfoExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		
		if(condition.getLowerLimit()!=null&&condition.getLowerLimit()>0) {
			criteria.andTotalQuestionGreaterThanOrEqualTo(condition.getLowerLimit());
		}
		
		if(StringUtils.isNotBlank(condition.getAptitudeName())) {
			criteria.andAptitudeNameLike("%"+condition.getAptitudeName()+"%");
		}
		if(condition.getNoQuestion()!=null) {
			criteria.andNoQuestionEqualTo(condition.getNoQuestion());
		}
		if(StringUtils.isNotBlank(condition.getStringField())) {
			criteria.andStringFieldLike(condition.getStringField());
		}
		if(condition.getIntField()!=null) {
			criteria.andIntFieldEqualTo(condition.getIntField());
		}
		return mapper.selectByExample(example);
	}
}
