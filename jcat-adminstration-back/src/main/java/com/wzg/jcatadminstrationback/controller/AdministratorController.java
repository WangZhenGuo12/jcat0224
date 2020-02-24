package com.wzg.jcatadminstrationback.controller;

import com.wzg.jcatadminstrationback.dto.in.AdministratorLoginInDTO;
import com.wzg.jcatadminstrationback.dto.in.AdministratorUpdateProfileInDTO;
import com.wzg.jcatadminstrationback.dto.out.AdministratorGetProfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/adminstration")
public class AdministratorController {


    @GetMapping("/login")
    public String login(AdministratorLoginInDTO administratorLoginInDTO){
        return null;
    }

    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(Integer adminstratorId){
        return null;
    }

    @PostMapping("/updateProdfile")
    public void updateProdfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }




}
