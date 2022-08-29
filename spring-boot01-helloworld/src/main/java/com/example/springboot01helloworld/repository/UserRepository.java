package com.example.springboot01helloworld.repository;

import com.example.springboot01helloworld.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
