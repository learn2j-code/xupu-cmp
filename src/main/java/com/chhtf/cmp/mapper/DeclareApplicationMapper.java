package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.DeclareApplication;
import com.chhtf.cmp.pojo.DeclareApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeclareApplicationMapper {
    int countByExample(DeclareApplicationExample example);

    int deleteByExample(DeclareApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeclareApplication record);

    int insertSelective(DeclareApplication record);

    List<DeclareApplication> selectByExample(DeclareApplicationExample example);

    DeclareApplication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeclareApplication record, @Param("example") DeclareApplicationExample example);

    int updateByExample(@Param("record") DeclareApplication record, @Param("example") DeclareApplicationExample example);

    int updateByPrimaryKeySelective(DeclareApplication record);

    int updateByPrimaryKey(DeclareApplication record);
}