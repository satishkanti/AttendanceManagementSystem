package com.kanti.attendancemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanti.attendancemanagementsystem.entities.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer>{
    
}
