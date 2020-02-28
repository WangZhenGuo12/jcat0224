package com.wzg.jcatstoreback.service;

import com.wzg.jcatstoreback.dto.in.CustomerRegisterInDTO;
import com.wzg.jcatstoreback.po.Customer;

public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    void update(Customer customer);


}
