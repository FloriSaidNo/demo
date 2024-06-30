package com.example.demo.controller;

import com.example.demo.item.Jl2;
import com.example.demo.service.GetMath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class GetName {
    @Value("${spring.application.name}")
   public String  name;
    @Value("${server.port}")
    public String  port;

    @Autowired
    GetMath getMath;
    @Autowired
    Jl2 jl2;
    @Value("${jl.cm}")
    private String cm;
    @Value("${jl.year[1]}")
    private String year;
    @Autowired
    Environment env;

    @GetMapping("/getname")//这是get请求，post请求用requestmapping注解指定请求类型request.method=post
    public String getName(){
        System.out.println("111");
    return name+getMath.add(10,11);
}
    @GetMapping("/getport")
    public String getPort(){
        return port;
    }
    @GetMapping("/{name}")
    public  String getitem(@PathVariable String name){
      //  return cm+"--"+year+name;
        if (name.equals("jl2")){
            return jl2.toString();
        }else{
            return env.getProperty("jl.sex")+"=="+env.getProperty("server.port");
        }

    }
}
