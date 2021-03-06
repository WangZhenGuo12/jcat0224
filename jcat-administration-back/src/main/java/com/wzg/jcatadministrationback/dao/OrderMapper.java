package com.wzg.jcatadministrationback.dao;

import com.github.pagehelper.Page;
import com.wzg.jcatadministrationback.dto.out.OrderListOutDTO;
import com.wzg.jcatadministrationback.po.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

//    custom

    Page<OrderListOutDTO> search();

}