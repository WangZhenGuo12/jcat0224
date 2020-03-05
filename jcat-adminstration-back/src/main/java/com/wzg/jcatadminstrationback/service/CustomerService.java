package com.wzg.jcatadminstrationback.service;

import com.github.pagehelper.Page;
import com.wzg.jcatadminstrationback.dto.in.CustomerSetStatusInDTO;
import com.wzg.jcatadminstrationback.po.Customer;

public interface CustomerService {
    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

}
