/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.source.model;

/**
 *
 * @author busat
 */
public class EmployeeModel {

    private int id;
    private String name;
    private String role;
    private double baseSalary;
    private double totalSalary;
    private int totalAbsencesFromWork;
    private double distanceFromWork;
    private double serviceTime;
    private String createdAt;

    public EmployeeModel(int id,
            String name,
            String role,
            double baseSalary,
            double totalSalary,
            int totalAbsencesFromWork,
            double distanceFromWork,
            double serviceTime,
            String createdAt) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
        this.totalSalary = totalSalary;
        this.totalAbsencesFromWork = totalAbsencesFromWork;
        this.distanceFromWork = distanceFromWork;
        this.serviceTime = serviceTime;
        this.createdAt = createdAt;
    }

    public EmployeeModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public int getTotalAbsencesFromWork() {
        return totalAbsencesFromWork;
    }

    public void setTotalAbsencesFromWork(int totalAbsencesFromWork) {
        this.totalAbsencesFromWork = totalAbsencesFromWork;
    }

    public double getDistanceFromWork() {
        return distanceFromWork;
    }

    public void setDistanceFromWork(double distanceFromWork) {
        this.distanceFromWork = distanceFromWork;
    }

    public double getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(double serviceTime) {
        this.serviceTime = serviceTime;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" + "id=" + id + ", name=" + name + ", role=" + role + ", baseSalary=" + baseSalary + ", totalSalary=" + totalSalary + ", totalAbsencesFromWork=" + totalAbsencesFromWork + ", distanceFromWork=" + distanceFromWork + ", serviceTime=" + serviceTime + ", createdAt=" + createdAt + '}';
    }

}
