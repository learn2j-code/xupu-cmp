package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.QuestionOptionService;
import com.chhtf.cmp.mapper.QuestionOptionMapper;
import com.chhtf.cmp.pojo.QuestionOption;
import com.chhtf.cmp.pojo.QuestionOptionExample;
import com.chhtf.cmp.pojo.QuestionOptionExample.Criteria;
@Service
public class QuestionOptionServiceImpl implements QuestionOptionService {
	@Autowired
	QuestionOptionMapper mapper;
	@Override
	public List<QuestionOption> list() {
		QuestionOptionExample example = new QuestionOptionExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(QuestionOption record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(QuestionOption record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public QuestionOption get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<QuestionOption> findListByCondition(QuestionOption condition) {
		QuestionOptionExample example = new QuestionOptionExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(condition.getBankId()!=null) {
			criteria.andBankIdEqualTo(condition.getBankId());
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
