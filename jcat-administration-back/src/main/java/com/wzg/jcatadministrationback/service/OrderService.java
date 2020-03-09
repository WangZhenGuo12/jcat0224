package com.wzg.jcatadministrationback.service;

import com.github.pagehelper.Page;
import com.wzg.jcatadministrationback.dto.out.OrderListOutDTO;
import com.wzg.jcatadministrationback.dto.out.OrderShowOutDTO;
import com.wzg.jcatadministrationback.po.Order;


public interface OrderService {

    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);

}
