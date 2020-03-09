package com.wzg.jcatstoreback.service;

import com.github.pagehelper.Page;
import com.wzg.jcatstoreback.dto.in.OrderCheckoutInDTO;
import com.wzg.jcatstoreback.dto.out.OrderShowOutDTO;
import com.wzg.jcatstoreback.dto.out.ProductShowOutDTO;
import com.wzg.jcatstoreback.po.Order;

public interface OrderService {

    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                     Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);

}
