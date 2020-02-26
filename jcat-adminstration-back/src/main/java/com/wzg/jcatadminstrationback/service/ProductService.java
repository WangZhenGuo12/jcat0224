package com.wzg.jcatadminstrationback.service;

import com.github.pagehelper.Page;
import com.wzg.jcatadminstrationback.dto.in.ProductCreateInDTO;
import com.wzg.jcatadminstrationback.dto.in.ProductUpdateInDTO;
import com.wzg.jcatadminstrationback.dto.out.ProductListOutDTO;
import com.wzg.jcatadminstrationback.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);
}
