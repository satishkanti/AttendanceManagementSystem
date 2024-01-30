package com.kanti.attendancemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanti.attendancemanagementsystem.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{
    
}
