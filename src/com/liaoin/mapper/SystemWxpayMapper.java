package com.liaoin.mapper;

import com.liaoin.entity.SystemWxpay;
import com.liaoin.entity.SystemWxpayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemWxpayMapper {
    long countByExample(SystemWxpayExample example);

    int deleteByExample(SystemWxpayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemWxpay record);

    int insertSelective(SystemWxpay record);

    List<SystemWxpay> selectByExample(SystemWxpayExample example);

    SystemWxpay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemWxpay record, @Param("example") SystemWxpayExample example);

    int updateByExample(@Param("record") SystemWxpay record, @Param("example") SystemWxpayExample example);

    int updateByPrimaryKeySelective(SystemWxpay record);

    int updateByPrimaryKey(SystemWxpay record);
}