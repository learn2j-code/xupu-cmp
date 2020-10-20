package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.CertificateExamCondition;
import com.chhtf.cmp.pojo.CertificateExamConditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CertificateExamConditionMapper {
    int countByExample(CertificateExamConditionExample example);

    int deleteByExample(CertificateExamConditionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CertificateExamCondition record);

    int insertSelective(CertificateExamCondition record);

    List<CertificateExamCondition> selectByExample(CertificateExamConditionExample example);

    CertificateExamCondition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CertificateExamCondition record, @Param("example") CertificateExamConditionExample example);

    int updateByExample(@Param("record") CertificateExamCondition record, @Param("example") CertificateExamConditionExample example);

    int updateByPrimaryKeySelective(CertificateExamCondition record);

    int updateByPrimaryKey(CertificateExamCondition record);
}