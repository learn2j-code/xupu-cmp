package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.EmployeeInfo;
import com.chhtf.cmp.pojo.EmployeeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeInfoMapper {
    int countByExample(EmployeeInfoExample example);

    int deleteByExample(EmployeeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeInfo record);

    int insertSelective(EmployeeInfo record);

    List<EmployeeInfo> selectByExample(EmployeeInfoExample example);

    EmployeeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmployeeInfo record, @Param("example") EmployeeInfoExample example);

    int updateByExample(@Param("record") EmployeeInfo record, @Param("example") EmployeeInfoExample example);

    int updateByPrimaryKeySelective(EmployeeInfo record);

    int updateByPrimaryKey(EmployeeInfo record);
}