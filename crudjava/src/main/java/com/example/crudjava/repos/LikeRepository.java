package com.example.crudjava.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudjava.entities.Like;

public interface LikeRepository extends JpaRepository<Like, Long> {

}
