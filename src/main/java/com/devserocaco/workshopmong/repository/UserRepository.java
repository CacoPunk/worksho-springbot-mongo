package com.devserocaco.workshopmong.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devserocaco.workshopmong.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
