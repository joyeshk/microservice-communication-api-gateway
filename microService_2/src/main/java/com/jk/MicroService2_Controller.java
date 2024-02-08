package com.jk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/ms2")
public class MicroService2_Controller {
    @GetMapping(value = "/getInfo")
    public String getInfo(){
        return "You have reached MicroService2";
    }

    @GetMapping(value = "/ms2Logic1")
    public String getMs2Bl1(){
        return "This is the logic return from MicroService2 - Business Logic 1";
    }
    @GetMapping(value = "/ms2Logic2")
    public String getMs2Bl2(){
        return "This is the logic return from MicroService2 - Business Logic 2";
    }
}
