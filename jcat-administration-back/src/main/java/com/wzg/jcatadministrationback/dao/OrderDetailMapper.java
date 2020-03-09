package com.wzg.jcatadministrationback.dao;

import com.wzg.jcatadministrationback.po.OrderDetail;

import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(OrderDetail record);



    int updateByPrimaryKey(OrderDetail record);
}