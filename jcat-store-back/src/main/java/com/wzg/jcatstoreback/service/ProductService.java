package com.wzg.jcatstoreback.service;


import com.github.pagehelper.Page;
import com.wzg.jcatstoreback.dto.out.ProductListOutDTO;
import com.wzg.jcatstoreback.dto.out.ProductShowOutDTO;
import com.wzg.jcatstoreback.po.Product;


public interface ProductService {

    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
