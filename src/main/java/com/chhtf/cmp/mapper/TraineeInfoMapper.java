package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.TraineeInfo;
import com.chhtf.cmp.pojo.TraineeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TraineeInfoMapper {
    int countByExample(TraineeInfoExample example);

    int deleteByExample(TraineeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TraineeInfo record);

    int insertSelective(TraineeInfo record);

    List<TraineeInfo> selectByExample(TraineeInfoExample example);

    TraineeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TraineeInfo record, @Param("example") TraineeInfoExample example);

    int updateByExample(@Param("record") TraineeInfo record, @Param("example") TraineeInfoExample example);

    int updateByPrimaryKeySelective(TraineeInfo record);

    int updateByPrimaryKey(TraineeInfo record);
}