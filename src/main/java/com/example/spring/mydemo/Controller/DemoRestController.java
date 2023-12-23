package com.example.spring.mydemo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {


    @GetMapping("/")
    public String sayHello()
    {
        return "Hello World,this is hotfix!";
    }




}
