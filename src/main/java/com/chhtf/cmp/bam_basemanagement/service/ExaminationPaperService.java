package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.bam_basemanagement.vo.ExaminationPaperExtends;
import com.chhtf.cmp.pojo.ExaminationPaper;


public interface ExaminationPaperService {
	List<ExaminationPaper> list();
	void add(ExaminationPaper record);
	void update(ExaminationPaper record);
	void delete(int id);
	ExaminationPaper get(int id);
	
	void addExaminationPaper(ExaminationPaperExtends record);
	
	void updateExaminationPaper(ExaminationPaperExtends record);
	
	List<ExaminationPaper> findListByCondition(ExaminationPaper condition);
	ExaminationPaperExtends packExtendsFrom(ExaminationPaper record);
	List<ExaminationPaperExtends> packExtendsListFrom(List<ExaminationPaper> list);
	
	//创建随机试卷：根据实体id、类型和数量，随机挑出对应数量对应实体的题库，然后用它们创建一个随机类型的试卷，并返回试卷信息
	ExaminationPaper createRandomExaminationPaper(ExaminationPaperExtends examinationPaperExtends);
}
