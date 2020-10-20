package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.AptitudeInfoService;
import com.chhtf.cmp.bam_basemanagement.service.CertificateInfoService;
import com.chhtf.cmp.bam_basemanagement.service.ExaminationPaperService;
import com.chhtf.cmp.bam_basemanagement.service.PaperBankRelationService;
import com.chhtf.cmp.bam_basemanagement.service.QuestionBankService;
import com.chhtf.cmp.bam_basemanagement.service.SubjectInfoService;
import com.chhtf.cmp.bam_basemanagement.vo.ExaminationPaperExtends;
import com.chhtf.cmp.bam_basemanagement.vo.QuestionBankExtends;
import com.chhtf.cmp.mapper.ExaminationPaperMapper;
import com.chhtf.cmp.pojo.AptitudeInfo;
import com.chhtf.cmp.pojo.CertificateInfo;
import com.chhtf.cmp.pojo.ExaminationPaper;
import com.chhtf.cmp.pojo.ExaminationPaperExample;
import com.chhtf.cmp.pojo.ExaminationPaperExample.Criteria;
import com.chhtf.cmp.pojo.PaperBankRelation;
import com.chhtf.cmp.pojo.QuestionBank;
import com.chhtf.cmp.pojo.SubjectInfo;
@Service
public class ExaminationPaperServiceImpl implements ExaminationPaperService {
	@Autowired
	ExaminationPaperMapper mapper;
	
	@Autowired
	PaperBankRelationService paperBankRelationService;
	
	@Autowired
	QuestionBankService questionBankService;
	
