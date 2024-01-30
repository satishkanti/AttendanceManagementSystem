package com.kanti.attendancemanagementsystem.service;

import java.util.List;

import com.kanti.attendancemanagementsystem.entities.Faculty;

public interface FacultyService {
    
    Faculty createFaculty(Faculty faculty);
    List<Faculty> getAllFaculties();
    Faculty getFacultyById(int id);
    Faculty updateFaculty(int id, Faculty faculty);
    String deleteFaculty(int id);
}
