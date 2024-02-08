package com.jk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/ms1")
public class MicroService_1_Controller {
    @GetMapping(value = "/getInfo")
    public String getInfo(){
        return "You have reached Micro Service 1";
    }

    @GetMapping(value = "/ms1Logic1")
    public String getMs1Bl1(){
        return "This is the logic return from MicroService1 - Business Logic 1";
    }
    @GetMapping(value = "/ms1Logic2")
    public String getMs1Bl2(){
        return "This is the logic return from MicroService1 - Business Logic 2";
    }
}
