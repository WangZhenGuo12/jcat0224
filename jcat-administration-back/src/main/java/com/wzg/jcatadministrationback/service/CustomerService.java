package com.wzg.jcatadministrationback.service;

import com.github.pagehelper.Page;
import com.wzg.jcatadministrationback.dto.in.CustomerSetStatusInDTO;
import com.wzg.jcatadministrationback.po.Customer;



public interface CustomerService {

    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

}
