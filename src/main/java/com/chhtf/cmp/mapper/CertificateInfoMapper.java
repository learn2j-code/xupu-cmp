package com.chhtf.cmp.mapper;

import com.chhtf.cmp.pojo.CertificateInfo;
import com.chhtf.cmp.pojo.CertificateInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CertificateInfoMapper {
    int countByExample(CertificateInfoExample example);

    int deleteByExample(CertificateInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CertificateInfo record);

    int insertSelective(CertificateInfo record);

    List<CertificateInfo> selectByExample(CertificateInfoExample example);

    CertificateInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CertificateInfo record, @Param("example") CertificateInfoExample example);

    int updateByExample(@Param("record") CertificateInfo record, @Param("example") CertificateInfoExample example);

    int updateByPrimaryKeySelective(CertificateInfo record);

    int updateByPrimaryKey(CertificateInfo record);
}