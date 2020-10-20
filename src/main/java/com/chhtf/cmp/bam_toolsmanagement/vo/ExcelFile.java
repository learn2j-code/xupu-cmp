package com.chhtf.cmp.bam_toolsmanagement.vo;

import java.util.List;

public class ExcelFile {
	private String excelFileName;
	private List<ExcelSheet> sheetList;

	public List<ExcelSheet> getSheetList() {
		return sheetList;
	}

	public void setSheetList(List<ExcelSheet> sheetList) {
		this.sheetList = sheetList;
	}

	public String getExcelFileName() {
		return excelFileName;
	}

	public void setExcelFileName(String excelFileName) {
		this.excelFileName = excelFileName;
	}
}
