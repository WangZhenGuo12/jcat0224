package com.wzg.jcatadminstrationback.controller;

import com.wzg.jcatadminstrationback.dto.in.CustomerSearchInDTO;
import com.wzg.jcatadminstrationback.dto.out.CustomerListOutDTO;
import com.wzg.jcatadminstrationback.dto.out.CustomerShowOutDTO;
import com.wzg.jcatadminstrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/costomer")
public class CustomerController {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }

}
