package com.example.springboot02elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
public class SpringBoot02ElasticsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot02ElasticsearchApplication.class, args);
	}

}
