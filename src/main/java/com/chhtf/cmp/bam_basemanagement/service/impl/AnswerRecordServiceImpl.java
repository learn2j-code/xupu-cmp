package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.AnswerBankRelationService;
import com.chhtf.cmp.bam_basemanagement.service.AnswerRecordService;
import com.chhtf.cmp.bam_basemanagement.vo.AnswerBankRelationExtends;
import com.chhtf.cmp.bam_basemanagement.vo.AnswerRecordExtends;
import com.chhtf.cmp.mapper.AnswerRecordMapper;
import com.chhtf.cmp.pojo.AnswerBankRelation;
import com.chhtf.cmp.pojo.AnswerRecord;
import com.chhtf.cmp.pojo.AnswerRecordExample;
import com.chhtf.cmp.pojo.AnswerRecordExample.Criteria;
@Service
public class AnswerRecordServiceImpl implements AnswerRecordService {
	@Autowired
	AnswerRecordMapper mapper;
	
	@Autowired
	AnswerBankRelationService answerBankRelationService;
	@Override
	public List<AnswerRecord> list() {
		AnswerRecordExample example = new AnswerRecordExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(AnswerRecord record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(AnswerRecord record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public AnswerRecord get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<AnswerRecord> findListByCondition(AnswerRecord condition) {
		AnswerRecordExample example = new AnswerRecordExample();
		example.setOrderByClause("create_time desc");
		Criteria criteria = example.createCriteria();
		
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
	public void addAnswerRecord(AnswerRecordExtends answerRecordExtends) {
		List<AnswerBankRelationExtends> answerBankRelationList = answerRecordExtends.getAnswerBankRelationList();
		add(answerRecordExtends);
		for(AnswerBankRelation answerBankRelation:answerBankRelationList) {
			answerBankRelation.setRecordId(answerRecordExtends.getId());
			answerBankRelationService.add(answerBankRelation);
		}
	}

	@Override
	public AnswerRecordExtends packExtendsFrom(AnswerRecord record) {
		AnswerRecordExtends answerRecordExtends = new AnswerRecordExtends();
		BeanUtils.copyProperties(record, answerRecordExtends);
		AnswerBankRelation condition = new AnswerBankRelation();
		condition.setRecordId(record.getId());
		List<AnswerBankRelation> answerBankRelationList = answerBankRelationService.findListByCondition(condition);
		answerRecordExtends.setAnswerBankRelationList(answerBankRelationService.packExtendsListFrom(answerBankRelationList));
		return answerRecordExtends;
	}
}