	@Autowired
	CertificateInfoService certificateInfoService;
	@Autowired
	AptitudeInfoService aptitudeInfoService;
	@Autowired
	SubjectInfoService subjectInfoService;
	@Override
	public List<ExaminationPaper> list() {
		ExaminationPaperExample example = new ExaminationPaperExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(ExaminationPaper record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(ExaminationPaper record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public ExaminationPaper get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<ExaminationPaper> findListByCondition(ExaminationPaper condition) {
		ExaminationPaperExample example = new ExaminationPaperExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(condition.getPaperName())) {
			criteria.andPaperNameLike(condition.getPaperName()+"%");
		}
		
		if(condition.getAgencyId()!=null) {
			criteria.andAgencyIdEqualTo(condition.getAgencyId());
		}
		if(condition.getCreaterId()!=null) {
			criteria.andCreaterIdEqualTo(condition.getCreaterId());
		}
		if(condition.getEntityId()!=null) {
			criteria.andEntityIdEqualTo(condition.getEntityId());
		}
		if(condition.getEntityType()!=null) {
			criteria.andEntityTypeEqualTo(condition.getEntityType());
		}
		if(condition.getPaperType()!=null) {
			criteria.andPaperTypeEqualTo(condition.getPaperType());
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
	public void addExaminationPaper(ExaminationPaperExtends record) {
		List<PaperBankRelation> paperBankRelationList = record.getPaperBankRelationList();
		add(record);
		for(PaperBankRelation paperBankRelation:paperBankRelationList) {
			paperBankRelation.setPaperId(record.getId());
			paperBankRelationService.add(paperBankRelation);
		}
	}

	@Override
	public ExaminationPaperExtends packExtendsFrom(ExaminationPaper record) {
		ExaminationPaperExtends examinationPaperExtends = new ExaminationPaperExtends();
		BeanUtils.copyProperties(record, examinationPaperExtends);
		
		PaperBankRelation paperBankRelation = new PaperBankRelation();
		paperBankRelation.setPaperId(record.getId());
		List<PaperBankRelation> relationList = paperBankRelationService.findListByCondition(paperBankRelation);
		List<QuestionBankExtends> questionBankList = new ArrayList<QuestionBankExtends>();
		for(PaperBankRelation relation:relationList) {
			QuestionBank questionBank = questionBankService.get(relation.getBankId());
			if(questionBank!=null) {
				QuestionBankExtends questionBankExtends = questionBankService.packageQuestionBankExtendsBy(questionBank);
				questionBankList.add(questionBankExtends);
			}
		}
		examinationPaperExtends.setQuestionBankList(questionBankList);
		return examinationPaperExtends;
	}

	@Override
	public List<ExaminationPaperExtends> packExtendsListFrom(List<ExaminationPaper> list) {
		List<ExaminationPaperExtends> extendsList = new ArrayList<ExaminationPaperExtends>();
		for(ExaminationPaper examinationPaper:list) {
			ExaminationPaperExtends examinationPaperExtends = new ExaminationPaperExtends();
			BeanUtils.copyProperties(examinationPaper, examinationPaperExtends);
			PaperBankRelation paperBankRelation = new PaperBankRelation();
			paperBankRelation.setPaperId(examinationPaper.getId());
			List<PaperBankRelation> relationList = paperBankRelationService.findListByCondition(paperBankRelation);
			List<QuestionBankExtends> questionBankList = new ArrayList<QuestionBankExtends>();
			for(PaperBankRelation relation:relationList) {
				QuestionBank questionBank = questionBankService.get(relation.getBankId());
				if(questionBank!=null) {
					QuestionBankExtends questionBankExtends = questionBankService.packageQuestionBankExtendsBy(questionBank);
					questionBankList.add(questionBankExtends);
				}
			}
			examinationPaperExtends.setQuestionBankList(questionBankList);
			
			//根据类型id查 证件、资质和学科
			Integer entityType = examinationPaper.getEntityType();
			String entityName="";
			if(entityType!=null && entityType>0
					&& examinationPaper.getEntityId()!=null && examinationPaper.getEntityId()>0) {
				switch(entityType) {
				case 1:
					CertificateInfo certificateInfo = certificateInfoService.get(examinationPaper.getEntityId());
					entityName = certificateInfo.getCertificateName();
					break;
				case 2:
					AptitudeInfo aptitudeInfo = aptitudeInfoService.get(examinationPaper.getEntityId());
					entityName = aptitudeInfo.getAptitudeName();
					break;
				case 3:
					SubjectInfo subjectInfo = subjectInfoService.get(examinationPaper.getEntityId());
					entityName = subjectInfo.getSubjectName();
					break;
				default:
					break;
				}
			}
			examinationPaperExtends.setEntityName(entityName);
			extendsList.add(examinationPaperExtends);
		}
		return extendsList;
	}

	@Override
	public ExaminationPaper createRandomExaminationPaper(ExaminationPaperExtends examinationPaperExtends) {
		Integer questionNum = examinationPaperExtends.getQuestionNum();
		Integer entityId = examinationPaperExtends.getEntityId();
		Integer entityType = examinationPaperExtends.getEntityType();
		examinationPaperExtends.setPaperType(1);//随机类型试卷
		List<QuestionBank> questionList = questionBankService.acquireQuestionBankListBy(examinationPaperExtends.getUserId(),entityId,entityType,questionNum);
		if(questionList==null||questionList.size()<=0) {
			return null;
		}
		add(examinationPaperExtends);
		for(QuestionBank questionBank:questionList) {
			PaperBankRelation paperBankRelation = new PaperBankRelation();
			paperBankRelation.setBankId(questionBank.getId());
			paperBankRelation.setPaperId(examinationPaperExtends.getId());
			paperBankRelation.setUserId(examinationPaperExtends.getUserId());
			paperBankRelationService.add(paperBankRelation);
		}
		return examinationPaperExtends;
	}

	@Override
	public void updateExaminationPaper(ExaminationPaperExtends record) {
		List<PaperBankRelation> paperBankRelationList = record.getPaperBankRelationList();
		update(record);
		PaperBankRelation condition = new PaperBankRelation();
		condition.setPaperId(record.getId());
		paperBankRelationService.deleteListByCondition(condition);
		for(PaperBankRelation paperBankRelation:paperBankRelationList) {
			paperBankRelation.setPaperId(record.getId());
			paperBankRelationService.add(paperBankRelation);
		}
	}
}
