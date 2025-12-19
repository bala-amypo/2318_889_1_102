package com.example.demo.entity;

public class AlertLog {
    private Long id;
    private int daysBeforeExpiry;
    private boolean enabled;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getDaysBeforeExpiry() {
        return daysBeforeExpiry;
    }
    public void setDaysBeforeExpiry(int daysBeforeExpiry) {
        this.daysBeforeExpiry = daysBeforeExpiry;
    }
    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public AlertLog() {
    }
    public AlertLog(Long id, int daysBeforeExpiry, boolean enabled) {
        this.id = id;
        this.daysBeforeExpiry = daysBeforeExpiry;
        this.enabled = enabled;
    }
    
}
