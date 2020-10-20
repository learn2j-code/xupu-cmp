package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.TestApplication;
import com.chhtf.cmp.pojo.TestApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestApplicationMapper {
    int countByExample(TestApplicationExample example);

    int deleteByExample(TestApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestApplication record);

    int insertSelective(TestApplication record);

    List<TestApplication> selectByExample(TestApplicationExample example);

    TestApplication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestApplication record, @Param("example") TestApplicationExample example);

    int updateByExample(@Param("record") TestApplication record, @Param("example") TestApplicationExample example);

    int updateByPrimaryKeySelective(TestApplication record);

    int updateByPrimaryKey(TestApplication record);
}