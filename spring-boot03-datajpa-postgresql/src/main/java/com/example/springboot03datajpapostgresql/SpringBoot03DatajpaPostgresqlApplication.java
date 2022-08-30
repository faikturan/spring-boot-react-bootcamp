package com.example.springboot03datajpapostgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBoot03DatajpaPostgresqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot03DatajpaPostgresqlApplication.class, args);
    }

}
