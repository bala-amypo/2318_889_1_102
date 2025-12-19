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
    public Warranty() {}
    public Warranty(Long id,LocalDate expiryDate,String serialNumber){
        this.id=id;
        this.expiryDate=expiryDate;
        this.serialNumber=serialNumber;
    }
    public Long getId() {return id; }
    public void setId(Long id) {this.id=id; }
    public Sting getExpiryDate() { return expiryDate; }
    public void setExpiryDate(String expiryDate) {this.expiryDate=expiryDate; }
    public Sting getExpiryDate() {this.email=email; }
    public String setEmail() {this.email=email; }
    public String getSerialNumber(String serialNumber) {return serialNumber; }
    public String setSerialNumber(String serialNumber) {this.serialNumber=serialNumber; } }
}