package com.wzg.jcatstoreback.service.impl;

import com.wzg.jcatstoreback.dao.OrderHistoryMapper;
import com.wzg.jcatstoreback.po.OrderHistory;
import com.wzg.jcatstoreback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {


    @Autowired
    private OrderHistoryMapper orderHistoryMapper;

    @Override
    public List<OrderHistory> getByOrderId(Long orderId) {
        List<OrderHistory> orderHistories = orderHistoryMapper.selectByOrderId(orderId);
        return orderHistories;
    }



}
