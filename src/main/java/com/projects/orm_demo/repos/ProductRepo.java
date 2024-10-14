package com.projects.orm_demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.orm_demo.entities.Product;

public interface ProductRepo extends  JpaRepository<Product,String> {
    

}
