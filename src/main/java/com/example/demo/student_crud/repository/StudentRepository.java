package com.example.demo.student_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.student_crud.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
