package com.chhtf.cmp.bam_toolsmanagement.vo;

import java.util.List;

public class ExcelSheet {
	private String excelSheetName;
	private List<ExcelSheetRow> sheetRowList;

	public List<ExcelSheetRow> getSheetRowList() {
		return sheetRowList;
	}

	public void setSheetRowList(List<ExcelSheetRow> sheetRowList) {
		this.sheetRowList = sheetRowList;
	}

	public String getExcelSheetName() {
		return excelSheetName;
	}

	public void setExcelSheetName(String excelSheetName) {
		this.excelSheetName = excelSheetName;
	}
}
