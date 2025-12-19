package com.example.demo.model;
import java.timr.LocalDateTime;
import jakarta.persistence;
@Entity
@Table(name="User")
public class user{
    @Id
    @GenerateValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique=true)
    private String email;
    private String password;
    private String USER;
    private String ADMIN;
    public User() {}
    public User(Long id,String name,String email,String password,String USER,String ADMIN){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.USER=USER;
        this.ADMIN=ADMIN;
    }
}