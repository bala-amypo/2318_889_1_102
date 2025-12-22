package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AlertLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Warranty warranty;

    private LocalDateTime sentAt;

    private String message;

    // ✅ Default (no-args) constructor
    public AlertLog() {
    }

    // ✅ Parameterized constructor
    public AlertLog(Long id, Warranty warranty,
                    LocalDateTime sentAt, String message) {
        this.id = id;
        this.warranty = warranty;
        this.sentAt = sentAt;
        this.message = message;
    }

    // ✅ Automatically set sentAt before persist
    @PrePersist
    public void prePersist() {
        this.sentAt = LocalDateTime.now();
    }

    // ✅ Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Warranty getWarranty() {
        return warranty;
    }

    public void setWarranty(Warranty warranty) {
        this.warranty = warranty;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
