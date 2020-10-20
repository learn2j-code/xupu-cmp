package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.CertificateInfoService;
import com.chhtf.cmp.bam_basemanagement.service.DictionaryDataService;
import com.chhtf.cmp.bam_basemanagement.service.DictionaryTypeService;
import com.chhtf.cmp.bam_basemanagement.vo.QuestionBankExtends;
import com.chhtf.cmp.bam_toolsmanagement.vo.ExcelFile;
import com.chhtf.cmp.bam_toolsmanagement.vo.ExcelSheet;
import com.chhtf.cmp.bam_toolsmanagement.vo.ExcelSheetRow;
import com.chhtf.cmp.mapper.CertificateInfoMapper;
import com.chhtf.cmp.pojo.CertificateInfo;
import com.chhtf.cmp.pojo.CertificateInfoExample;
import com.chhtf.cmp.pojo.CertificateInfoExample.Criteria;
import com.chhtf.cmp.pojo.DictionaryData;
import com.chhtf.cmp.pojo.DictionaryType;
@Service
public class CertificateInfoServiceImpl implements CertificateInfoService {
	@Autowired
	CertificateInfoMapper mapper;
	
	@Autowired
	DictionaryTypeService dictionaryTypeService;
	
	@Autowired
	DictionaryDataService dictionaryDataService;
	
