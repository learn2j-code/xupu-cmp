package com.chhtf.cmp.bam_basemanagement.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chhtf.cmp.bam_basemanagement.service.UserInfoService;
import com.chhtf.cmp.bam_basemanagement.vo.RequestEntity;
import com.chhtf.cmp.bam_basemanagement.vo.ResponseEntity;
import com.chhtf.cmp.constant.CommonConstant;
import com.chhtf.cmp.pojo.UserInfo;
import com.chhtf.cmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("userinfo")
public class UserInfoManageController {
	
	@Autowired
	UserInfoService service;
	
	/**
	 * 	查询所有
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<UserInfo> list = service.list();
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
		
		List<UserInfo> list = service.findListByCondition(requestEntity.getUserInfo());
//		List<OrderInfoExtends> extendsList = service.packageOrderInfoExtendsListFrom(list);
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
		
		UserInfo record = service.get(requestEntity.getId());
		data.put("record", record);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据手机号查询用户信息
	 * @return
	 */
	@RequestMapping("findUserInfoByPhone")
	public @ResponseBody ResponseEntity findUserInfoByPhone(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		UserInfo record = service.findUserInfoByPhone(requestEntity.getPhone());
		record.setPassword(null);
		data.put("record", record);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据openid查询用户信息
	 * @return
	 */
	@RequestMapping("findUserInfoByOpenid")
	public @ResponseBody ResponseEntity findUserInfoByOpenid(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		UserInfo record = service.findUserInfoByOpenid(requestEntity.getOpenid());
		if(record!=null) {
			record.setPassword(null);
		}
		data.put("record", record);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	手机注册用户
	 * @param registerUser
	 * @return
	 */
	@RequestMapping("registerUser")
	public @ResponseBody ResponseEntity registerUser(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			Integer resultCode = service.registerUser(requestEntity.getUserInfo());
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("resultCode", resultCode);//如果已存在该用户则返回0，不存在就注册成功返回该用户id
			responseEntity.setData(data);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 *	根据手机号重置用户密码
	 * @param resetUserPassword
	 * @return
	 */
	@RequestMapping("resetUserPassword")
	public @ResponseBody ResponseEntity resetUserPassword(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			service.resetUserPassword(requestEntity.getUserInfo());
			Map<String, Object> data = new HashMap<String, Object>();
			responseEntity.setData(data);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 *	手机用户登录
	 * @param login
	 * @return
	 */
	@RequestMapping("login")
	public @ResponseBody ResponseEntity login(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			Integer resultCode = service.login(requestEntity.getUserInfo());
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("resultCode", resultCode);//如果已存在该用户则返回0，不存在就注册成功返回该用户id
			if(resultCode==1) {
				UserInfo userInfo = service.findUserInfoByPhone(requestEntity.getUserInfo().getPhone());
				userInfo.setPassword(null);
				data.put("record", userInfo);
			}
			responseEntity.setData(data);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
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
			UserInfo userInfo = requestEntity.getUserInfo();
			service.add(userInfo);
			Map<String, Object> data = new HashMap<String, Object>();
			userInfo.setPassword(null);
			data.put("record", userInfo);
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
			service.update(requestEntity.getUserInfo());
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
	
	
