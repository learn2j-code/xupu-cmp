package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.SubjectInfoService;
import com.chhtf.cmp.mapper.SubjectInfoMapper;
import com.chhtf.cmp.pojo.SubjectInfo;
import com.chhtf.cmp.pojo.SubjectInfoExample;
import com.chhtf.cmp.pojo.SubjectInfoExample.Criteria;
@Service
public class SubjectInfoServiceImpl implements SubjectInfoService {
	@Autowired
	SubjectInfoMapper mapper;
	@Override
	public List<SubjectInfo> list() {
		SubjectInfoExample example = new SubjectInfoExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(SubjectInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(SubjectInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public SubjectInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SubjectInfo> findListByCondition(SubjectInfo condition) {
		SubjectInfoExample example = new SubjectInfoExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		
		if(condition.getLowerLimit()!=null&&condition.getLowerLimit()>0) {
			criteria.andTotalQuestionGreaterThanOrEqualTo(condition.getLowerLimit());
		}
		
		if(StringUtils.isNotBlank(condition.getSubjectName())) {
			criteria.andSubjectNameLike("%"+condition.getSubjectName()+"%");
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
