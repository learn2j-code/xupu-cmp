package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.AnswerBankRelationService;
import com.chhtf.cmp.bam_basemanagement.service.QuestionBankService;
import com.chhtf.cmp.bam_basemanagement.vo.AnswerBankRelationExtends;
import com.chhtf.cmp.mapper.AnswerBankRelationMapper;
import com.chhtf.cmp.pojo.AnswerBankRelation;
import com.chhtf.cmp.pojo.AnswerBankRelationExample;
import com.chhtf.cmp.pojo.AnswerBankRelationExample.Criteria;
@Service
public class AnswerBankRelationServiceImpl implements AnswerBankRelationService {
	@Autowired
	AnswerBankRelationMapper mapper;
	
	@Autowired
	QuestionBankService questionBankService;
	
	@Override
	public List<AnswerBankRelation> list() {
		AnswerBankRelationExample example = new AnswerBankRelationExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(AnswerBankRelation record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(AnswerBankRelation record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public AnswerBankRelation get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<AnswerBankRelation> findListByCondition(AnswerBankRelation condition) {
		AnswerBankRelationExample example = new AnswerBankRelationExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		
		if(condition.getResultFlag()!=null) {
			criteria.andResultFlagEqualTo(condition.getResultFlag());
		}
		if(condition.getRecordId()!=null) {
			criteria.andRecordIdEqualTo(condition.getRecordId());
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
	public List<AnswerBankRelationExtends> packExtendsListFrom(List<AnswerBankRelation> list) {
		List<AnswerBankRelationExtends> answerBankRelationExtendsList = new ArrayList<AnswerBankRelationExtends>();
		for(AnswerBankRelation answerBankRelation:list) {
			AnswerBankRelationExtends answerBankRelationExtends = new AnswerBankRelationExtends();
			BeanUtils.copyProperties(answerBankRelation, answerBankRelationExtends);
			answerBankRelationExtends.setQuestionBank(questionBankService.get(answerBankRelation.getBankId()));
			answerBankRelationExtendsList.add(answerBankRelationExtends);
		}
		return answerBankRelationExtendsList;
	}
}
