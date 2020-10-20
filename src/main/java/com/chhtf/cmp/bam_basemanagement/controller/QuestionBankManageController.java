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

import com.chhtf.cmp.bam_basemanagement.service.AptitudeInfoService;
import com.chhtf.cmp.bam_basemanagement.service.CertificateInfoService;
import com.chhtf.cmp.bam_basemanagement.service.QuestionBankService;
import com.chhtf.cmp.bam_basemanagement.service.SubjectInfoService;
import com.chhtf.cmp.bam_basemanagement.vo.QuestionBankExtends;
import com.chhtf.cmp.bam_basemanagement.vo.RequestEntity;
import com.chhtf.cmp.bam_basemanagement.vo.ResponseEntity;
import com.chhtf.cmp.bam_toolsmanagement.service.IEportService;
import com.chhtf.cmp.bam_toolsmanagement.vo.ExcelFile;
import com.chhtf.cmp.constant.CommonConstant;
import com.chhtf.cmp.pojo.AptitudeInfo;
import com.chhtf.cmp.pojo.CertificateInfo;
import com.chhtf.cmp.pojo.QuestionBank;
import com.chhtf.cmp.pojo.SubjectInfo;
import com.chhtf.cmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("questionbank")
public class QuestionBankManageController {
	
	@Autowired
	QuestionBankService service;
	
	@Autowired
	IEportService ieportService;
	
	@Autowired
	CertificateInfoService certificateInfoService;
	
	@Autowired
	AptitudeInfoService aptitudeInfoService;
	@Autowired
	SubjectInfoService subjectInfoService;
	//导入Excel
    @RequestMapping(value = "/importExcelFileToQuestionBank", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity importExcelFileToQuestionBank(HttpServletRequest request,@RequestParam("file") MultipartFile file){    
        String rootPath = request.getSession().getServletContext().getRealPath(File.separator);
        String entityId = request.getParameter("entityId");
        String entityType = request.getParameter("entityType");
        String agencyId = request.getParameter("agencyId");
        String createrId = request.getParameter("createrId");
        ResponseEntity response= new ResponseEntity();
        
        try {
        	ExcelFile excelFile = ieportService.importExcelFile(file, rootPath);
	        //导入题库
        	service.importExcelFileToQuestionBank(Integer.valueOf(agencyId),Integer.valueOf(createrId),Integer.valueOf(entityId),Integer.valueOf(entityType),excelFile);
        	switch(entityType) {
        	case "1":
        		CertificateInfo certificateInfo = certificateInfoService.get(Integer.valueOf(entityId));
        		if(certificateInfo!=null&&certificateInfo.getNoQuestion()!=0) {
        			CertificateInfo certificateInfoUpdate = new CertificateInfo();
    				certificateInfoUpdate.setId(certificateInfo.getId());
    				certificateInfoUpdate.setNoQuestion(0);
        			certificateInfoService.update(certificateInfoUpdate);
        		}
        		break;
        	case "2":
        		AptitudeInfo aptitudeInfo = aptitudeInfoService.get(Integer.valueOf(entityId));
        		if(aptitudeInfo!=null&&aptitudeInfo.getNoQuestion()!=0) {
        			AptitudeInfo aptitudeInfoUpdate = new AptitudeInfo();
        			aptitudeInfoUpdate.setId(aptitudeInfo.getId());
        			aptitudeInfoUpdate.setNoQuestion(0);
        			aptitudeInfoService.update(aptitudeInfoUpdate);
        		}
        		break;
        	case "3":
        		SubjectInfo subjectInfo = subjectInfoService.get(Integer.valueOf(entityId));
        		if(subjectInfo!=null&&subjectInfo.getNoQuestion()!=0) {
        			SubjectInfo subjectInfoUpdate = new SubjectInfo();
        			subjectInfoUpdate.setId(subjectInfo.getId());
        			subjectInfoUpdate.setNoQuestion(0);
        			subjectInfoService.update(subjectInfoUpdate);
        		}
        		break;
        		default:
        			break;
        	}
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
		
		List<QuestionBank> list = service.list();
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
		
		List<QuestionBank> list = service.findListByCondition(requestEntity.getQuestionBank());
		List<QuestionBankExtends> extendsList = service.packageQuestionBankExtendsListFrom(list);
		int total = (int)new PageInfo<>(list).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("list", extendsList);
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
		
		QuestionBank record = service.get(requestEntity.getId());
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
			service.addQuestionBank(requestEntity.getQuestionBank());
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("record", requestEntity.getQuestionBank());
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
			service.update(requestEntity.getQuestionBank());
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
			service.delete(requestEntity.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
}  
	
	
