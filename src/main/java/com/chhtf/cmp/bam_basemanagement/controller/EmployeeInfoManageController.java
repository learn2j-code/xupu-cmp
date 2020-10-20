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
import com.chhtf.cmp.bam_basemanagement.service.EmployeeInfoService;
import com.chhtf.cmp.bam_basemanagement.service.UserInfoService;
import com.chhtf.cmp.bam_basemanagement.vo.EmployeeInfoExtends;
import com.chhtf.cmp.bam_basemanagement.vo.RequestEntity;
import com.chhtf.cmp.bam_basemanagement.vo.ResponseEntity;
import com.chhtf.cmp.bam_basemanagement.vo.SubjectInfoExtends;
import com.chhtf.cmp.constant.CommonConstant;
import com.chhtf.cmp.pojo.AgencyRelation;
import com.chhtf.cmp.pojo.EmployeeInfo;
import com.chhtf.cmp.pojo.UserInfo;
import com.chhtf.cmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("employeeinfo")
public class EmployeeInfoManageController {
	
	@Autowired
	EmployeeInfoService service;
	@Autowired
	AgencyRelationService agencyRelationService;
	@Autowired
	UserInfoService userInfoService;
	/**
	 * 	查询所有
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<EmployeeInfo> list = service.list();
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
		
		List<EmployeeInfo> list = service.findListByCondition(requestEntity.getEmployeeInfo());
		List<EmployeeInfoExtends> extendsList = service.packExtendsListFrom(list);
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
		
		EmployeeInfo record = service.get(requestEntity.getId());
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
			EmployeeInfoExtends employeeInfo = requestEntity.getEmployeeInfo();
			if(employeeInfo.getUserId()==null||employeeInfo.getUserId()==0) {
				UserInfo userInfo = new UserInfo();
				userInfo.setPhone(employeeInfo.getPhone());
				userInfo.setName(employeeInfo.getEmployeeName());
				userInfo.setNickName(employeeInfo.getEmployeeName());
				userInfo.setUserType("D");
				String phone = employeeInfo.getPhone();
				userInfo.setPassword(phone.substring(phone.length()-6,phone.length()));
				userInfoService.add(userInfo);
				employeeInfo.setUserId(userInfo.getId());
			}
			service.add(employeeInfo);
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("record", employeeInfo);
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
			service.update(requestEntity.getEmployeeInfo());
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
//			agencyRelationService.deleteRecordByRelaterIdAndType(requestEntity.getId(),"B");
			service.delete(requestEntity.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
}  
	
	
