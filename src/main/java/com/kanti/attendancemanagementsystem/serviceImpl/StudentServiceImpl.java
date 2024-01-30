package com.kanti.attendancemanagementsystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanti.attendancemanagementsystem.entities.Student;
import com.kanti.attendancemanagementsystem.exception.ResourceNotFoundException;
import com.kanti.attendancemanagementsystem.repository.StudentRepository;
import com.kanti.attendancemanagementsystem.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        
       Student stud = studentRepository.save(student);
       return stud;
        
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        Student s = studentRepository.findById(id).orElseThrow(()->
        new ResourceNotFoundException("Student", "ID", id));
        return s;
    }

    @Override
    public Student updateStudent(int id, Student student) {
       
        Student s = studentRepository.findById(id).get();
        s.setName(student.getName());
        s.setRoll_no(student.getRoll_no());

        Student stud = studentRepository.save(s); 
        return stud;
    }

    @Override
    public String deleteStudent(int id) {
        studentRepository.deleteById(id);
        return "Student got deleted successfully!";
    }
    
}
