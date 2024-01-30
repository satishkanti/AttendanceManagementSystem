package com.kanti.attendancemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanti.attendancemanagementsystem.entities.CourseRegistration;

public interface CourseRegistrationRepository extends JpaRepository<CourseRegistration, Integer>{
    
}
