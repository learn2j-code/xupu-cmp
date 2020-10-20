package com.chhtf.cmp.bam_basemanagement.vo;



import java.util.List;

import com.chhtf.cmp.pojo.AgencyInfo;
import com.chhtf.cmp.pojo.AgencyRelation;
import com.chhtf.cmp.pojo.AnswerBankRelation;
import com.chhtf.cmp.pojo.AnswerRecord;
import com.chhtf.cmp.pojo.AptitudeDeclareCondition;
import com.chhtf.cmp.pojo.AptitudeInfo;
import com.chhtf.cmp.pojo.CertificateExamCondition;
import com.chhtf.cmp.pojo.CertificateInfo;
import com.chhtf.cmp.pojo.DeclareApplication;
import com.chhtf.cmp.pojo.DictionaryData;
import com.chhtf.cmp.pojo.DictionaryType;
import com.chhtf.cmp.pojo.ExaminationPaper;
import com.chhtf.cmp.pojo.FollowRecord;
import com.chhtf.cmp.pojo.KnowledgePoint;
import com.chhtf.cmp.pojo.PaperBankRelation;
import com.chhtf.cmp.pojo.QuestionBank;
import com.chhtf.cmp.pojo.QuestionOption;
import com.chhtf.cmp.pojo.SubjectInfo;
import com.chhtf.cmp.pojo.TestApplication;
import com.chhtf.cmp.pojo.TraineeInfo;
import com.chhtf.cmp.pojo.UserInfo;
import com.chhtf.cmp.pojo.UserRelation;
import com.chhtf.cmp.pojo.VideoInfo;
import com.chhtf.cmp.util.Page;



public class RequestEntity {
	private Page page;
	private Integer id;
	private String openid;
	private String phone;
	private AgencyInfo agencyInfo;
	private AnswerBankRelation answerBankRelation;
	private AnswerRecordExtends answerRecord;
	private AptitudeDeclareCondition aptitudeDeclareCondition;
	private AptitudeInfoExtends aptitudeInfo;
	private CertificateExamCondition certificateExamCondition;
	private CertificateInfoExtends certificateInfo;
	private DeclareApplication declareApplication;
	private DictionaryData DictionaryData;
	private DictionaryType dictionaryType;
	private ExaminationPaperExtends examinationPaper;
	private FollowRecord followRecord;
	private KnowledgePoint knowledgePoint;
	private PaperBankRelation paperBankRelation;
	private QuestionBankExtends questionBank;
	private QuestionOption questionOption;
	private SubjectInfoExtends subjectInfo;
	private TestApplication testApplication;
	private TraineeInfoExtends traineeInfo;
	private UserInfo userInfo;
	private VideoInfo videoInfo;
	private AgencyRelationExtends agencyRelation;
	private UserRelation userRelation;
	private EmployeeInfoExtends employeeInfo;
	private List<CertificateInfoExtends> certificateInfoList;
	private List<PaperBankRelation> paperBankRelationList;
	private String code;
	
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AgencyInfo getAgencyInfo() {
		return agencyInfo;
	}

	public void setAgencyInfo(AgencyInfo agencyInfo) {
		this.agencyInfo = agencyInfo;
	}

	public AnswerBankRelation getAnswerBankRelation() {
		return answerBankRelation;
	}

	public void setAnswerBankRelation(AnswerBankRelation answerBankRelation) {
		this.answerBankRelation = answerBankRelation;
	}

	public AnswerRecordExtends getAnswerRecord() {
		return answerRecord;
	}

	public void setAnswerRecord(AnswerRecordExtends answerRecord) {
		this.answerRecord = answerRecord;
	}

	public AptitudeDeclareCondition getAptitudeDeclareCondition() {
		return aptitudeDeclareCondition;
	}

	public void setAptitudeDeclareCondition(AptitudeDeclareCondition aptitudeDeclareCondition) {
		this.aptitudeDeclareCondition = aptitudeDeclareCondition;
	}

	public AptitudeInfoExtends getAptitudeInfo() {
		return aptitudeInfo;
	}

	public void setAptitudeInfo(AptitudeInfoExtends aptitudeInfo) {
		this.aptitudeInfo = aptitudeInfo;
	}

