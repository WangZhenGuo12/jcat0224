package com.wzg.jcatadminstrationback.service;

import com.github.pagehelper.Page;
import com.wzg.jcatadminstrationback.dto.out.OrderListOutDTO;
import com.wzg.jcatadminstrationback.dto.out.OrderShowOutDTO;
import com.wzg.jcatadminstrationback.po.Order;

public interface OrderService {

    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);


}
