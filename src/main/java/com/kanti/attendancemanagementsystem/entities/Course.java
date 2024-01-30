package com.kanti.attendancemanagementsystem.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private String title;
    private int credit;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getCredit() {
        return credit;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Course(int id, String code, String title, int credit) {
        super();
        this.id = id;
        this.code = code;
        this.title = title;
        this.credit = credit;
    }
    public Course() {
        super();
    }

    @OneToMany(mappedBy = "course", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties("course")
    List<Student> students;

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
}
