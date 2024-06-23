package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class GetMath {
    public  int add(int a,int b){
        return  Math.addExact(a,b);
    }
}
