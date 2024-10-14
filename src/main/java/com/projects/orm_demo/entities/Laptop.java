package com.projects.orm_demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_laptop")
public class Laptop {

    @Id
    private int laptopId;
    private String modelNo;
    private String brand;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Laptop(int laptopId, String modelNo, String brand) {
        this.laptopId = laptopId;
        this.modelNo = modelNo;
        this.brand = brand;
    }

    public Laptop() {
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
