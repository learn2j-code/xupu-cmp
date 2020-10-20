package com.chhtf.cmp.bam_basemanagement.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.chhtf.cmp.bam_basemanagement.service.AgencyRelationService;
import com.chhtf.cmp.bam_basemanagement.service.CertificateInfoService;
import com.chhtf.cmp.bam_basemanagement.vo.CertificateInfoExtends;
import com.chhtf.cmp.bam_basemanagement.vo.RequestEntity;
import com.chhtf.cmp.bam_basemanagement.vo.ResponseEntity;
import com.chhtf.cmp.bam_toolsmanagement.service.IEportService;
import com.chhtf.cmp.bam_toolsmanagement.vo.ExcelFile;
import com.chhtf.cmp.constant.CommonConstant;
import com.chhtf.cmp.pojo.AgencyRelation;
import com.chhtf.cmp.pojo.CertificateInfo;
import com.chhtf.cmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("certificateinfo")
public class CertificateInfoManageController {
	
	@Autowired
	CertificateInfoService service;
	
	@Autowired
	AgencyRelationService agencyRelationService;
	
	@Autowired
	IEportService ieportService;
	//导入Excel
    @RequestMapping(value = "/importExcelFileToCertificateInfo", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity importExcelFileToCertificateInfo(HttpServletRequest request,@RequestParam("file") MultipartFile file){    
        String rootPath = request.getSession().getServletContext().getRealPath(File.separator);
        ResponseEntity response= new ResponseEntity();
        try {
        	ExcelFile excelFile = ieportService.importExcelFile(file, rootPath);
	        //导入证件
        	service.importExcelFileToCertificateInfo(excelFile);
		} catch (Exception e) {
			e.printStackTrace();
			response.setSuccess(CommonConstant.RESPONSE_FAIL);
			response.setErrorMsg(e.getMessage());
		}
        return response;
    }
	
	/**
	 * 	查询所有
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<CertificateInfo> list = service.list();
		data.put("list", list);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	分页查询信息
	 * @return
	 */
	@RequestMapping("findByPage")
	public @ResponseBody ResponseEntity findByPage(@RequestBody RequestEntity requestEntity){
		Page page = requestEntity.getPage();
		int pageNum = (page.getStart()-1);
		if(pageNum<0){
			return null;
		}
		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
		
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<CertificateInfo> list = service.findListByCondition(requestEntity.getCertificateInfo());
		int total = (int)new PageInfo<>(list).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("list", list);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		CertificateInfo record = service.get(requestEntity.getId());
		data.put("record", record);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			CertificateInfoExtends certificateInfo = requestEntity.getCertificateInfo();
			service.add(certificateInfo);
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("record", certificateInfo);
			responseEntity.setData(data);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	编辑
	 * @param update
	 * @return
	 */
	@RequestMapping("update")
	public @ResponseBody ResponseEntity update(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			service.update(requestEntity.getCertificateInfo());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	/**
	 * 	删除
	 * @param deleteById
	 * @return
	 */
	@RequestMapping("deleteById")
	public @ResponseBody ResponseEntity deleteById(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			//关联删除
//			agencyRelationService.deleteRecordByRelaterIdAndType(requestEntity.getId(),"A");
			service.delete(requestEntity.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
}  
	
	
