package com.wzg.jcatstoreback.controller;


import com.wzg.jcatstoreback.dto.in.OrderCheckoutInDTO;
import com.wzg.jcatstoreback.dto.out.OrderListOutDTO;
import com.wzg.jcatstoreback.dto.out.OrderShowOutDTO;
import com.wzg.jcatstoreback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/checkout")
    public Integer checkout(@RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
                            @RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getList")
    public PageOutDTO<OrderListOutDTO> getList(@RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }
}
