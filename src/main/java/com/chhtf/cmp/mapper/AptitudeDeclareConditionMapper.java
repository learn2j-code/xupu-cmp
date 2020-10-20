package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.AptitudeDeclareCondition;
import com.chhtf.cmp.pojo.AptitudeDeclareConditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AptitudeDeclareConditionMapper {
    int countByExample(AptitudeDeclareConditionExample example);

    int deleteByExample(AptitudeDeclareConditionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AptitudeDeclareCondition record);

    int insertSelective(AptitudeDeclareCondition record);

    List<AptitudeDeclareCondition> selectByExample(AptitudeDeclareConditionExample example);

    AptitudeDeclareCondition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AptitudeDeclareCondition record, @Param("example") AptitudeDeclareConditionExample example);

    int updateByExample(@Param("record") AptitudeDeclareCondition record, @Param("example") AptitudeDeclareConditionExample example);

    int updateByPrimaryKeySelective(AptitudeDeclareCondition record);

    int updateByPrimaryKey(AptitudeDeclareCondition record);
}