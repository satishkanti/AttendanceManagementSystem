package com.kanti.attendancemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kanti.attendancemanagementsystem.entities.Student;
import com.kanti.attendancemanagementsystem.service.StudentService;

@RestController
public class StudentController {
    
    @Autowired
    StudentService studentService;

    @PostMapping("api/createStudent")
    ResponseEntity<Student> createStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(studentService.createStudent(student),HttpStatus.CREATED);
    }

    @GetMapping("api/getAllStudents")
    List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/getStudentById/{sid}")
    Student getStudentById(@PathVariable("sid") int id){
        return studentService.getStudentById(id);
    } 

    @PutMapping("/updateStudent/{id}")
    Student updateStudent(@PathVariable int id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    String deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
    }
    
}
