package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.AgencyRelation;
import com.chhtf.cmp.pojo.AgencyRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgencyRelationMapper {
    int countByExample(AgencyRelationExample example);

    int deleteByExample(AgencyRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AgencyRelation record);

    int insertSelective(AgencyRelation record);

    List<AgencyRelation> selectByExample(AgencyRelationExample example);

    AgencyRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AgencyRelation record, @Param("example") AgencyRelationExample example);

    int updateByExample(@Param("record") AgencyRelation record, @Param("example") AgencyRelationExample example);

    int updateByPrimaryKeySelective(AgencyRelation record);

    int updateByPrimaryKey(AgencyRelation record);
}