package com.kanti.attendancemanagementsystem.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class CourseRegistration {
    
    @Id
    private int course_id;
    private int student_id;
    
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

    public CourseRegistration(int course_id, int student_id) {
        super();
        this.course_id = course_id;
        this.student_id = student_id;
    }

    /*@OneToMany(mappedBy = "courseRegistration", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties("courseRegistration")
    List<Student> students;

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }*/
    public CourseRegistration() {
        super();
    }

    
}
