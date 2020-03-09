package com.wzg.jcatadministrationback.service;



import com.wzg.jcatadministrationback.po.Address;

import java.util.List;

public interface AddressService {

    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);

}
