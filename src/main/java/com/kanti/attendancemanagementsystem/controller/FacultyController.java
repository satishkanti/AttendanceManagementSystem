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

import com.kanti.attendancemanagementsystem.entities.Faculty;
import com.kanti.attendancemanagementsystem.service.FacultyService;

@RestController
public class FacultyController {
    
    @Autowired
    FacultyService facultyService;

    @PostMapping("api/createFaculty")
    ResponseEntity<Faculty> createFaculty(@RequestBody Faculty faculty){
        return new ResponseEntity<Faculty>(facultyService.createFaculty(faculty),HttpStatus.CREATED);
    }

    @GetMapping("api/getAllFaculties")
    List<Faculty> getAllFaculties(){
        return facultyService.getAllFaculties();
    }

    @GetMapping("/getFacultyById/{id}")
    Faculty getStudentById(@PathVariable int id){
        return facultyService.getFacultyById(id);
    } 

    @PutMapping("/updateFaculty/{id}")
    Faculty updateFaculty(@PathVariable int id, @RequestBody Faculty faculty){
        return facultyService.updateFaculty(id, faculty);
    }

    @DeleteMapping("/deleteFaculty/{id}")
    String deleteFaculty(@PathVariable int id){
        return facultyService.deleteFaculty(id);
    }
}
