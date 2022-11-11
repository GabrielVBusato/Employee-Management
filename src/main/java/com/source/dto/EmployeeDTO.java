/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.source.dto;

import com.source.model.EmployeeModel;

/**
 *
 * @author busat
 */
public class EmployeeDTO {
   
    private int id;
    private String name;
    private String role;
    private double baseSalary;
    private double distanceFromWork;
    private double serviceTime;
    private String createdAt;
    private int absencesFromWork;

    public int getAbsencesFromWork() {
        return absencesFromWork;
    }

    public void setAbsencesFromWork(int absencesFromWork) {
        this.absencesFromWork = absencesFromWork;
    }

    public EmployeeDTO(EmployeeModel employee) {
        this.id = employee.getId();
        this.name = employee.getName();
        this.role = employee.getRole();
        this.baseSalary = employee.getBaseSalary();
        this.distanceFromWork = employee.getDistanceFromWork();
        this.serviceTime = employee.getServiceTime();
        this.createdAt = employee.getCreatedAt();
        this.absencesFromWork = employee.getTotalAbsencesFromWork();
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setDistanceFromWork(double distanceFromWork) {
        this.distanceFromWork = distanceFromWork;
    }

    public void setServiceTime(double serviceTime) {
        this.serviceTime = serviceTime;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getDistanceFromWork() {
        return distanceFromWork;
    }

    public double getServiceTime() {
        return serviceTime;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" + "id=" + id + ", name=" + name + ", role=" + role + ", baseSalary=" + baseSalary + ", distanceFromWork=" + distanceFromWork + ", serviceTime=" + serviceTime + ", createdAt=" + createdAt + '}';
    }
    
    
    
}
