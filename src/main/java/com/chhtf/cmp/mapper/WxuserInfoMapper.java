package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.WxuserInfo;
import com.chhtf.cmp.pojo.WxuserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxuserInfoMapper {
    int countByExample(WxuserInfoExample example);

    int deleteByExample(WxuserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxuserInfo record);

    int insertSelective(WxuserInfo record);

    List<WxuserInfo> selectByExample(WxuserInfoExample example);

    WxuserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxuserInfo record, @Param("example") WxuserInfoExample example);

    int updateByExample(@Param("record") WxuserInfo record, @Param("example") WxuserInfoExample example);

    int updateByPrimaryKeySelective(WxuserInfo record);

    int updateByPrimaryKey(WxuserInfo record);
}