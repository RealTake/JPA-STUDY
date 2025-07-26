package com.study.entity;

import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

/**
 *  엔티티 기본 항목이므로 abstract로 선언
 */
@MappedSuperclass
public abstract class BaseEntity {
    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdDt;
    private LocalDateTime updatedDt;

    // Getters and Setters
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(LocalDateTime createdAt) {
        this.createdDt = createdAt;
    }

    public LocalDateTime getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(LocalDateTime updatedAt) {
        this.updatedDt = updatedAt;
    }
}
