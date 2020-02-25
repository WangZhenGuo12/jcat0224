package com.wzg.jcatstoreback.controller;


import com.wzg.jcatstoreback.dto.in.ProductSearchInDTO;
import com.wzg.jcatstoreback.dto.out.PageOutDTO;
import com.wzg.jcatstoreback.dto.out.ProductListOutDTO;
import com.wzg.jcatstoreback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

}
