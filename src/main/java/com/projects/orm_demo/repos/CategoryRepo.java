package com.projects.orm_demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.orm_demo.entities.Category;

public interface CategoryRepo extends  JpaRepository<Category, String> {


}
