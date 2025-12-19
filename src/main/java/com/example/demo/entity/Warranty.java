package com.example.demo.model;
import java.timr.LocalDate;
import jakarta.persistence;
@Entity
@Table(name="Warranty")
public class Warranty{
    @Id
    @GenerateValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private LocalDate expiryDate;
    @Column(unique=true)
    private String serialNumber;
    public User() {}
    public User(Long id,String name,String email,String password,String USER,String ADMIN){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.USER=USER;
        this.ADMIN=ADMIN;
    }
    public Long getId() {return id; }
    public void setId(Long id) {this.id=id; }
    public Sting getName() { return name; }
    public void setName(String name) {this.name=name; }
    public Sting getEmail() {this.email=email; }
    public String setEmail() {this.email=email; }
    public String getPassword(String password) {this.password=password; }
    public String setPassword(String password) {this.password=password; }
    public String getUser(String USER) {this.USER=USER; }
    public String setUser(String USER) {this.USER=USER; }
    public String getAdmin(String ADMIN) {this.ADMIN=ADMIN; }
    public String setAdmin(String ADMIN) {this.ADMIN=ADMIN; }
}