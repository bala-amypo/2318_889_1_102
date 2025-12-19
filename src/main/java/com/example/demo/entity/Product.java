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
        this.modelNumber=modelNumber;
        this.category=category;
    }
    public Long getId() {return id; }
    public void setId(Long id) {this.id=id; }
    public Sting getName() { return name; }
    public void setName(String name) {this.name=name; }
    public Sting getBrand() {this.brand=brand; }
    public String setBrand() {this.brand=brand; }
    public String getModelNumber(String modelNumber) {this.modelNumber=modelNumber; }
    public String setModelNumber(String modelNumber) {this.modelNumber=modelNumber; }
    public String getCategory(String USER) {this.USER=USER; }
    public String setCategory(String USER) {this.USER=USER; }
}