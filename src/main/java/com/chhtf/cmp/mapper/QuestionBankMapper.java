package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.QuestionBank;
import com.chhtf.cmp.pojo.QuestionBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionBankMapper {
    int countByExample(QuestionBankExample example);

    int deleteByExample(QuestionBankExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionBank record);

    int insertSelective(QuestionBank record);

    List<QuestionBank> selectByExample(QuestionBankExample example);

    QuestionBank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionBank record, @Param("example") QuestionBankExample example);

    int updateByExample(@Param("record") QuestionBank record, @Param("example") QuestionBankExample example);

    int updateByPrimaryKeySelective(QuestionBank record);

    int updateByPrimaryKey(QuestionBank record);
}