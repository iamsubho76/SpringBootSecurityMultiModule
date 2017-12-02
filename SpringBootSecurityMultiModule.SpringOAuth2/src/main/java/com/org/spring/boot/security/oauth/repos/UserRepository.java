package com.org.spring.boot.security.oauth.repos;

import org.springframework.data.repository.CrudRepository;

import com.org.spring.boot.security.oauth.entities.User;

import java.lang.String;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByName(String name);

}
