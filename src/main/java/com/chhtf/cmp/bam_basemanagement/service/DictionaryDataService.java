package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.pojo.DictionaryData;


public interface DictionaryDataService {
	List<DictionaryData> list();
	void add(DictionaryData record);
	void update(DictionaryData record);
	void delete(int id);
	DictionaryData get(int id);
	
	List<DictionaryData> findListByCondition(DictionaryData condition);
}
