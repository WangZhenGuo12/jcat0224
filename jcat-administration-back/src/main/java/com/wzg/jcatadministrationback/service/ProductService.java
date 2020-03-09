package com.wzg.jcatadministrationback.service;

import com.github.pagehelper.Page;
import com.wzg.jcatadministrationback.dto.in.ProductCreateInDTO;
import com.wzg.jcatadministrationback.dto.in.ProductUpdateInDTO;
import com.wzg.jcatadministrationback.dto.out.ProductListOutDTO;
import com.wzg.jcatadministrationback.dto.out.ProductShowOutDTO;


import java.util.List;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);

}
