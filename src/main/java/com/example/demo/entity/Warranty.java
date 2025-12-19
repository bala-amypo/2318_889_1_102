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
    public Warranty(Long id, com.example.demo.entity.LocalDate expiryDate, String serialNumber) {
        this.id = id;
        this.expiryDate = expiryDate;
        this.serialNumber = serialNumber;
    }
    @Column(unique=true)
    private String serialNumber;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public Warranty() {
    }

   
}