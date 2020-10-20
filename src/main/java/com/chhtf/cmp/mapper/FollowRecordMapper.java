package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.FollowRecord;
import com.chhtf.cmp.pojo.FollowRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowRecordMapper {
    int countByExample(FollowRecordExample example);

    int deleteByExample(FollowRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FollowRecord record);

    int insertSelective(FollowRecord record);

    List<FollowRecord> selectByExample(FollowRecordExample example);

    FollowRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FollowRecord record, @Param("example") FollowRecordExample example);

    int updateByExample(@Param("record") FollowRecord record, @Param("example") FollowRecordExample example);

    int updateByPrimaryKeySelective(FollowRecord record);

    int updateByPrimaryKey(FollowRecord record);
}