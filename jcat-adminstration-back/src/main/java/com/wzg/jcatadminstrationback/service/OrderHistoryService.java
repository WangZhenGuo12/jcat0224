package com.wzg.jcatadminstrationback.service;

import com.wzg.jcatadminstrationback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {


    List<OrderHistory> getByOrderId(Long orderId);

    Long create(OrderHistory orderHistory);

}
