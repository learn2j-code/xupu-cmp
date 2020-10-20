package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.ExaminationPaper;
import com.chhtf.cmp.pojo.ExaminationPaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExaminationPaperMapper {
    int countByExample(ExaminationPaperExample example);

    int deleteByExample(ExaminationPaperExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExaminationPaper record);

    int insertSelective(ExaminationPaper record);

    List<ExaminationPaper> selectByExample(ExaminationPaperExample example);

    ExaminationPaper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExaminationPaper record, @Param("example") ExaminationPaperExample example);

    int updateByExample(@Param("record") ExaminationPaper record, @Param("example") ExaminationPaperExample example);

    int updateByPrimaryKeySelective(ExaminationPaper record);

    int updateByPrimaryKey(ExaminationPaper record);
}