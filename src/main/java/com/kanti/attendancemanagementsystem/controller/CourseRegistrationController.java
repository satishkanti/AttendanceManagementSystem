package com.kanti.attendancemanagementsystem.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kanti.attendancemanagementsystem.entities.CourseRegistration;
import com.kanti.attendancemanagementsystem.service.CourseRegistrationService;

@RestController
public class CourseRegistrationController {
    
    @Autowired
    private CourseRegistrationService courseRegistrationService;

    /*@PostMapping("/createCourseRegistration")
    ResponseEntity<CourseRegistration> registerCourseRegistration(@Valid @RequestBody CourseRegistration courseRegistration){
        return new ResponseEntity<>(courseRegistrationService.registerCourseRegistration(courseRegistration),HttpStatus.CREATED );
    }*/

    /*@PostMapping("/assignment/{cid}/{sid}")
    public String assignStudentToCourseRegistration(@PathVariable("cid") int cid, @PathVariable("sid") int sid){
        return courseRegistrationService.assignStudentToCourseRegistration(cid, sid);
    }*/
}
