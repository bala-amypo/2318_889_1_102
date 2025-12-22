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

    @PrePersist
    public void prePersist() {
        this.sentAt = LocalDateTime.now();
    }
}
