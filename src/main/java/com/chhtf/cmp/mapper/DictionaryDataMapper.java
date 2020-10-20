package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.DictionaryData;
import com.chhtf.cmp.pojo.DictionaryDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictionaryDataMapper {
    int countByExample(DictionaryDataExample example);

    int deleteByExample(DictionaryDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DictionaryData record);

    int insertSelective(DictionaryData record);

    List<DictionaryData> selectByExample(DictionaryDataExample example);

    DictionaryData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DictionaryData record, @Param("example") DictionaryDataExample example);

    int updateByExample(@Param("record") DictionaryData record, @Param("example") DictionaryDataExample example);

    int updateByPrimaryKeySelective(DictionaryData record);

    int updateByPrimaryKey(DictionaryData record);
}