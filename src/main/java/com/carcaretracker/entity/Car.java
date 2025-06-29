package com.carcaretracker.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String carNumber;
    private String model;
    private LocalDate insuranceExpiry;
    private LocalDate pollutionExpiry;
    private LocalDate serviceDue;
    private String email;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCarNumber() { return carNumber; }
    public void setCarNumber(String carNumber) { this.carNumber = carNumber; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public LocalDate getInsuranceExpiry() { return insuranceExpiry; }
    public void setInsuranceExpiry(LocalDate insuranceExpiry) { this.insuranceExpiry = insuranceExpiry; }
    public LocalDate getPollutionExpiry() { return pollutionExpiry; }
    public void setPollutionExpiry(LocalDate pollutionExpiry) { this.pollutionExpiry = pollutionExpiry; }
    public LocalDate getServiceDue() { return serviceDue; }
    public void setServiceDue(LocalDate serviceDue) { this.serviceDue = serviceDue; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
