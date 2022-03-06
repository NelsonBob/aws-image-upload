package com.example.awsimageupload.use_case_student.service;

import com.example.awsimageupload.use_case_student.dao.StudentRepository;
import com.example.awsimageupload.use_case_student.entity.Student;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class StudentService {


    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Collection<Student> getAllStudents(){
        return this.studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id){
        return this.studentRepository.findById(id);
    }


    public void removeStudentById(Long id) {
        this.studentRepository.deleteById(id);
    }

    public void updateStudent(Student student){
       Student studentToUpdate =  studentRepository.getByName(student.getId());
       studentToUpdate.setCourse(student.getCourse());
       studentToUpdate.setName(student.getName());
       studentToUpdate.setId(student.getId());
        this.studentRepository.save(student);
    }

    public void insertStudent(Student student) {
        this.studentRepository.save(student);
    }
}
