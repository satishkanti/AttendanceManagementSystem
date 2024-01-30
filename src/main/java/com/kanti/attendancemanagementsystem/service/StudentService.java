package com.kanti.attendancemanagementsystem.service;

import java.util.List;

import com.kanti.attendancemanagementsystem.entities.Student;

public interface StudentService {
    
    Student createStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(int id);
    Student updateStudent(int id,Student student);
    String deleteStudent(int id);
}
