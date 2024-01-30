package com.kanti.attendancemanagementsystem.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Attendance {
    // @Id
    private int faculty_id;

    // @Id
    private int course_id;

    // @Id
    private int student_id;

    @Id
    private Date date;

    private String status;

    public int getFaculty_id() {
        return faculty_id;
    }

    public void setFaculty_id(int faculty_id) {
        this.faculty_id = faculty_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Attendance(int faculty_id, int course_id, int session_id, int student_id, Date date, String status) {
        super();
        this.faculty_id = faculty_id;
        this.course_id = course_id;
        this.student_id = student_id;
        this.date = date;
        this.status = status;
    }

    
}
