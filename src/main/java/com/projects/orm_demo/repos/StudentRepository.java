package com.projects.orm_demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.orm_demo.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
