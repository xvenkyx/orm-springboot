package com.projects.orm_demo.entities;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_product")
public class Product {

    @Id
    private String pId;
    private String pName;

    @ManyToMany(mappedBy = "products")
    private List<Category> categories = new ArrayList<>();

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Product(String pId, String pName) {
        this.pId = pId;
        this.pName = pName;
    }

    public Product() {
    }

}
