package com.kanti.attendancemanagementsystem.service;

import java.util.List;

import com.kanti.attendancemanagementsystem.entities.Course;

public interface CourseService {
    
    Course createCourse(Course course);
    List<Course> getAllCourses();
    Course getCourseById(int id);
    Course updateCourse(int id, Course course);
    String deleteCourse(int id);
    String assignStudentToCourse(int crid, int sid);
}
