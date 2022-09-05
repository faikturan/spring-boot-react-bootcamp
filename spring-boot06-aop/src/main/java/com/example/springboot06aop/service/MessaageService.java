package com.example.springboot06aop.service;

import org.springframework.stereotype.Service;

@Service
public class MessaageService {
    public String mesajVer(String s){
        System.out.println("Method mesaj verdi. param : " + s);
        return s;
    }
}
