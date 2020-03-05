package com.wzg.jcatadminstrationback.service;

import com.wzg.jcatadminstrationback.po.Address;

import java.util.List;

public interface AddressService {

    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);
}
