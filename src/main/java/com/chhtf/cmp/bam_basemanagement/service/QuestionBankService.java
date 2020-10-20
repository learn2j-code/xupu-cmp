package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.bam_basemanagement.vo.QuestionBankExtends;
import com.chhtf.cmp.bam_toolsmanagement.vo.ExcelFile;
import com.chhtf.cmp.pojo.QuestionBank;


public interface QuestionBankService {
	List<QuestionBank> list();
	void add(QuestionBank record);
	void update(QuestionBank record);
	void delete(int id);
	QuestionBank get(int id);
	
	List<QuestionBank> findListByCondition(QuestionBankExtends condition);
	//导入题库
	void importExcelFileToQuestionBank(ExcelFile excelFile);
	//导入题库
	void importExcelFileToQuestionBank(Integer agencyId, Integer createrId, Integer entityId, Integer entityType,ExcelFile excelFile);
	// 
	void addQuestionBank(QuestionBankExtends record);
	
	List<QuestionBankExtends> packageQuestionBankExtendsListFrom(List<QuestionBank> list);
	QuestionBankExtends packageQuestionBankExtendsBy(QuestionBank record);
	
	//根据固定数量和题库类型随机获取题库列表
	List<QuestionBank> acquireQuestionBankListBy(Integer userId,Integer entityId,Integer entityType,Integer questionNum);
}
