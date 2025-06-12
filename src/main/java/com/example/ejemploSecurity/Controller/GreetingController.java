package com.example.ejemploSecurity.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController {

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello from API jaax";
    }
}
