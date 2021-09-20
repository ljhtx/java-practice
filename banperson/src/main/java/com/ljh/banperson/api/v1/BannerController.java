package com.ljh.banperson.api.v1;

import com.ljh.banperson.sample.IConnect;
import com.ljh.banperson.sample.ISkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/banner")
public class BannerController {
    // MVC
    // Model View Controller
    @Autowired
    private ISkill iSkill;
    
    @Autowired
    private IConnect iConnect;
    
    @GetMapping("/test")
    public void test(){
        iSkill.r();
    }
    
    @GetMapping("/test1")
    public void test1(){
        iConnect.connect();
    }
}
