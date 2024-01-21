package com.example.crudjava.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudjava.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
