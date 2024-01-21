package com.example.crudjava.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "likes")
@Data
public class Like {
    @Id
    Long id;
    Long post_id;
    Long user_id;
}
