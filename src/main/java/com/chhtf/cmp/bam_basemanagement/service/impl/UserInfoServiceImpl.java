package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.UserInfoService;
import com.chhtf.cmp.mapper.UserInfoMapper;
import com.chhtf.cmp.pojo.UserInfo;
import com.chhtf.cmp.pojo.UserInfoExample;
import com.chhtf.cmp.pojo.UserInfoExample.Criteria;
@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	UserInfoMapper mapper;
	@Override
	public List<UserInfo> list() {
		UserInfoExample example = new UserInfoExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(UserInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(UserInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public UserInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<UserInfo> findListByCondition(UserInfo condition) {
		UserInfoExample example = new UserInfoExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(condition.getName())) {
			criteria.andNameLike(condition.getName()+"%");
		}
		if(StringUtils.isNotBlank(condition.getNickName())) {
			criteria.andNickNameLike(condition.getNickName()+"%");
		}
		if(StringUtils.isNotBlank(condition.getPhone())) {
			criteria.andPhoneLike(condition.getPhone()+"%");
		}
		if(StringUtils.isNotBlank(condition.getUserType())) {
			criteria.andUserTypeEqualTo(condition.getUserType());
		}
		if(StringUtils.isNotBlank(condition.getMajor())) {
			criteria.andMajorEqualTo(condition.getMajor());
		}
		
		if(StringUtils.isNotBlank(condition.getStringField())) {
			criteria.andStringFieldLike(condition.getStringField());
		}
		if(condition.getIntField()!=null) {
			criteria.andIntFieldEqualTo(condition.getIntField());
		}
		return mapper.selectByExample(example);
	}

	@Override
	public UserInfo findUserInfoByPhone(String phone) {
		UserInfoExample example = new UserInfoExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		criteria.andPhoneEqualTo(phone.trim());
		List<UserInfo> list = mapper.selectByExample(example);
		if(list!=null&&list.size()==1) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public Integer registerUser(UserInfo record) {
		UserInfo userInfo = findUserInfoByPhone(record.getPhone());
		if(userInfo!=null) {
			return 0;//已存在该手机号的用户
		}
		add(record);//如果注册成功返回该用户id
		return record.getId();
	}

	@Override
	public UserInfo findUserInfoByOpenid(String openid) {
		UserInfoExample example = new UserInfoExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		criteria.andOpenidEqualTo(openid.trim());
		List<UserInfo> list = mapper.selectByExample(example);
		if(list!=null&&list.size()==1) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public Integer login(UserInfo record) {
		UserInfo userInfo = findUserInfoByPhone(record.getPhone());
		if(userInfo!=null) {
			if(userInfo.getPassword().equals(record.getPassword())) {
				return 1;
			}else {
				return 2;
			}
		}
		return 0;
	}

	@Override
	public void resetUserPassword(UserInfo record) {
		UserInfo userInfo = findUserInfoByPhone(record.getPhone());
		UserInfo resetUser = new UserInfo();
		if(userInfo!=null) {
			resetUser.setId(userInfo.getId());
			String phone = record.getPhone();
			String newPassword = phone.substring(phone.length()-6, phone.length());
			resetUser.setPassword(newPassword);
			update(resetUser);
		}
	}
}
