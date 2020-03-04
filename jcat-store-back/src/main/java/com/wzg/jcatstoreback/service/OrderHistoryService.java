package com.wzg.jcatstoreback.service;

import com.wzg.jcatstoreback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

}
