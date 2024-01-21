package com.example.crudjava.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "posts")
@Data
public class Post {

	@Id
	Long id;
	String user_id;
	String title;
	@Lob
	@Column(columnDefinition = "text")
	String text;
}
