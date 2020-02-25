package com.wzg.jcatadminstrationback.controller;

import com.wzg.jcatadminstrationback.dto.in.ReturnSearchInDTO;
import com.wzg.jcatadminstrationback.dto.in.ReturnUpdateActionInDTO;
import com.wzg.jcatadminstrationback.dto.out.PageOutDTO;
import com.wzg.jcatadminstrationback.dto.out.ReturnListOutDTO;
import com.wzg.jcatadminstrationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {
    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}
