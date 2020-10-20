package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.KnowledgePointService;
import com.chhtf.cmp.mapper.KnowledgePointMapper;
import com.chhtf.cmp.pojo.KnowledgePoint;
import com.chhtf.cmp.pojo.KnowledgePointExample;
import com.chhtf.cmp.pojo.KnowledgePointExample.Criteria;
@Service
public class KnowledgePointServiceImpl implements KnowledgePointService {
	@Autowired
	KnowledgePointMapper mapper;
	@Override
	public List<KnowledgePoint> list() {
		KnowledgePointExample example = new KnowledgePointExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(KnowledgePoint record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(KnowledgePoint record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public KnowledgePoint get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<KnowledgePoint> findListByCondition(KnowledgePoint condition) {
		KnowledgePointExample example = new KnowledgePointExample();
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
