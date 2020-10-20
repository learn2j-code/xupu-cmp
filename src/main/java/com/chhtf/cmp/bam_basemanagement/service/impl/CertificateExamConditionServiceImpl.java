package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.CertificateExamConditionService;
import com.chhtf.cmp.mapper.CertificateExamConditionMapper;
import com.chhtf.cmp.pojo.CertificateExamCondition;
import com.chhtf.cmp.pojo.CertificateExamConditionExample;
import com.chhtf.cmp.pojo.CertificateExamConditionExample.Criteria;
@Service
public class CertificateExamConditionServiceImpl implements CertificateExamConditionService {
	@Autowired
	CertificateExamConditionMapper mapper;
	@Override
	public List<CertificateExamCondition> list() {
		CertificateExamConditionExample example = new CertificateExamConditionExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(CertificateExamCondition record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(CertificateExamCondition record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public CertificateExamCondition get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<CertificateExamCondition> findListByCondition(CertificateExamCondition condition) {
		CertificateExamConditionExample example = new CertificateExamConditionExample();
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
