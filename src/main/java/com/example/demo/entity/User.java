package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String role;
}
