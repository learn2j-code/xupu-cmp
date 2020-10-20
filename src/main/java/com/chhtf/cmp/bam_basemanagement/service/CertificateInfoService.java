package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.bam_toolsmanagement.vo.ExcelFile;
import com.chhtf.cmp.pojo.CertificateInfo;


public interface CertificateInfoService {
	List<CertificateInfo> list();
	void add(CertificateInfo record);
	void update(CertificateInfo record);
	void delete(int id);
	CertificateInfo get(int id);
	
	List<CertificateInfo> findListByCondition(CertificateInfo condition);
	
	//导入证件
	void importExcelFileToCertificateInfo(ExcelFile excelFile);
		
//	//将证件信息中的 【证件类别】、【所属行业】、【所属分类】、【所属专业】、【发证机关】5类数据加入字典
//	void addCertificateInfoToDictionary();
}
