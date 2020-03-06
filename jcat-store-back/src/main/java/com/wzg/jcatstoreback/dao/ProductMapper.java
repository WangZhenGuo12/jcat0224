package io.cjf.jcartstoreback.dao;

import com.github.pagehelper.Page;
import com.wzg.jcatstoreback.dto.out.ProductListOutDTO;
import com.wzg.jcatstoreback.po.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

//    custom

    Page<ProductListOutDTO> search();

}