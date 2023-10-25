package com.registrationlogin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registrationlogin.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	Boolean existsByEmail(String email);
	
	Optional<User> findByEmail(String email);
}
