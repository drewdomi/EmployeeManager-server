package com.drewdomi.employeemanager.employee;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    @Column(name = "mother_name")
    private String motherName;

    @Column(unique = true)
    private String rg;

    @Column(unique = true)
    private String cpf;

    @Column(name = "birth_date")
    private String birthDate;

    private String plan;

    @Column(name = "admission_date")
    private String admissionDate;

    @Column(name = "validity_date")
    private String validityDate;

    @Column(unique = true)
    private String registration;

    private Boolean deleted;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        this.deleted = false;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}