	public CertificateExamCondition getCertificateExamCondition() {
		return certificateExamCondition;
	}

	public void setCertificateExamCondition(CertificateExamCondition certificateExamCondition) {
		this.certificateExamCondition = certificateExamCondition;
	}

	public CertificateInfoExtends getCertificateInfo() {
		return certificateInfo;
	}

	public void setCertificateInfo(CertificateInfoExtends certificateInfo) {
		this.certificateInfo = certificateInfo;
	}

	public DeclareApplication getDeclareApplication() {
		return declareApplication;
	}

	public void setDeclareApplication(DeclareApplication declareApplication) {
		this.declareApplication = declareApplication;
	}

	public DictionaryData getDictionaryData() {
		return DictionaryData;
	}

	public void setDictionaryData(DictionaryData DictionaryData) {
		this.DictionaryData = DictionaryData;
	}

	public DictionaryType getDictionaryType() {
		return dictionaryType;
	}

	public void setDictionaryType(DictionaryType dictionaryType) {
		this.dictionaryType = dictionaryType;
	}

	public ExaminationPaperExtends getExaminationPaper() {
		return examinationPaper;
	}

	public void setExaminationPaper(ExaminationPaperExtends examinationPaper) {
		this.examinationPaper = examinationPaper;
	}

	public FollowRecord getFollowRecord() {
		return followRecord;
	}

	public List<CertificateInfoExtends> getCertificateInfoList() {
		return certificateInfoList;
	}

	public void setCertificateInfoList(List<CertificateInfoExtends> certificateInfoList) {
		this.certificateInfoList = certificateInfoList;
	}

	public void setFollowRecord(FollowRecord followRecord) {
		this.followRecord = followRecord;
	}

	public KnowledgePoint getKnowledgePoint() {
		return knowledgePoint;
	}

	public void setKnowledgePoint(KnowledgePoint knowledgePoint) {
		this.knowledgePoint = knowledgePoint;
	}

	public PaperBankRelation getPaperBankRelation() {
		return paperBankRelation;
	}

	public void setPaperBankRelation(PaperBankRelation paperBankRelation) {
		this.paperBankRelation = paperBankRelation;
	}

	public QuestionBankExtends getQuestionBank() {
		return questionBank;
	}

	public void setQuestionBank(QuestionBankExtends questionBank) {
		this.questionBank = questionBank;
	}

	public QuestionOption getQuestionOption() {
		return questionOption;
	}

	public void setQuestionOption(QuestionOption questionOption) {
		this.questionOption = questionOption;
	}

	public SubjectInfoExtends getSubjectInfo() {
		return subjectInfo;
	}

	public void setSubjectInfo(SubjectInfoExtends subjectInfo) {
		this.subjectInfo = subjectInfo;
	}

	public TestApplication getTestApplication() {
		return testApplication;
	}

	public void setTestApplication(TestApplication testApplication) {
		this.testApplication = testApplication;
	}

	public TraineeInfoExtends getTraineeInfo() {
		return traineeInfo;
	}

	public void setTraineeInfo(TraineeInfoExtends traineeInfo) {
		this.traineeInfo = traineeInfo;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public VideoInfo getVideoInfo() {
		return videoInfo;
	}

	public void setVideoInfo(VideoInfo videoInfo) {
		this.videoInfo = videoInfo;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public AgencyRelationExtends getAgencyRelation() {
		return agencyRelation;
	}

	public void setAgencyRelation(AgencyRelationExtends agencyRelation) {
		this.agencyRelation = agencyRelation;
	}

	public UserRelation getUserRelation() {
		return userRelation;
	}

	public void setUserRelation(UserRelation userRelation) {
		this.userRelation = userRelation;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public List<PaperBankRelation> getPaperBankRelationList() {
		return paperBankRelationList;
	}

	public void setPaperBankRelationList(List<PaperBankRelation> paperBankRelationList) {
		this.paperBankRelationList = paperBankRelationList;
	}

	public EmployeeInfoExtends getEmployeeInfo() {
		return employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfoExtends employeeInfo) {
		this.employeeInfo = employeeInfo;
	}


}
