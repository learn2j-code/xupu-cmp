package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.DeclareApplicationService;
import com.chhtf.cmp.mapper.DeclareApplicationMapper;
import com.chhtf.cmp.pojo.DeclareApplication;
import com.chhtf.cmp.pojo.DeclareApplicationExample;
import com.chhtf.cmp.pojo.DeclareApplicationExample.Criteria;
@Service
public class DeclareApplicationServiceImpl implements DeclareApplicationService {
	@Autowired
	DeclareApplicationMapper mapper;
	@Override
	public List<DeclareApplication> list() {
		DeclareApplicationExample example = new DeclareApplicationExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(DeclareApplication record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(DeclareApplication record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public DeclareApplication get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<DeclareApplication> findListByCondition(DeclareApplication condition) {
		DeclareApplicationExample example = new DeclareApplicationExample();
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
