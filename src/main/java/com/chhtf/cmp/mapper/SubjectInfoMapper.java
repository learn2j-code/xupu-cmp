package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.SubjectInfo;
import com.chhtf.cmp.pojo.SubjectInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectInfoMapper {
    int countByExample(SubjectInfoExample example);

    int deleteByExample(SubjectInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SubjectInfo record);

    int insertSelective(SubjectInfo record);

    List<SubjectInfo> selectByExample(SubjectInfoExample example);

    SubjectInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SubjectInfo record, @Param("example") SubjectInfoExample example);

    int updateByExample(@Param("record") SubjectInfo record, @Param("example") SubjectInfoExample example);

    int updateByPrimaryKeySelective(SubjectInfo record);

    int updateByPrimaryKey(SubjectInfo record);
}