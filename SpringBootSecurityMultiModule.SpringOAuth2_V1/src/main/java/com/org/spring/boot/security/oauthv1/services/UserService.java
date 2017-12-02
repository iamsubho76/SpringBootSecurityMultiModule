package com.org.spring.boot.security.oauthv1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.org.spring.boot.security.oauthv1.entities.User;
import com.org.spring.boot.security.oauthv1.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public void save(User user) {
		user.setPassword(getPasswordEncoder().encode(user.getPassword()));
		repo.save(user);
	}

}