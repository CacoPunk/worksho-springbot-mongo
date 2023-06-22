package com.devserocaco.workshopmong.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.devserocaco.workshopmong.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
