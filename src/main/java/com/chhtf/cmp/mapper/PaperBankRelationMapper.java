package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.PaperBankRelation;
import com.chhtf.cmp.pojo.PaperBankRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperBankRelationMapper {
    int countByExample(PaperBankRelationExample example);

    int deleteByExample(PaperBankRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PaperBankRelation record);

    int insertSelective(PaperBankRelation record);

    List<PaperBankRelation> selectByExample(PaperBankRelationExample example);

    PaperBankRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PaperBankRelation record, @Param("example") PaperBankRelationExample example);

    int updateByExample(@Param("record") PaperBankRelation record, @Param("example") PaperBankRelationExample example);

    int updateByPrimaryKeySelective(PaperBankRelation record);

    int updateByPrimaryKey(PaperBankRelation record);
}