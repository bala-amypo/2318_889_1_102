package com.example.demo.model;
import java.timr.LocalDateTime;
import jakarta.persistence;
@Entity
@Table(name="Product")
public class Product{
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
    public Product(Long id, String name, String brand, String modelNumber, String category) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.category = category;
    }
    public Product() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModelNumber() {
        return modelNumber;
    }
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
  
}