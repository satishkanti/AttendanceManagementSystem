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

import com.kanti.attendancemanagementsystem.entities.Course;
import com.kanti.attendancemanagementsystem.service.CourseService;

@RestController
public class CourseController {
    
    @Autowired
    CourseService courseService;

    @PostMapping("api/createCourse")
    ResponseEntity<Course> createCourse(@RequestBody Course course){
        return new ResponseEntity<Course>(courseService.createCourse(course),HttpStatus.CREATED);
    }

    @GetMapping("api/getAllCourses")
    List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/getCourseById/{id}")
    Course getCourseById(@PathVariable int id){
        return courseService.getCourseById(id);
    } 

    @PutMapping("/updateCourse/{id}")
    Course updateCourse(@PathVariable int id, @RequestBody Course course){
        return courseService.updateCourse(id, course);
    }

    @DeleteMapping("/deleteCourse/{id}")
    String deleteCourse(@PathVariable int id){
        return courseService.deleteCourse(id);
    }

    @PostMapping("/assignment/{crid}/{sid}")
    public String assignStudentToCourse(@PathVariable("crid") int crid, @PathVariable("sid") int sid){
        return courseService.assignStudentToCourse(crid, sid);
    }
}
