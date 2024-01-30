package com.kanti.attendancemanagementsystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanti.attendancemanagementsystem.entities.Faculty;
import com.kanti.attendancemanagementsystem.exception.ResourceNotFoundException;
import com.kanti.attendancemanagementsystem.repository.FacultyRepository;
import com.kanti.attendancemanagementsystem.service.FacultyService;

@Service
public class FacultyServiceImpl implements FacultyService{

    @Autowired
    FacultyRepository facultyRepository;
    @Override
    public Faculty createFaculty(Faculty faculty) {
        Faculty f = facultyRepository.save(faculty);
        return f;
    }

    @Override
    public List<Faculty> getAllFaculties() {
        return facultyRepository.findAll();
    }

    @Override
    public Faculty getFacultyById(int id) {
        Faculty f = facultyRepository.findById(id).orElseThrow(()->
        new ResourceNotFoundException("Faculty", "ID", id));
        return f;
    }

    @Override
    public Faculty updateFaculty(int id, Faculty faculty) {
        Faculty f = facultyRepository.findById(id).get();
        f.setUser_name(faculty.getUser_name());
        f.setName(faculty.getName());
        f.setPassword(faculty.getPassword());

        Faculty f1 = facultyRepository.save(f); 
        return f1;
    }

    @Override
    public String deleteFaculty(int id) {
        facultyRepository.deleteById(id);
        return "Faculty got deleted successfully!";
    }
    
}
