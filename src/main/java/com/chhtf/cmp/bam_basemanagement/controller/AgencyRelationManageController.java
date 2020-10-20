package com.chhtf.cmp.bam_basemanagement.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chhtf.cmp.bam_basemanagement.service.AgencyRelationService;
import com.chhtf.cmp.bam_basemanagement.vo.AgencyRelationExtends;
import com.chhtf.cmp.bam_basemanagement.vo.RequestEntity;
import com.chhtf.cmp.bam_basemanagement.vo.ResponseEntity;
import com.chhtf.cmp.constant.CommonConstant;
import com.chhtf.cmp.pojo.AgencyRelation;
import com.chhtf.cmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//机构控制器类
@Controller
@RequestMapping("agencyrelation")
public class AgencyRelationManageController {
	
	@Autowired
	AgencyRelationService service;
	
	/**
	 * 	查询所有
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<AgencyRelation> list = service.list();
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
		
		List<AgencyRelation> list = service.findListByCondition(requestEntity.getAgencyRelation());
		List<AgencyRelationExtends> extendsList = service.packageExtendsListFrom(list);
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
		
		AgencyRelation record = service.get(requestEntity.getId());
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
			service.add(requestEntity.getAgencyRelation());
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("record", requestEntity.getAgencyRelation());
			responseEntity.setData(data);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 *	批量添加
	 * @param add
	 * @return
	 */
	@RequestMapping("addAgencyRelationListBy")
	public @ResponseBody ResponseEntity addAgencyRelationListBy(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			service.addAgencyRelationListBy(requestEntity.getCertificateInfoList());
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("record", requestEntity.getAgencyRelation());
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
			service.update(requestEntity.getAgencyRelation());
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
	
	
