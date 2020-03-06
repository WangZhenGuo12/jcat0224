package io.cjf.jcartstoreback.service;

import com.wzg.jcatstoreback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

}
