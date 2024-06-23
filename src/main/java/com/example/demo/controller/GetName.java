package com.example.demo.controller;

import com.example.demo.service.GetMath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetName {
    @Value("${spring.application.name}")
   public String  name;
    @Value("${server.port}")
    public String  port;

    @Autowired
    GetMath getMath;

    @GetMapping("/getname")//这是get请求，post请求用requestmapping注解指定请求类型request.method=post
    public String getName(){
        System.out.println("111");
    return name+getMath.add(10,11);
}
    @GetMapping("/getport")
    public String getPort(){
        return port;
    }
}
