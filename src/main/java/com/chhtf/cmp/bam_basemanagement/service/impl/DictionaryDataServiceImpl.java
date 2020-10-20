package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.DictionaryDataService;
import com.chhtf.cmp.mapper.DictionaryDataMapper;
import com.chhtf.cmp.pojo.DictionaryData;
import com.chhtf.cmp.pojo.DictionaryDataExample;
import com.chhtf.cmp.pojo.DictionaryDataExample.Criteria;
@Service
public class DictionaryDataServiceImpl implements DictionaryDataService {
	@Autowired
	DictionaryDataMapper mapper;
	@Override
	public List<DictionaryData> list() {
		DictionaryDataExample example = new DictionaryDataExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(DictionaryData record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(DictionaryData record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public DictionaryData get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<DictionaryData> findListByCondition(DictionaryData condition) {
		DictionaryDataExample example = new DictionaryDataExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(condition.getDataType())) {
			criteria.andDataTypeEqualTo(condition.getDataType());
		}
		if(condition.getParentId()!=null) {
			criteria.andParentIdEqualTo(condition.getParentId());
		}
		if(StringUtils.isNotBlank(condition.getDataName())) {
			criteria.andDataNameLike(condition.getDataName()+"%");
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
