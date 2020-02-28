package com.wzg.jcatstoreback.dao;

import com.wzg.jcatstoreback.po.Customer;
import org.apache.ibatis.annotations.Param;


public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);



    Customer selectByUsername(@Param("username") String username);
}