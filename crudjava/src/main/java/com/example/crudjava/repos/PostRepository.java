package com.example.crudjava.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudjava.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
