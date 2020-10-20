package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.AgencyInfo;
import com.chhtf.cmp.pojo.AgencyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgencyInfoMapper {
    int countByExample(AgencyInfoExample example);

    int deleteByExample(AgencyInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AgencyInfo record);

    int insertSelective(AgencyInfo record);

    List<AgencyInfo> selectByExample(AgencyInfoExample example);

    AgencyInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AgencyInfo record, @Param("example") AgencyInfoExample example);

    int updateByExample(@Param("record") AgencyInfo record, @Param("example") AgencyInfoExample example);

    int updateByPrimaryKeySelective(AgencyInfo record);

    int updateByPrimaryKey(AgencyInfo record);
}