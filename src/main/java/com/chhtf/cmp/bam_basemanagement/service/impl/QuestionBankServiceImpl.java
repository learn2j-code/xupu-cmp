package com.chhtf.cmp.bam_basemanagement.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.hpsf.Array;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chhtf.cmp.bam_basemanagement.service.AptitudeInfoService;
import com.chhtf.cmp.bam_basemanagement.service.CertificateInfoService;
import com.chhtf.cmp.bam_basemanagement.service.ExaminationPaperService;
import com.chhtf.cmp.bam_basemanagement.service.PaperBankRelationService;
import com.chhtf.cmp.bam_basemanagement.service.QuestionBankService;
import com.chhtf.cmp.bam_basemanagement.service.QuestionOptionService;
import com.chhtf.cmp.bam_basemanagement.service.SubjectInfoService;
import com.chhtf.cmp.bam_basemanagement.vo.ExaminationPaperExtends;
import com.chhtf.cmp.bam_basemanagement.vo.QuestionBankExtends;
import com.chhtf.cmp.bam_toolsmanagement.vo.ExcelFile;
import com.chhtf.cmp.bam_toolsmanagement.vo.ExcelSheet;
import com.chhtf.cmp.bam_toolsmanagement.vo.ExcelSheetRow;
import com.chhtf.cmp.mapper.QuestionBankMapper;
import com.chhtf.cmp.pojo.AptitudeInfo;
import com.chhtf.cmp.pojo.CertificateInfo;
import com.chhtf.cmp.pojo.ExaminationPaper;
import com.chhtf.cmp.pojo.QuestionBank;
import com.chhtf.cmp.pojo.QuestionBankExample;
import com.chhtf.cmp.pojo.QuestionBankExample.Criteria;
import com.chhtf.cmp.pojo.QuestionOption;
import com.chhtf.cmp.pojo.SubjectInfo;
@Service
public class QuestionBankServiceImpl implements QuestionBankService {
	@Autowired
	QuestionBankMapper mapper;
	
	@Autowired
	QuestionOptionService questionOptionService;
	@Autowired
	CertificateInfoService certificateInfoService;
	@Autowired
	AptitudeInfoService aptitudeInfoService;
	@Autowired
	SubjectInfoService subjectInfoService;
	
