package com.chhtf.cmp.bam_toolsmanagement.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.chhtf.cmp.bam_toolsmanagement.service.IEportService;
import com.chhtf.cmp.bam_toolsmanagement.vo.ExcelFile;
import com.chhtf.cmp.bam_toolsmanagement.vo.ExcelSheet;
import com.chhtf.cmp.bam_toolsmanagement.vo.ExcelSheetRow;

@Service
public class IEportServiceImpl implements IEportService{
	
    @Override
    public ExcelFile importExcelFile(MultipartFile mFile, String rootPath){
    	ExcelFile excelFile = new ExcelFile();
        
        String fileName = mFile.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
        String ym = new SimpleDateFormat("yyyy-MM").format(new Date());
        String filePath = "uploadFile/" + ym + fileName;
        try {
            File file = new File(rootPath + filePath);
            if (file.exists()) {
                file.delete();
                file.mkdirs();
            }else {
                file.mkdirs();
            }
            mFile.transferTo(file);
            
            if ("xls".equals(suffix) || "XLS".equals(suffix)) {
            	excelFile = importXls(file);
            }else if ("xlsx".equals(suffix) || "XLSX".equals(suffix)) {
            	excelFile = importXlsx(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
        return excelFile;
    }
    
    private ExcelFile importXls(File file) {
    	ExcelFile excelFile = new ExcelFile();
        
        InputStream is = null;
        HSSFWorkbook hWorkbook = null;
        try {
            is = new FileInputStream(file);
            hWorkbook = new HSSFWorkbook(is);
            
            Integer sheetsNumber = hWorkbook.getNumberOfSheets();
            List<ExcelSheet> sheetList = new ArrayList<ExcelSheet>();
            for(int j = 0; j < sheetsNumber; j++){
            	HSSFSheet hSheet = hWorkbook.getSheetAt(j);
            	ExcelSheet excelSheet = new ExcelSheet();
            	List<ExcelSheetRow> sheetRowList = new ArrayList<ExcelSheetRow>();
            	if (null != hSheet && hSheet.getRow(0)!=null){
            		//用表头作为数据表格总数
            		Integer cellNumber = hSheet.getRow(0).getPhysicalNumberOfCells();
            		//从数据行开始
            		for (int i = 1; i < hSheet.getPhysicalNumberOfRows(); i++){  
            			ExcelSheetRow excelSheetRow = new ExcelSheetRow();
            			HSSFRow hRow = hSheet.getRow(i);
            			List<String> cellList = new ArrayList<>();
            			for(int c=0;c<cellNumber;c++) {
            				cellList.add(hRow.getCell(c)==null?"":hRow.getCell(c).toString().trim());
            			}
            			excelSheetRow.setCellList(cellList);
            			sheetRowList.add(excelSheetRow);
            		}  
            	}  
            	String sheetName = hSheet.getSheetName();
        		excelSheet.setExcelSheetName(sheetName);
            	excelSheet.setSheetRowList(sheetRowList);
            	sheetList.add(excelSheet);
            }
            excelFile.setSheetList(sheetList);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (null != is) {
                try {
                    is.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
            if (null != hWorkbook) {
                try {
                    hWorkbook.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }    
        
        return excelFile;
    }
    
    private ExcelFile importXlsx(File file) {
    	ExcelFile excelFile = new ExcelFile();
        InputStream is = null;
        XSSFWorkbook xWorkbook = null;
        try {
            is = new FileInputStream(file);
            xWorkbook = new XSSFWorkbook(is);
            Integer sheetsNumber = xWorkbook.getNumberOfSheets();
        	List<ExcelSheet> sheetList = new ArrayList<ExcelSheet>();
        	for(int j = 0; j < sheetsNumber; j++){
        		XSSFSheet xSheet = xWorkbook.getSheetAt(j);
        		
        		ExcelSheet excelSheet = new ExcelSheet();
        		List<ExcelSheetRow> sheetRowList = new ArrayList<ExcelSheetRow>();
        		if (null != xSheet && xSheet.getRow(0)!=null){
        			//用表头作为数据表格总数
        			Integer cellNumber = xSheet.getRow(0).getPhysicalNumberOfCells();
        			
        			for (int i = 1; i < xSheet.getPhysicalNumberOfRows(); i++){  
        				ExcelSheetRow excelSheetRow = new ExcelSheetRow();
        				XSSFRow xRow = xSheet.getRow(i);
        				
        				List<String> cellList = new ArrayList<>();
        				for(int c=0;c<cellNumber;c++) {
        					cellList.add(xRow.getCell(c)==null?"":xRow.getCell(c).toString().trim());
        				}
        				excelSheetRow.setCellList(cellList);
        				sheetRowList.add(excelSheetRow);
        			}  
        		}  
        		String sheetName = xSheet.getSheetName();
        		excelSheet.setExcelSheetName(sheetName);
        		excelSheet.setSheetRowList(sheetRowList);
        		sheetList.add(excelSheet);
        	}
        	excelFile.setExcelFileName(file.getName());
        	excelFile.setSheetList(sheetList);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (null != is) {
                try {
                    is.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
            if (null != xWorkbook) {
                try {
                    xWorkbook.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return excelFile;
    }
    
    @Override
    public void exportExcelFileToExcel(HttpServletResponse response, ExcelFile excelFile) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        OutputStream os = null;
        XSSFWorkbook xWorkbook = null;
        if(excelFile==null) {
        	return;
        }
        try {
            String fileName = excelFile.getExcelFileName() + df.format(new Date()) + ".xlsx";
            
            os = response.getOutputStream();
            response.reset();
            
            response.setHeader("Content-disposition", "attachment; filename = " + URLEncoder.encode(fileName, "UTF-8"));
            response.setContentType("application/octet-streem");
            
            xWorkbook = new XSSFWorkbook();
            List<ExcelSheet> sheetList = excelFile.getSheetList();
            if(sheetList!=null&&sheetList.size()>0) {
            	for(ExcelSheet excelSheet:sheetList) {
            		XSSFSheet xSheet = xWorkbook.createSheet(excelSheet.getExcelSheetName());
            		List<ExcelSheetRow> sheetRowList = excelSheet.getSheetRowList();
            		//set Sheet页头部
            		setSheetHeader(xWorkbook, xSheet, sheetRowList.get(0));
        			//set Sheet页内容
        			setSheetContent(xWorkbook, xSheet, sheetRowList);
            	}
            	xWorkbook.write(os);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != os) {
                try {
                    os.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
            if (null != xWorkbook) {
                try {
                    xWorkbook.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        
    }

    /**
     * set Sheet页头部
     * @param xWorkbook
     * @param xSheet
     */
    private void setSheetHeader(XSSFWorkbook xWorkbook, XSSFSheet xSheet,ExcelSheetRow sheetRow) {
    	if(sheetRow==null||sheetRow.getCellList()==null) {
    		return;
    	}
    	Integer cellNumber = sheetRow.getCellList().size();
    	for(int i=0;i<cellNumber;i++) {
    		xSheet.setColumnWidth(i, 20 * 256);
    	}
        
        XSSFCellStyle cs = xWorkbook.createCellStyle();
        //设置水平垂直居中 
        cs.setAlignment(HorizontalAlignment.CENTER);
        cs.setVerticalAlignment(VerticalAlignment.CENTER);
        //设置字体
        Font headerFont = xWorkbook.createFont();
        headerFont.setFontHeightInPoints((short) 12);
        headerFont.setBold(true);
        headerFont.setFontName("宋体");
        cs.setFont(headerFont);
        cs.setWrapText(true);//是否自动换行

        XSSFRow xRow0 = xSheet.createRow(0);
        
        for(int i=0;i<cellNumber;i++) {
        	XSSFCell xCell = xRow0.createCell(i);
        	xCell.setCellStyle(cs);
        	xCell.setCellValue(sheetRow.getCellList().get(i));
    	}
    }

    /**
     * set Sheet页内容
     * @param xWorkbook
     * @param xSheet
     */
    private void setSheetContent(XSSFWorkbook xWorkbook, XSSFSheet xSheet, List<ExcelSheetRow> excelSheetRowList) {
        CellStyle cs = xWorkbook.createCellStyle();
        //设置水平居左，垂直居中
        cs.setAlignment(HorizontalAlignment.LEFT);
        cs.setVerticalAlignment(VerticalAlignment.CENTER);
        cs.setWrapText(true);
        
        if(excelSheetRowList!=null&&excelSheetRowList.size()>0) {
        	for(int i = 1; i < excelSheetRowList.size(); i++) {
        		XSSFRow xRow = xSheet.createRow(i);
        		ExcelSheetRow excelSheetRow = excelSheetRowList.get(i);
        		List<String> cellList = excelSheetRow.getCellList();
        		for(int j=0;j<cellList.size();j++) {
        			XSSFCell xCell = xRow.createCell(j);
        			xCell.setCellStyle(cs);
        			xCell.setCellValue(cellList.get(j));
        		}
        	}
        }
    }
}
