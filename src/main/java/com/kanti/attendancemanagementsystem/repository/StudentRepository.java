package com.kanti.attendancemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanti.attendancemanagementsystem.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
    
}
