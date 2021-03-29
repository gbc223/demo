package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //这就是一个简单的接口
    @RequestMapping("/hello")
    public String hello() {
        //调用业务，接受前端的参数
        return "hell,world!";
    }
}
