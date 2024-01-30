package com.kanti.attendancemanagementsystem.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String roll_no;
    private String name;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRoll_no() {
        return roll_no;
    }
    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String roll_no, String name) {
        super();
        this.id = id;
        this.roll_no = roll_no;
        this.name = name;
    } 

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "crid")
    @JsonIgnoreProperties("students")
    private Course course;

   
    public Student(int id, String roll_no, String name, Course course) {
        this.id = id;
        this.roll_no = roll_no;
        this.name = name;
        this.course = course;
    }
    public Student() {
        super();
    }
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    
    
}