package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhtf.cmp.bam_basemanagement.service.AgencyInfoService;
import com.chhtf.cmp.bam_basemanagement.service.CertificateInfoService;
import com.chhtf.cmp.bam_basemanagement.service.EmployeeInfoService;
import com.chhtf.cmp.bam_basemanagement.service.TestApplicationService;
import com.chhtf.cmp.bam_basemanagement.service.TraineeInfoService;
import com.chhtf.cmp.bam_basemanagement.service.UserInfoService;
import com.chhtf.cmp.bam_basemanagement.vo.TestApplicationExtends;
import com.chhtf.cmp.mapper.TestApplicationMapper;
import com.chhtf.cmp.pojo.CertificateInfo;
import com.chhtf.cmp.pojo.TestApplication;
import com.chhtf.cmp.pojo.TestApplicationExample;
import com.chhtf.cmp.pojo.TestApplicationExample.Criteria;
import com.chhtf.cmp.pojo.TraineeInfo;
import com.chhtf.cmp.pojo.UserInfo;
@Service
public class TestApplicationServiceImpl implements TestApplicationService {
	@Autowired
	TestApplicationMapper mapper;
	@Autowired
	TraineeInfoService traineeInfoService;
	@Autowired
	UserInfoService userInfoService;
	@Autowired
	CertificateInfoService certificateInfoService;
	@Autowired
	AgencyInfoService agencyInfoService;
	@Autowired
	EmployeeInfoService employeeInfoService;
	@Override
	public List<TestApplication> list() {
		TestApplicationExample example = new TestApplicationExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(TestApplication record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(TestApplication record) {
		//如果报考申请记录的【是否已分配跟进员工】为假且【跟进员工id】不为空，则将该记录的【是否已分配跟进员工】改为真，
		//并该记录的【跟进员工id】同步到【机构学员表】中的【跟进员工id】
		if(record.getBeAllocate()!=null&&record.getBeAllocate()==0&&record.getEmployeeId()!=null) {
			record.setBeAllocate(1);
			if(record.getTraineeId()!=null) {
				TraineeInfo traineeInfo = traineeInfoService.get(record.getTraineeId());
				if(traineeInfo!=null) {
					traineeInfo.setEmployeeId(record.getEmployeeId());
					traineeInfoService.update(traineeInfo);
				}
			}
		}
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public TestApplication get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<TestApplication> findListByCondition(TestApplication condition) {
		TestApplicationExample example = new TestApplicationExample();
		example.setOrderByClause("create_time desc");
		Criteria criteria = example.createCriteria();
		if(condition.getCertificateId()!=null) {
			criteria.andCertificateIdEqualTo(condition.getCertificateId());
		}
		if(condition.getUserId()!=null) {
			criteria.andUserIdEqualTo(condition.getUserId());
		}
		if(condition.getGetCertificateWay()!=null) {
			criteria.andGetCertificateWayEqualTo(condition.getGetCertificateWay());
		}
		if(condition.getCurrentProgress()!=null) {
			criteria.andCurrentProgressEqualTo(condition.getCurrentProgress());
		}
		if(condition.getAgencyId()!=null) {
			criteria.andAgencyIdEqualTo(condition.getAgencyId());
		}
		if(condition.getEmployeeId()!=null) {
			criteria.andEmployeeIdEqualTo(condition.getEmployeeId());
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
	public List<TestApplicationExtends> packExtendsListBy(List<TestApplication> list) {
		List<TestApplicationExtends> extendsList = new ArrayList<TestApplicationExtends>();
		for(TestApplication testApplication:list) {
			TestApplicationExtends testApplicationExtends = packExtendsBy(testApplication);
			extendsList.add(testApplicationExtends);
		}
		return extendsList;
	}

	@Override
	public TestApplicationExtends packExtendsBy(TestApplication testApplication) {
		TestApplicationExtends testApplicationExtends = new TestApplicationExtends();
		BeanUtils.copyProperties(testApplication, testApplicationExtends);
		if(testApplication.getTraineeId()!=null) {
			TraineeInfo traineeInfo = traineeInfoService.get(testApplication.getTraineeId());
			testApplicationExtends.setTraineeInfo(traineeInfo);
		}
		if(testApplication.getCertificateId()!=null) {
			CertificateInfo certificateInfo = certificateInfoService.get(testApplication.getCertificateId());
			testApplicationExtends.setCertificateInfo(certificateInfo);
		}
		if(testApplication.getUserId()!=null) {
			testApplicationExtends.setUserInfo(userInfoService.get(testApplication.getUserId()));
		}
		if(testApplication.getAgencyId()!=null) {
			testApplicationExtends.setAgencyInfo(agencyInfoService.get(testApplication.getAgencyId()));
		}
		if(testApplication.getEmployeeId()!=null) {
			testApplicationExtends.setEmployeeInfo(employeeInfoService.get(testApplication.getEmployeeId()));
		}
		return testApplicationExtends;
	}

	//处理该申请
	//根据该申请的用户id和机构id找该学员，并更新该申请的学员id（trainee_id），如果没找到学员，则新建一条学员记录再更新上去
	@Override
	public void dealwithTestApplication(TestApplication record) {
		TraineeInfo traineeInfo = new TraineeInfo();
		traineeInfo.setAgencyId(record.getAgencyId());
		traineeInfo.setUserId(record.getUserId());
		UserInfo userInfo = userInfoService.get(record.getUserId());
		traineeInfo.setPhone(userInfo.getPhone());
		List<TraineeInfo> traineeInfoList = traineeInfoService.findListByCondition(traineeInfo);
		if(traineeInfoList!=null&&traineeInfoList.size()>0) {
			TraineeInfo traineeInfoTemp = traineeInfoList.get(0);
			record.setTraineeId(traineeInfoTemp.getId());
			if(traineeInfoTemp.getEmployeeId()!=null&&record.getBeAllocate()!=null&&record.getBeAllocate()==0) {
				record.setEmployeeId(traineeInfoTemp.getEmployeeId());
				record.setBeAllocate(1);
			}
		}else {
			traineeInfo.setTraineeName(userInfo.getName());
			traineeInfoService.add(traineeInfo);
			record.setTraineeId(traineeInfo.getId());
		}
		//设置为已处理
		record.setCurrentProgress(1);
		update(record);
	}
}
