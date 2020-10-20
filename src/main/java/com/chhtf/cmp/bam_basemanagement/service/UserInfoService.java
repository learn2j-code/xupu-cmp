package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;
import com.chhtf.cmp.pojo.UserInfo;


public interface UserInfoService {
	List<UserInfo> list();
	void add(UserInfo record);
	void update(UserInfo record);
	void delete(int id);
	UserInfo get(int id);
	
	List<UserInfo> findListByCondition(UserInfo condition);
	
	//根据手机号查唯一用户
	UserInfo findUserInfoByPhone(String phone);
	
	//手机端注册用户
	Integer registerUser(UserInfo record);
	
	//根据openid查用户
	UserInfo findUserInfoByOpenid(String openid);
	
	//用户登录
	Integer login(UserInfo record);
	
	//根据手机号重置用户密码
	void resetUserPassword(UserInfo record);
}