	@Override
	public List<CertificateInfo> list() {
		CertificateInfoExample example = new CertificateInfoExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(CertificateInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(CertificateInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public CertificateInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<CertificateInfo> findListByCondition(CertificateInfo condition) {
		CertificateInfoExample example = new CertificateInfoExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(condition.getDealFlag()!=null) {
			criteria.andDealFlagEqualTo(condition.getDealFlag());
		}
		
		if(condition.getLowerLimit()!=null&&condition.getLowerLimit()>0) {
			criteria.andTotalQuestionGreaterThanOrEqualTo(condition.getLowerLimit());
		}
		
		if(StringUtils.isNotBlank(condition.getCertificateName())) {
			criteria.andCertificateNameLike(condition.getCertificateName()+"%");
		}
		if(StringUtils.isNotBlank(condition.getCertificateType())) {
			criteria.andCertificateTypeEqualTo(condition.getCertificateType());
		}
		if(StringUtils.isNotBlank(condition.getIndustry())) {
			criteria.andIndustryEqualTo(condition.getIndustry());
		}
		if(StringUtils.isNotBlank(condition.getBelongType())) {
			criteria.andBelongTypeEqualTo(condition.getBelongType());
		}
		if(StringUtils.isNotBlank(condition.getMajor())) {
			criteria.andMajorEqualTo(condition.getMajor());
		}
		if(StringUtils.isNotBlank(condition.getCertificationAuthority())) {
			criteria.andCertificationAuthorityEqualTo(condition.getCertificationAuthority());
		}
		if(StringUtils.isNotBlank(condition.getExaminationTime())) {
			criteria.andExaminationTimeLike(condition.getExaminationTime()+"%");
		}
		if(StringUtils.isNotBlank(condition.getExaminationIntro())) {
			criteria.andExaminationIntroLike(condition.getExaminationIntro()+"%");
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
		if(condition.getNoQuestion()!=null) {
			criteria.andNoQuestionEqualTo(condition.getNoQuestion());
		}
		return mapper.selectByExample(example);
	}

	@Override
	public void importExcelFileToCertificateInfo(ExcelFile excelFile) {
		if(excelFile!=null) {
			List<ExcelSheet> sheetList = excelFile.getSheetList();
			ExcelSheet sheet = sheetList.get(0);
			List<ExcelSheetRow> rowList = sheet.getSheetRowList();
			for(ExcelSheetRow row:rowList) {
				List<String> cellList = row.getCellList();
				if(cellList!=null&&cellList.size()>0) {
					CertificateInfo certificateInfo = new CertificateInfo();
					certificateInfo.setCertificateName(cellList.get(0));
					certificateInfo.setCertificateType(cellList.get(1));
					certificateInfo.setIndustry(cellList.get(2));
					certificateInfo.setBelongType(cellList.get(3));
					certificateInfo.setMajor(cellList.get(4));
					certificateInfo.setCertificationAuthority(cellList.get(5));
					certificateInfo.setExaminationTime(cellList.get(6));
					certificateInfo.setExaminationIntro(cellList.get(7));
					certificateInfo.setComment(cellList.get(8));
					add(certificateInfo);
					//加入字典数据
					addCertificateInfoToDictionary(certificateInfo);
				}
			}
		}
	}

	private void addCertificateInfoToDictionary(CertificateInfo certificate) {
//		DictionaryType dictionaryType = new DictionaryType();
//		List<DictionaryType> dictionaryTypeList = new ArrayList<DictionaryType>();
		List<DictionaryData> dictionaryDataList = new ArrayList<DictionaryData>();
		DictionaryData dictionaryData = new DictionaryData();
		
		//将证件信息中的 【证件类别】加入字典类型
//		dictionaryType.setTypeCode("certificateType");
//		dictionaryTypeList = dictionaryTypeService.findListByCondition(dictionaryType);
//		if(dictionaryTypeList==null||dictionaryTypeList.size()<=0) {
//			dictionaryType.setTypeName("证件类别");
//			dictionaryTypeService.add(dictionaryType);
//		}
		//找字典数据
		if(certificate.getCertificateType()!=null&&(!"-".equals(certificate.getCertificateType()))&&(StringUtils.isNotBlank(certificate.getCertificateType().trim()))) {
			dictionaryData.setDataType("certificateType");
			dictionaryData.setDataName(certificate.getCertificateType());
			dictionaryDataList = dictionaryDataService.findListByCondition(dictionaryData);
			if(dictionaryDataList==null||dictionaryDataList.size()<=0) {
				dictionaryData.setIntField(certificate.getId());
				dictionaryDataService.add(dictionaryData);
			}
		}
		
//		//将证件信息中的 【所属行业】
//		dictionaryType.setTypeCode("industry");
//		dictionaryTypeList = dictionaryTypeService.findListByCondition(dictionaryType);
//		if(dictionaryTypeList==null||dictionaryTypeList.size()<=0) {
//			dictionaryType.setTypeName("所属行业");
//			dictionaryTypeService.add(dictionaryType);
//		}
		//找字典数据
		if(certificate.getIndustry()!=null&&(!"-".equals(certificate.getIndustry()))&&(StringUtils.isNotBlank(certificate.getIndustry().trim()))) {
			dictionaryData.setDataType("industry");
			dictionaryData.setDataName(certificate.getIndustry());
			dictionaryDataList = dictionaryDataService.findListByCondition(dictionaryData);
			if(dictionaryDataList==null||dictionaryDataList.size()<=0) {
				dictionaryData.setIntField(certificate.getId());
				dictionaryDataService.add(dictionaryData);
			}
		}
//		//将证件信息中的 【所属分类】
//		dictionaryType.setTypeCode("belongType");
//		dictionaryTypeList = dictionaryTypeService.findListByCondition(dictionaryType);
//		if(dictionaryTypeList==null||dictionaryTypeList.size()<=0) {
//			dictionaryType.setTypeName("所属分类");
//			dictionaryTypeService.add(dictionaryType);
//		}
		//找字典数据
		if(certificate.getBelongType()!=null&&(!"-".equals(certificate.getBelongType()))&&(StringUtils.isNotBlank(certificate.getBelongType().trim()))) {
			dictionaryData.setDataType("belongType");
			dictionaryData.setDataName(certificate.getBelongType());
			dictionaryDataList = dictionaryDataService.findListByCondition(dictionaryData);
			if(dictionaryDataList==null||dictionaryDataList.size()<=0) {
				dictionaryData.setIntField(certificate.getId());
				dictionaryDataService.add(dictionaryData);
			}
		}
//		//将证件信息中的 【所属专业】
//		dictionaryType.setTypeCode("major");
//		dictionaryTypeList = dictionaryTypeService.findListByCondition(dictionaryType);
//		if(dictionaryTypeList==null||dictionaryTypeList.size()<=0) {
//			dictionaryType.setTypeName("所属专业");
//			dictionaryTypeService.add(dictionaryType);
//		}
		//找字典数据
		if(certificate.getMajor()!=null&&(!"-".equals(certificate.getMajor()))&&(StringUtils.isNotBlank(certificate.getMajor().trim()))) {
			dictionaryData.setDataType("major");
			dictionaryData.setDataName(certificate.getMajor());
			dictionaryDataList = dictionaryDataService.findListByCondition(dictionaryData);
			if(dictionaryDataList==null||dictionaryDataList.size()<=0) {
				dictionaryData.setIntField(certificate.getId());
				dictionaryDataService.add(dictionaryData);
			}
		}
//		//将证件信息中的 【发证机关】
//		dictionaryType.setTypeCode("certificationAuthority");
//		dictionaryTypeList = dictionaryTypeService.findListByCondition(dictionaryType);
//		if(dictionaryTypeList==null||dictionaryTypeList.size()<=0) {
//			dictionaryType.setTypeName("发证机关");
//			dictionaryTypeService.add(dictionaryType);
//		}
		//找字典数据
		if(certificate.getCertificationAuthority()!=null&&(!"-".equals(certificate.getCertificationAuthority()))&&(StringUtils.isNotBlank(certificate.getCertificationAuthority().trim()))) {
			dictionaryData.setDataType("certificationAuthority");
			dictionaryData.setDataName(certificate.getCertificationAuthority());
			dictionaryDataList = dictionaryDataService.findListByCondition(dictionaryData);
			if(dictionaryDataList==null||dictionaryDataList.size()<=0) {
				dictionaryDataService.add(dictionaryData);
			}
		}
	}
	
}
