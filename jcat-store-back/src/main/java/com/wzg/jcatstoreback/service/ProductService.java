package com.wzg.jcatstoreback.service;


import com.github.pagehelper.Page;
import com.wzg.jcatstoreback.dto.out.ProductListOutDTO;
import com.wzg.jcatstoreback.dto.out.ProductShowOutDTO;


public interface ProductService {

    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
