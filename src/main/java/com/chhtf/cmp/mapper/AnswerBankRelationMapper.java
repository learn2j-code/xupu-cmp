package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.AnswerBankRelation;
import com.chhtf.cmp.pojo.AnswerBankRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnswerBankRelationMapper {
    int countByExample(AnswerBankRelationExample example);

    int deleteByExample(AnswerBankRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnswerBankRelation record);

    int insertSelective(AnswerBankRelation record);

    List<AnswerBankRelation> selectByExample(AnswerBankRelationExample example);

    AnswerBankRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnswerBankRelation record, @Param("example") AnswerBankRelationExample example);

    int updateByExample(@Param("record") AnswerBankRelation record, @Param("example") AnswerBankRelationExample example);

    int updateByPrimaryKeySelective(AnswerBankRelation record);

    int updateByPrimaryKey(AnswerBankRelation record);
}