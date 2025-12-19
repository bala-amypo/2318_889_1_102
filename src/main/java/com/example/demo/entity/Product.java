package com.example.demo.model;
import java.timr.LocalDateTime;
import jakarta.persistence;
@Entity
@Table(name="Product")
public class user{
    @Id
    @GenerateValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique=true)
    private String brand;
    private String modelNumber;
    private String category;
    public Product() {}
    public Product(Long id,String name,String brand,String modelNumber,String category){
        this.id=id;
        this.name=name;
        this.brand=brand;
        this.password=;
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