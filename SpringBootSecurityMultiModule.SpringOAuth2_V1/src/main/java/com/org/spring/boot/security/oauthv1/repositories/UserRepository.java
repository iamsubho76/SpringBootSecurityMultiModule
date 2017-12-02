package com.org.spring.boot.security.oauthv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.spring.boot.security.oauthv1.entities.User;

/**
 * User repository for CRUD operations.
 */
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}