package com.kanti.attendancemanagementsystem.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanti.attendancemanagementsystem.entities.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Date>{
    
}
