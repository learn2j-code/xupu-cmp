package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.QuestionOption;
import com.chhtf.cmp.pojo.QuestionOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionOptionMapper {
    int countByExample(QuestionOptionExample example);

    int deleteByExample(QuestionOptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionOption record);

    int insertSelective(QuestionOption record);

    List<QuestionOption> selectByExample(QuestionOptionExample example);

    QuestionOption selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionOption record, @Param("example") QuestionOptionExample example);

    int updateByExample(@Param("record") QuestionOption record, @Param("example") QuestionOptionExample example);

    int updateByPrimaryKeySelective(QuestionOption record);

    int updateByPrimaryKey(QuestionOption record);
}