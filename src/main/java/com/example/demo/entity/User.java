package com.example.demo.entity;


import lombok.Data;

import jakarta.persistence.*;

@Entity
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String role;

}
