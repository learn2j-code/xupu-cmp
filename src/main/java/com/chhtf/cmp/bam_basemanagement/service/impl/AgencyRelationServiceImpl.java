package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.AgencyInfoService;
import com.chhtf.cmp.bam_basemanagement.service.AgencyRelationService;
import com.chhtf.cmp.bam_basemanagement.service.AptitudeInfoService;
import com.chhtf.cmp.bam_basemanagement.service.CertificateInfoService;
import com.chhtf.cmp.bam_basemanagement.service.SubjectInfoService;
import com.chhtf.cmp.bam_basemanagement.vo.AgencyRelationExtends;
import com.chhtf.cmp.bam_basemanagement.vo.CertificateInfoExtends;
import com.chhtf.cmp.mapper.AgencyRelationMapper;
import com.chhtf.cmp.pojo.AgencyRelation;
import com.chhtf.cmp.pojo.AgencyRelationExample;
import com.chhtf.cmp.pojo.AgencyRelationExample.Criteria;
import com.chhtf.cmp.pojo.AptitudeInfo;
import com.chhtf.cmp.pojo.CertificateInfo;
import com.chhtf.cmp.pojo.SubjectInfo;
@Service
public class AgencyRelationServiceImpl implements AgencyRelationService {
	@Autowired
	AgencyRelationMapper mapper;
	
	@Autowired
	CertificateInfoService certificateInfoService;
	@Autowired
	AptitudeInfoService aptitudeInfoService;
	@Autowired
	SubjectInfoService subjectInfoService;
	@Autowired
	AgencyInfoService agencyInfoService;
	@Override
	public List<AgencyRelation> list() {
		AgencyRelationExample example = new AgencyRelationExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(AgencyRelation record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(AgencyRelation record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public AgencyRelation get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<AgencyRelation> findListByCondition(AgencyRelation condition) {
		AgencyRelationExample example = new AgencyRelationExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(condition.getEntityName())) {
			criteria.andEntityNameLike(condition.getEntityName()+"%");
		}
		if(condition.getAgencyId()!=null&&condition.getAgencyId()>0) {
			criteria.andAgencyIdEqualTo(condition.getAgencyId());
		}
		if(condition.getRelaterId()!=null&&condition.getRelaterId()>0) {
			criteria.andRelaterIdEqualTo(condition.getRelaterId());
		}
		if(StringUtils.isNotBlank(condition.getRelationType())) {
			criteria.andRelationTypeEqualTo(condition.getRelationType());
		}
		
		if(condition.getDealFlag()!=null) {
			criteria.andDealFlagEqualTo(condition.getDealFlag());
		}
		if(StringUtils.isNotBlank(condition.getCertificateType())) {
			criteria.andCertificateTypeLike(condition.getCertificateType()+"%");
		}
		if(StringUtils.isNotBlank(condition.getIndustry())) {
			criteria.andIndustryLike(condition.getIndustry()+"%");
		}
		if(StringUtils.isNotBlank(condition.getBelongType())) {
			criteria.andBelongTypeLike(condition.getBelongType()+"%");
		}
		if(StringUtils.isNotBlank(condition.getMajor())) {
			criteria.andMajorLike(condition.getMajor()+"%");
		}
		if(StringUtils.isNotBlank(condition.getCertificationAuthority())) {
			criteria.andCertificationAuthorityLike(condition.getCertificationAuthority()+"%");
		}
		if(StringUtils.isNotBlank(condition.getExaminationTime())) {
			criteria.andExaminationTimeLike(condition.getExaminationTime()+"%");
		}
		if(StringUtils.isNotBlank(condition.getExaminationIntro())) {
			criteria.andExaminationIntroLike(condition.getExaminationIntro()+"%");
		}
		if(StringUtils.isNotBlank(condition.getLocation())) {
			criteria.andLocationLike(condition.getLocation()+"%");
		}
		if(StringUtils.isNotBlank(condition.getComment())) {
			criteria.andCommentLike(condition.getComment()+"%");
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
	public void deleteRecordByRelaterIdAndType(Integer relaterId,String relaterType) {
		AgencyRelationExample example = new AgencyRelationExample();
		Criteria criteria = example.createCriteria();
		criteria.andRelaterIdEqualTo(relaterId);
		criteria.andRelationTypeEqualTo(relaterType);
		mapper.deleteByExample(example);
	}

	@Override
	public List<AgencyRelationExtends> packageExtendsListFrom(List<AgencyRelation> list) {
		List<AgencyRelationExtends> extendsList = new ArrayList<AgencyRelationExtends>();
		for(AgencyRelation agencyRelation:list) {
			AgencyRelationExtends agencyRelationExtends = new AgencyRelationExtends();
			BeanUtils.copyProperties(agencyRelation, agencyRelationExtends);
			agencyRelationExtends.setAgencyInfo(agencyInfoService.get(agencyRelation.getAgencyId()));
			if(agencyRelation.getRelationType()!=null) {
				switch(agencyRelation.getRelationType()) {
				case "A":
					CertificateInfo certificateInfo = certificateInfoService.get(agencyRelation.getRelaterId());
					agencyRelationExtends.setCertificateInfo(certificateInfo);
					break;
				case "B":
					AptitudeInfo aptitudeInfo = aptitudeInfoService.get(agencyRelation.getRelaterId());
					agencyRelationExtends.setAptitudeInfo(aptitudeInfo);
					break;
				case "C":
					SubjectInfo subjectInfo = subjectInfoService.get(agencyRelation.getRelaterId());
					agencyRelationExtends.setSubjectInfo(subjectInfo);
					break;
					default:
						break;
				}
			}
			extendsList.add(agencyRelationExtends);
		}
		return extendsList;
	}

	@Override
	public void addAgencyRelationListBy(List<CertificateInfoExtends> certificateInfoList) {
		for(CertificateInfoExtends certificateInfo:certificateInfoList) {
			AgencyRelation agencyRelation = new AgencyRelation();
			agencyRelation.setAgencyId(certificateInfo.getAgencyId());
			agencyRelation.setBelongType(certificateInfo.getBelongType());
			agencyRelation.setCertificateType(certificateInfo.getCertificateType());
			agencyRelation.setCertificationAuthority(certificateInfo.getCertificationAuthority());
			agencyRelation.setComment(certificateInfo.getComment());
			agencyRelation.setEntityName(certificateInfo.getCertificateName());
			agencyRelation.setExaminationIntro(certificateInfo.getExaminationIntro());
			agencyRelation.setExaminationTime(certificateInfo.getExaminationTime());
			agencyRelation.setIndustry(certificateInfo.getIndustry());
			agencyRelation.setMajor(certificateInfo.getMajor());
			agencyRelation.setRelationType(certificateInfo.getRelationType());
			agencyRelation.setRelaterId(certificateInfo.getRelaterId());
			agencyRelation.setLocation(certificateInfo.getLocation());
			add(agencyRelation);
		}
	}
}
