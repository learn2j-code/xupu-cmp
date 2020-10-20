package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.DictionaryTypeService;
import com.chhtf.cmp.mapper.DictionaryTypeMapper;
import com.chhtf.cmp.pojo.DictionaryType;
import com.chhtf.cmp.pojo.DictionaryTypeExample;
import com.chhtf.cmp.pojo.DictionaryTypeExample.Criteria;
@Service
public class DictionaryTypeServiceImpl implements DictionaryTypeService {
	@Autowired
	DictionaryTypeMapper mapper;
	@Override
	public List<DictionaryType> list() {
		DictionaryTypeExample example = new DictionaryTypeExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(DictionaryType record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(DictionaryType record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public DictionaryType get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<DictionaryType> findListByCondition(DictionaryType condition) {
		DictionaryTypeExample example = new DictionaryTypeExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(condition.getTypeCode())) {
			criteria.andTypeCodeEqualTo(condition.getTypeCode());
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
