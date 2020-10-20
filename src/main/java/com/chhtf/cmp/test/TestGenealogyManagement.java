package com.chhtf.cmp.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chhtf.cmp.bam_basemanagement.service.ExaminationPaperService;
import com.chhtf.cmp.bam_basemanagement.service.TestApplicationService;
import com.chhtf.cmp.bam_basemanagement.vo.ExaminationPaperExtends;
import com.chhtf.cmp.bam_basemanagement.vo.ResponseEntity;
import com.chhtf.cmp.pojo.ExaminationPaper;
import com.chhtf.cmp.pojo.TestApplication;
import com.chhtf.cmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestGenealogyManagement {
	
	@Autowired
	ExaminationPaperService examinationPaperService;
	
	@Autowired
	TestApplicationService testApplicationService;
//	@Test
//	public void findByPage() {
//		Page page = new Page();
//		ExaminationPaper examinationPaper = new ExaminationPaper();
//		examinationPaper.setAgencyId(1);
//		page.setStart(1);
//		page.setCount(10);
//		
//		int pageNum = (page.getStart()-1);
//		if(pageNum<0){
////			return null;
//		}
//		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
//		
//		ResponseEntity responseEntity = new ResponseEntity();
//		Map<String, Object> data = new HashMap<String, Object>();
//		
//		List<ExaminationPaper> list = examinationPaperService.findListByCondition(examinationPaper);
//		List<ExaminationPaperExtends> extendsList = examinationPaperService.packExtendsListFrom(list);
//		int total = (int)new PageInfo<>(list).getTotal();
//		page.setTotal(total);
//		page.caculateLast(total);
//		
//		data.put("page", page);
//		data.put("list", extendsList);
//		responseEntity.setData(data);
////		return responseEntity;
//	}
	@Test
	public void createRandomExaminationPaper() {
		ExaminationPaperExtends examinationPaper = new ExaminationPaperExtends();
		
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		examinationPaper.setEntityId(1285);
		examinationPaper.setEntityType(1);
		examinationPaper.setPaperName("测试");
		examinationPaper.setQuestionNum(100);
		examinationPaper.setPaperType(1);
		examinationPaper.setUserId(26);
		ExaminationPaper paper = examinationPaperService.createRandomExaminationPaper(examinationPaper);
		
		data.put("list", examinationPaper);
		responseEntity.setData(data);
//		return responseEntity;
	}
//	@Test
//	public void dealwithTestApplication() {
//		TestApplication testApplication = new TestApplication();
//		testApplication.setId(1);
//		testApplication.setCertificateId(555);
//		testApplication.setUserId(5);
//		testApplication.setGetCertificateWay("考试");
//		testApplication.setReferenceTime("2020/3/19-2020/3/20");
//		testApplication.setTraineeComment("");
//		testApplication.setCurrentProgress(1);
//		testApplication.setAgencyId(1);
//		testApplicationService.dealwithTestApplication(testApplication);
//		ResponseEntity responseEntity = new ResponseEntity();
//		Map<String, Object> data = new HashMap<String, Object>();
//		
//		responseEntity.setData(data);
////		return responseEntity;
//	}
}
