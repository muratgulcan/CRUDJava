package com.example.crudjava.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudjava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
