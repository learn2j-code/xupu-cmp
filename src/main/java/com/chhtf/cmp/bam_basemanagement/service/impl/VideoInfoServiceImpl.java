package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.AptitudeInfoService;
import com.chhtf.cmp.bam_basemanagement.service.CertificateInfoService;
import com.chhtf.cmp.bam_basemanagement.service.EmployeeInfoService;
import com.chhtf.cmp.bam_basemanagement.service.ExaminationPaperService;
import com.chhtf.cmp.bam_basemanagement.service.SubjectInfoService;
import com.chhtf.cmp.bam_basemanagement.service.VideoInfoService;
import com.chhtf.cmp.bam_basemanagement.vo.ExaminationPaperExtends;
import com.chhtf.cmp.bam_basemanagement.vo.VideoInfoExtends;
import com.chhtf.cmp.mapper.VideoInfoMapper;
import com.chhtf.cmp.pojo.AptitudeInfo;
import com.chhtf.cmp.pojo.CertificateInfo;
import com.chhtf.cmp.pojo.ExaminationPaper;
import com.chhtf.cmp.pojo.SubjectInfo;
import com.chhtf.cmp.pojo.VideoInfo;
import com.chhtf.cmp.pojo.VideoInfoExample;
import com.chhtf.cmp.pojo.VideoInfoExample.Criteria;
@Service
public class VideoInfoServiceImpl implements VideoInfoService {
	@Autowired
	VideoInfoMapper mapper;
	@Autowired
	ExaminationPaperService examinationPaperService;
	@Autowired
	CertificateInfoService certificateInfoService;
	@Autowired
	AptitudeInfoService aptitudeInfoService;
	@Autowired
	SubjectInfoService subjectInfoService;
	@Autowired
	EmployeeInfoService employeeInfoService;
	@Override
	public List<VideoInfo> list() {
		VideoInfoExample example = new VideoInfoExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(VideoInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(VideoInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public VideoInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<VideoInfo> findListByCondition(VideoInfo condition) {
		VideoInfoExample example = new VideoInfoExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
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
		if(StringUtils.isNotBlank(condition.getVideoName())) {
			criteria.andVideoNameLike(condition.getVideoName()+"%");
		}
		if(StringUtils.isNotBlank(condition.getPaperName())) {
			criteria.andPaperNameEqualTo(condition.getPaperName());
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
	public VideoInfoExtends packExtendsFrom(VideoInfo record) {
		VideoInfoExtends videoInfoExtends = new VideoInfoExtends();
		BeanUtils.copyProperties(record, videoInfoExtends);
		if(record.getPaperId()!=null) {
			ExaminationPaper examinationPaper = examinationPaperService.get(record.getPaperId());
			if(examinationPaper!=null) {
				ExaminationPaperExtends examinationPaperExtends = examinationPaperService.packExtendsFrom(examinationPaper);
				videoInfoExtends.setExaminationPaper(examinationPaperExtends);
			}
			if(record.getCreaterId()!=null) {
				videoInfoExtends.setEmployeeInfo(employeeInfoService.get(record.getCreaterId()));
			}
			//根据类型id查 证件、资质和学科
			Integer entityType = videoInfoExtends.getEntityType();
			String entityName="";
			if(entityType!=null && entityType>0
					&& videoInfoExtends.getEntityId()!=null && videoInfoExtends.getEntityId()>0) {
				switch(entityType) {
				case 1:
					CertificateInfo certificateInfo = certificateInfoService.get(videoInfoExtends.getEntityId());
					entityName = certificateInfo.getCertificateName();
					break;
				case 2:
					AptitudeInfo aptitudeInfo = aptitudeInfoService.get(videoInfoExtends.getEntityId());
					entityName = aptitudeInfo.getAptitudeName();
					break;
				case 3:
					SubjectInfo subjectInfo = subjectInfoService.get(videoInfoExtends.getEntityId());
					entityName = subjectInfo.getSubjectName();
					break;
				default:
					break;
				}
			}
			videoInfoExtends.setEntityName(entityName);
		}
		return videoInfoExtends;
	}

	@Override
	public List<VideoInfoExtends> packExtendsListFrom(List<VideoInfo> list) {
		List<VideoInfoExtends> extendsList = new ArrayList<VideoInfoExtends>();
		for(VideoInfo videoInfo:list) {
			VideoInfoExtends videoInfoExtends = packExtendsFrom(videoInfo);
			extendsList.add(videoInfoExtends);
		}
		return extendsList;
	}
}
