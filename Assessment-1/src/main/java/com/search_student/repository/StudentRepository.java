package com.search_student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.search_student.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
