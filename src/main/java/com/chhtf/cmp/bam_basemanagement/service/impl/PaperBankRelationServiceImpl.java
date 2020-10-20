package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.PaperBankRelationService;
import com.chhtf.cmp.mapper.PaperBankRelationMapper;
import com.chhtf.cmp.pojo.PaperBankRelation;
import com.chhtf.cmp.pojo.PaperBankRelationExample;
import com.chhtf.cmp.pojo.PaperBankRelationExample.Criteria;
@Service
public class PaperBankRelationServiceImpl implements PaperBankRelationService {
	@Autowired
	PaperBankRelationMapper mapper;
	@Override
	public List<PaperBankRelation> list() {
		PaperBankRelationExample example = new PaperBankRelationExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(PaperBankRelation record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(PaperBankRelation record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public PaperBankRelation get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<PaperBankRelation> findListByCondition(PaperBankRelation condition) {
		PaperBankRelationExample example = new PaperBankRelationExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		
		if(condition.getPaperId()!=null) {
			criteria.andPaperIdEqualTo(condition.getPaperId());
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
	public void addList(List<PaperBankRelation> paperBankRelationList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteListByCondition(PaperBankRelation condition) {
		PaperBankRelationExample example = new PaperBankRelationExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(condition.getPaperId()!=null) {
			criteria.andPaperIdEqualTo(condition.getPaperId());
			mapper.deleteByExample(example);
		}
	}

	@Override
	public List<Integer> findBankIdListBy(Integer paperId, Integer userId) {
		PaperBankRelationExample example = new PaperBankRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andPaperIdEqualTo(paperId).andUserIdEqualTo(userId);
		List<PaperBankRelation> paperBankRelationList = mapper.selectByExample(example);
		List<Integer> idList = new ArrayList<Integer>();
		for(PaperBankRelation paperBankRelation:paperBankRelationList) {
			idList.add(paperBankRelation.getBankId());
		}
		return idList;
	}
}
