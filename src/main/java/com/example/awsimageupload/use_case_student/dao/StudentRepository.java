package com.example.awsimageupload.use_case_student.dao;

import com.example.awsimageupload.use_case_student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student getByName(Long id);
}