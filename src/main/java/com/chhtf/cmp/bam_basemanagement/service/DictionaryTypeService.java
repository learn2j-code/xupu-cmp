package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.pojo.DictionaryType;


public interface DictionaryTypeService {
	List<DictionaryType> list();
	void add(DictionaryType record);
	void update(DictionaryType record);
	void delete(int id);
	DictionaryType get(int id);
	
	List<DictionaryType> findListByCondition(DictionaryType condition);
}
