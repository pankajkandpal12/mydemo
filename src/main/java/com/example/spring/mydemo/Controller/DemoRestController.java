package com.example.spring.mydemo.Controller;


import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {


    @GetMapping("/")
    public String sayHello()
    {
        return "Hello World,this is hotfix!";
    }
    

    @GetMapping("/getHello")
    public String getHello()
    {
        return "This is getHello fix";
    }
    @PostMapping("/post")
    public String postHello()
    {
        return "Hello World,is posted!";

    }




}
