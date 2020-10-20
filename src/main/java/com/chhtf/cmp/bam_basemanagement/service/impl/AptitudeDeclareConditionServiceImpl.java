package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.AptitudeDeclareConditionService;
import com.chhtf.cmp.mapper.AptitudeDeclareConditionMapper;
import com.chhtf.cmp.pojo.AptitudeDeclareCondition;
import com.chhtf.cmp.pojo.AptitudeDeclareConditionExample;
import com.chhtf.cmp.pojo.AptitudeDeclareConditionExample.Criteria;
@Service
public class AptitudeDeclareConditionServiceImpl implements AptitudeDeclareConditionService {
	@Autowired
	AptitudeDeclareConditionMapper mapper;
	@Override
	public List<AptitudeDeclareCondition> list() {
		AptitudeDeclareConditionExample example = new AptitudeDeclareConditionExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(AptitudeDeclareCondition record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(AptitudeDeclareCondition record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public AptitudeDeclareCondition get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<AptitudeDeclareCondition> findListByCondition(AptitudeDeclareCondition condition) {
		AptitudeDeclareConditionExample example = new AptitudeDeclareConditionExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(condition.getStringField())) {
			criteria.andStringFieldLike(condition.getStringField());
		}
		if(condition.getIntField()!=null) {
			criteria.andIntFieldEqualTo(condition.getIntField());
		}
		return mapper.selectByExample(example);
	}
}
