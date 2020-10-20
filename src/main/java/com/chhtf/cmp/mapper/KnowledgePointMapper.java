package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.KnowledgePoint;
import com.chhtf.cmp.pojo.KnowledgePointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KnowledgePointMapper {
    int countByExample(KnowledgePointExample example);

    int deleteByExample(KnowledgePointExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KnowledgePoint record);

    int insertSelective(KnowledgePoint record);

    List<KnowledgePoint> selectByExample(KnowledgePointExample example);

    KnowledgePoint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KnowledgePoint record, @Param("example") KnowledgePointExample example);

    int updateByExample(@Param("record") KnowledgePoint record, @Param("example") KnowledgePointExample example);

    int updateByPrimaryKeySelective(KnowledgePoint record);

    int updateByPrimaryKey(KnowledgePoint record);
}