	@Autowired
	ExaminationPaperService examinationPaperService;
	@Autowired
	PaperBankRelationService paperBankRelationService;
	@Override
	public List<QuestionBank> list() {
		QuestionBankExample example = new QuestionBankExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(QuestionBank record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(QuestionBank record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		QuestionBank record = get(id);
		//更新统计数据
		switch(record.getEntityType()) {
		case 1:
    		CertificateInfo certificateInfo = certificateInfoService.get(record.getEntityId());
    		if(certificateInfo!=null) {
    			CertificateInfo certificateInfoUpdate = new CertificateInfo();
				certificateInfoUpdate.setId(certificateInfo.getId());
				if(certificateInfo.getTotalQuestion()>=1) {
					certificateInfoUpdate.setTotalQuestion(certificateInfo.getTotalQuestion()-1);
					certificateInfoService.update(certificateInfoUpdate);
				}
    		}
    		break;
    	case 2:
    		AptitudeInfo aptitudeInfo = aptitudeInfoService.get(record.getEntityId());
    		if(aptitudeInfo!=null&&aptitudeInfo.getNoQuestion()!=0) {
    			AptitudeInfo aptitudeInfoUpdate = new AptitudeInfo();
    			aptitudeInfoUpdate.setId(aptitudeInfo.getId());
    			if(aptitudeInfo.getTotalQuestion()>=1) {
    				aptitudeInfoUpdate.setTotalQuestion(aptitudeInfo.getTotalQuestion()-1);
    				aptitudeInfoService.update(aptitudeInfoUpdate);
    			}
    		}
    		break;
    	case 3:
    		SubjectInfo subjectInfo = subjectInfoService.get(record.getEntityId());
    		if(subjectInfo!=null&&subjectInfo.getNoQuestion()!=0) {
    			SubjectInfo subjectInfoUpdate = new SubjectInfo();
    			subjectInfoUpdate.setId(subjectInfo.getId());
    			if(subjectInfo.getTotalQuestion()>=1) {
    				subjectInfoUpdate.setTotalQuestion(subjectInfo.getTotalQuestion()-1);
    				subjectInfoService.update(subjectInfoUpdate);
    			}
    		}
    		break;
    		default:
    			break;
    	}
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public QuestionBank get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<QuestionBank> findListByCondition(QuestionBankExtends condition) {
		QuestionBankExample example = new QuestionBankExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		
		if(condition.getQuestionType()!=null) {
			criteria.andQuestionTypeEqualTo(condition.getQuestionType());
		}
		if(condition.getAgencyId()!=null) {
			criteria.andAgencyIdEqualTo(condition.getAgencyId());
		}
		if(condition.getCreaterId()!=null) {
			criteria.andCreaterIdEqualTo(condition.getCreaterId());
		}
		if(condition.getEntityId()!=null) {
			criteria.andEntityIdEqualTo(condition.getEntityId());
		}
		if(condition.getEntityType()!=null) {
			criteria.andEntityTypeEqualTo(condition.getEntityType());
		}
		
		if(StringUtils.isNotBlank(condition.getStringField())) {
			criteria.andStringFieldLike(condition.getStringField());
		}
		if(condition.getIntField()!=null) {
			criteria.andIntFieldEqualTo(condition.getIntField());
		}
		
		if(condition.getNotInIdList()!=null&&condition.getNotInIdList().size()>0) {
			criteria.andIdNotIn(condition.getNotInIdList());
		}
		
		return mapper.selectByExample(example);
	}

	@Override
	public void importExcelFileToQuestionBank(ExcelFile excelFile) {
		if(excelFile!=null) {
			List<ExcelSheet> sheetList = excelFile.getSheetList();
			for(ExcelSheet sheet:sheetList) {
				String sheetName = sheet.getExcelSheetName();
				switch(sheetName) {
					case "证件":
						List<ExcelSheetRow> rowList = sheet.getSheetRowList();
						for(ExcelSheetRow row:rowList) {
							List<String> cellList = row.getCellList();
							if(cellList!=null&&cellList.size()>0) {
								QuestionBankExtends questionBank = new QuestionBankExtends();
								List<QuestionOption> questionOptionList = new ArrayList<QuestionOption>();
								questionBank.setStringField(cellList.get(0));//作业名称
								questionBank.setQuestionType(Integer.valueOf(cellList.get(1)));//题目类型
//								questionBank.setWorknameId(cellList.get(2));
								questionBank.setQuestionStem(cellList.get(3));
								questionBank.setRightAnswer(cellList.get(4));
								questionBank.setResolution(cellList.get(5));
								if(cellList.get(6)!=null) {
									questionBank.setPointValue(BigDecimal.valueOf(Double.valueOf(cellList.get(6))));
								}
								//非判断题需要提供选项内容
								if(questionBank.getQuestionType()!=3) {
									for(int i=7;i<=10;i++) {
										QuestionOption questionOption = new QuestionOption();
										switch(i) {
											case 7:
												questionOption.setOptionCode("A");
												break;
											case 8:
												questionOption.setOptionCode("B");
												break;
											case 9:
												questionOption.setOptionCode("C");
												break;
											case 10:
												questionOption.setOptionCode("D");
												break;
											default:
												break;
										}
										questionOption.setOptionContent(cellList.get(i));
										questionOptionList.add(questionOption);
									}
								}else {
									for(int i=7;i<=8;i++) {
										QuestionOption questionOption = new QuestionOption();
										switch(i) {
											case 7:
												questionOption.setOptionCode("Y");
												break;
											case 8:
												questionOption.setOptionCode("N");
												break;
												default:
													break;
										}
										questionOption.setOptionContent(cellList.get(i));
										questionOptionList.add(questionOption);
									}
								}
								questionBank.setOptionList(questionOptionList);
								addQuestionBank(questionBank);
							}
						}
						break;
					case "资质":
						List<ExcelSheetRow> row2List = sheet.getSheetRowList();
						for(ExcelSheetRow row:row2List) {
							List<String> cellList = row.getCellList();
							if(cellList!=null&&cellList.size()>0) {
								QuestionBankExtends questionBank = new QuestionBankExtends();
								List<QuestionOption> questionOptionList = new ArrayList<QuestionOption>();
								questionBank.setQuestionType(Integer.valueOf(cellList.get(0)));//题目类型
//								questionBank.setWorknameId(cellList.get(1));
								questionBank.setQuestionStem(cellList.get(2));
								questionBank.setRightAnswer(cellList.get(3));
								questionBank.setResolution(cellList.get(4));
								if(cellList.get(5)!=null) {
									questionBank.setPointValue(BigDecimal.valueOf(Double.valueOf(cellList.get(5))));
								}
								//非判断题需要提供选项内容
								if(questionBank.getQuestionType()!=3) {
									for(int i=6;i<=9;i++) {
										QuestionOption questionOption = new QuestionOption();
										switch(i) {
											case 6:
												questionOption.setOptionCode("A");
												break;
											case 7:
												questionOption.setOptionCode("B");
												break;
											case 8:
												questionOption.setOptionCode("C");
												break;
											case 9:
												questionOption.setOptionCode("D");
												break;
											default:
												break;
										}
										questionOption.setOptionContent(cellList.get(i));
										questionOptionList.add(questionOption);
									}
								}else {
									for(int i=6;i<=7;i++) {
										QuestionOption questionOption = new QuestionOption();
										switch(i) {
											case 7:
												questionOption.setOptionCode("Y");
												break;
											case 8:
												questionOption.setOptionCode("N");
												break;
												default:
													break;
										}
										questionOption.setOptionContent(cellList.get(i));
										questionOptionList.add(questionOption);
									}
								}
								questionBank.setOptionList(questionOptionList);
								addQuestionBank(questionBank);
							}
						}
						break;
					case "学科":
						List<ExcelSheetRow> row3List = sheet.getSheetRowList();
						for(ExcelSheetRow row:row3List) {
							List<String> cellList = row.getCellList();
							if(cellList!=null&&cellList.size()>0) {
								QuestionBankExtends questionBank = new QuestionBankExtends();
								List<QuestionOption> questionOptionList = new ArrayList<QuestionOption>();
								questionBank.setQuestionType(Integer.valueOf(cellList.get(0)));//题目类型
//								questionBank.setWorknameId(cellList.get(1));
								questionBank.setQuestionStem(cellList.get(2));
								questionBank.setRightAnswer(cellList.get(3));
								questionBank.setResolution(cellList.get(4));
								if(cellList.get(5)!=null) {
									questionBank.setPointValue(BigDecimal.valueOf(Double.valueOf(cellList.get(5))));
								}
								//非判断题需要提供选项内容
								if(questionBank.getQuestionType()!=3) {
									for(int i=6;i<=9;i++) {
										QuestionOption questionOption = new QuestionOption();
										switch(i) {
											case 6:
												questionOption.setOptionCode("A");
												break;
											case 7:
												questionOption.setOptionCode("B");
												break;
											case 8:
												questionOption.setOptionCode("C");
												break;
											case 9:
												questionOption.setOptionCode("D");
												break;
											default:
												break;
										}
										questionOption.setOptionContent(cellList.get(i));
										questionOptionList.add(questionOption);
									}
								}else {
									for(int i=6;i<=7;i++) {
										QuestionOption questionOption = new QuestionOption();
										switch(i) {
											case 7:
												questionOption.setOptionCode("Y");
												break;
											case 8:
												questionOption.setOptionCode("N");
												break;
												default:
													break;
										}
										questionOption.setOptionContent(cellList.get(i));
										questionOptionList.add(questionOption);
									}
								}
								questionBank.setOptionList(questionOptionList);
								addQuestionBank(questionBank);
							}
						}
						break;
					default:
						break;
				}
			}
			System.out.println("success");
		}
	}

	@Override
	@Transactional
	public void addQuestionBank(QuestionBankExtends record) {
		List<QuestionOption> optionList = record.getOptionList();
		add(record);
		Integer bankId = record.getId();
		for(QuestionOption questionOption:optionList) {
			questionOption.setBankId(bankId);
			questionOptionService.add(questionOption);
		}
		//更新统计数据
		switch(record.getEntityType()) {
		case 1:
    		CertificateInfo certificateInfo = certificateInfoService.get(record.getEntityId());
    		if(certificateInfo!=null) {
    			CertificateInfo certificateInfoUpdate = new CertificateInfo();
				certificateInfoUpdate.setId(certificateInfo.getId());
				certificateInfoUpdate.setTotalQuestion(certificateInfo.getTotalQuestion()+1);
    			certificateInfoService.update(certificateInfoUpdate);
    		}
    		break;
    	case 2:
    		AptitudeInfo aptitudeInfo = aptitudeInfoService.get(record.getEntityId());
    		if(aptitudeInfo!=null&&aptitudeInfo.getNoQuestion()!=0) {
    			AptitudeInfo aptitudeInfoUpdate = new AptitudeInfo();
    			aptitudeInfoUpdate.setId(aptitudeInfo.getId());
    			aptitudeInfoUpdate.setTotalQuestion(aptitudeInfo.getTotalQuestion()+1);
    			aptitudeInfoService.update(aptitudeInfoUpdate);
    		}
    		break;
    	case 3:
    		SubjectInfo subjectInfo = subjectInfoService.get(record.getEntityId());
    		if(subjectInfo!=null&&subjectInfo.getNoQuestion()!=0) {
    			SubjectInfo subjectInfoUpdate = new SubjectInfo();
    			subjectInfoUpdate.setId(subjectInfo.getId());
    			subjectInfoUpdate.setTotalQuestion(subjectInfo.getTotalQuestion()+1);
    			subjectInfoService.update(subjectInfoUpdate);
    		}
    		break;
    		default:
    			break;
    	}
	}

	@Override
	public List<QuestionBankExtends> packageQuestionBankExtendsListFrom(List<QuestionBank> list) {
		List<QuestionBankExtends> extendsList = new ArrayList<QuestionBankExtends>();
		for(QuestionBank questionBank:list) {
			QuestionBankExtends questionBankExtends = new QuestionBankExtends();
			BeanUtils.copyProperties(questionBank, questionBankExtends);
			
			QuestionOption condition = new QuestionOption();
			condition.setBankId(questionBank.getId());
			List<QuestionOption> questionOptionList = questionOptionService.findListByCondition(condition);
			questionBankExtends.setOptionList(questionOptionList);
			
			//根据类型id查 证件、资质和学科
			Integer entityType = questionBank.getEntityType();
			String entityName="";
			if(entityType!=null && entityType>0
					&& questionBank.getEntityId()!=null && questionBank.getEntityId()>0) {
				switch(entityType) {
				case 1:
					CertificateInfo certificateInfo = certificateInfoService.get(questionBank.getEntityId());
					entityName = certificateInfo.getCertificateName();
					break;
				case 2:
					AptitudeInfo aptitudeInfo = aptitudeInfoService.get(questionBank.getEntityId());
					entityName = aptitudeInfo.getAptitudeName();
					break;
				case 3:
					SubjectInfo subjectInfo = subjectInfoService.get(questionBank.getEntityId());
					entityName = subjectInfo.getSubjectName();
					break;
				default:
					break;
				}
			}
			questionBankExtends.setEntityName(entityName);
			extendsList.add(questionBankExtends);
		}
		return extendsList;
	}

	@Override
	public QuestionBankExtends packageQuestionBankExtendsBy(QuestionBank questionBank) {
		QuestionBankExtends questionBankExtends = new QuestionBankExtends();
		BeanUtils.copyProperties(questionBank, questionBankExtends);
		
		QuestionOption condition = new QuestionOption();
		condition.setBankId(questionBank.getId());
		List<QuestionOption> questionOptionList = questionOptionService.findListByCondition(condition);
		questionBankExtends.setOptionList(questionOptionList);
		
		//根据类型id查 证件、资质和学科
		Integer entityType = questionBank.getEntityType();
		String entityName="";
		if(entityType!=null && entityType>0
				&& questionBank.getEntityId()!=null && questionBank.getEntityId()>0) {
			switch(entityType) {
			case 1:
				CertificateInfo certificateInfo = certificateInfoService.get(questionBank.getEntityId());
				entityName = certificateInfo.getCertificateName();
				break;
			case 2:
				AptitudeInfo aptitudeInfo = aptitudeInfoService.get(questionBank.getEntityId());
				entityName = aptitudeInfo.getAptitudeName();
				break;
			case 3:
				SubjectInfo subjectInfo = subjectInfoService.get(questionBank.getEntityId());
				entityName = subjectInfo.getSubjectName();
				break;
			default:
				break;
			}
		}
		questionBankExtends.setEntityName(entityName);
		return questionBankExtends;
	}

	@Override
	public List<QuestionBank> acquireQuestionBankListBy(Integer userId,Integer entityId,Integer entityType,Integer questionNum) {
		//根据类型id查 证件、资质和学科
		QuestionBankExtends condition = new QuestionBankExtends();
		condition.setEntityType(entityType);
		condition.setEntityId(entityId);
		List<QuestionBank> questionTempList = findListByCondition(condition);
		List<QuestionBank> questionList = new ArrayList<QuestionBank>();
		if(questionTempList!=null) {
			Integer questionBankNum = questionTempList.size();
			//如果题库量在试卷的两倍以内，则只是随机即可
			if(questionBankNum>questionNum&&questionBankNum<questionNum*2) {
				questionTempList = findListByCondition(condition);
				//随机排序
				Collections.shuffle(questionTempList);
				for(int i=0;i<questionNum;i++) {
					questionList.add(questionTempList.get(i));
				}
			}
			//如果题库是试卷的倍数，则可排除前次的试题
			if(questionBankNum>=questionNum*2) {
				//根据用户id查试卷列表，拿最近的试卷id，然后查需要排除的题库id列表
				ExaminationPaper paper = new ExaminationPaper();
				paper.setUserId(userId);
				List<ExaminationPaper> paperList = examinationPaperService.findListByCondition(paper);
				if(paperList!=null&&paperList.size()>0) {
					ExaminationPaper newestPaper = paperList.get(0);
					List<Integer> bankIdList = paperBankRelationService.findBankIdListBy(newestPaper.getId(),userId);
					if(bankIdList!=null&&bankIdList.size()>0) {
						condition.setNotInIdList(bankIdList);
					}
				}
				questionTempList = findListByCondition(condition);
				//随机排序
				Collections.shuffle(questionTempList);
				for(int i=0;i<questionNum;i++) {
					questionList.add(questionTempList.get(i));
				}
			}
		}
		return questionList;
	}
	
	@Override
	public void importExcelFileToQuestionBank(Integer agencyId, Integer createrId, Integer entityId, Integer entityType, ExcelFile excelFile) {
		if(excelFile!=null) {
			List<ExcelSheet> sheetList = excelFile.getSheetList();
			ExcelSheet sheet = sheetList.get(0);
			List<ExcelSheetRow> rowList = sheet.getSheetRowList();
//			if(rowList!=null) {
//				rowList.remove(0);
//			}
			for(ExcelSheetRow row:rowList) {
				List<String> cellList = row.getCellList();
				
				if(cellList!=null&&cellList.size()>0) {
					QuestionBankExtends questionBank = new QuestionBankExtends();
					List<QuestionOption> questionOptionList = new ArrayList<QuestionOption>();
					questionBank.setEntityId(entityId);
					questionBank.setEntityType(entityType);
					questionBank.setCreaterId(createrId);
					questionBank.setAgencyId(agencyId);
					int i=0;
//					questionBank.setStringField(cellList.get(0));//作业名称
					if(cellList.get(i)!=null) {
						switch(cellList.get(0)) {
						case "单选":
							questionBank.setQuestionType(1);//题目类型
							break;
						case "多选":
							questionBank.setQuestionType(2);//题目类型
							break;
						case "判断":
							questionBank.setQuestionType(3);//题目类型
							break;
							default:
								break;
						}
					}
					String questionStem = cellList.get(i+1);
					String rightAnswer = cellList.get(i+2);
					rightAnswer.replace("、", ",");
					rightAnswer.replace("，", ",");
					questionBank.setResolution(cellList.get(i+3));
					if(cellList.get(i+4)!=null) {
						questionBank.setPointValue(BigDecimal.valueOf(Double.valueOf(cellList.get(i+4))));
					}
					//非判断题需要提供选项内容
					if(questionBank.getQuestionType()!=3) {
						
						questionStem = questionStem.replace("（", "(");
						questionStem = questionStem.replace("）", ")");
						if(questionStem.indexOf("(")>0&&questionStem.indexOf(")")>0) {
							questionStem = questionStem.substring(0,questionStem.indexOf("("))+"(答案)"+questionStem.substring(questionStem.indexOf(")")+1,questionStem.length());
						}
						
						for(int j=5;j<=8;j++) {
							QuestionOption questionOption = new QuestionOption();
							switch(j) {
								case 5:
									questionOption.setOptionCode("A");
									break;
								case 6:
									questionOption.setOptionCode("B");
									break;
								case 7:
									questionOption.setOptionCode("C");
									break;
								case 8:
									questionOption.setOptionCode("D");
									break;
								default:
									break;
							}
							questionOption.setOptionContent(cellList.get(j));
							questionOptionList.add(questionOption);
						}
					}else {
//						for(int j=5;j<=6;j++) {
//							QuestionOption questionOption = new QuestionOption();
//							switch(j) {
//								case 5:
//									questionOption.setOptionCode("Y");
//									questionOption.setOptionContent("对");
//									break;
//								case 6:
//									questionOption.setOptionCode("N");
//									questionOption.setOptionContent("错");
//									break;
//									default:
//										break;
//							}
//							questionOptionList.add(questionOption);
//						}
						rightAnswer = rightAnswer.replace("对", "Y");
						rightAnswer = rightAnswer.replace("错", "N");
					}
					questionBank.setQuestionStem(questionStem);
					questionBank.setRightAnswer(rightAnswer);
					questionBank.setOptionList(questionOptionList);
					addQuestionBank(questionBank);
				}
			}
		}			
		System.out.println("success");
	}
	
	public static void main(String[] args) {
//		String [] strArr = {"1","2","3","4","5"}; 
//		List<String> asList = Arrays.asList(strArr);
//		//让List 无序
//		//asList 其实是一种适配器模式,它内部其实还是数组
//		Collections.shuffle(asList);
//		for (String str : strArr) {
//			System.out.println(str);
//		}
		
		String kk = "阿德发大(adsfadsf答复啊打发法)阿斯顿法定是";
		kk = kk.substring(0,kk.indexOf("("))+"(答案)"+kk.substring(kk.indexOf(")")+1,kk.length());
//		String yy = kk.substring(kk.indexOf("(")+1,kk.indexOf(")"));
		System.out.println(kk);
	}
}
