package com.example.springboot06aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringBoot06AopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot06AopApplication.class, args);
    }

}
