package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.AptitudeInfo;
import com.chhtf.cmp.pojo.AptitudeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AptitudeInfoMapper {
    int countByExample(AptitudeInfoExample example);

    int deleteByExample(AptitudeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AptitudeInfo record);

    int insertSelective(AptitudeInfo record);

    List<AptitudeInfo> selectByExample(AptitudeInfoExample example);

    AptitudeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AptitudeInfo record, @Param("example") AptitudeInfoExample example);

    int updateByExample(@Param("record") AptitudeInfo record, @Param("example") AptitudeInfoExample example);

    int updateByPrimaryKeySelective(AptitudeInfo record);

    int updateByPrimaryKey(AptitudeInfo record);
}