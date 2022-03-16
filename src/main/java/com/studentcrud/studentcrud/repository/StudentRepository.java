package com.studentcrud.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentcrud.studentcrud.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}


