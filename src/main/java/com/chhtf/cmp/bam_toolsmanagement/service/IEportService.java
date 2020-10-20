package com.chhtf.cmp.bam_toolsmanagement.service;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import com.chhtf.cmp.bam_toolsmanagement.vo.ExcelFile;

public interface IEportService {
    
	//将excel数据导入
    public ExcelFile importExcelFile(MultipartFile mFile, String rootPath);
    public void exportExcelFileToExcel(HttpServletResponse response, ExcelFile excelFile);
}

