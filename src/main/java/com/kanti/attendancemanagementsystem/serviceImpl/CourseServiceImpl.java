package com.kanti.attendancemanagementsystem.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanti.attendancemanagementsystem.entities.Course;
import com.kanti.attendancemanagementsystem.entities.Student;
import com.kanti.attendancemanagementsystem.exception.ResourceNotFoundException;
import com.kanti.attendancemanagementsystem.repository.CourseRepository;
import com.kanti.attendancemanagementsystem.repository.StudentRepository;
import com.kanti.attendancemanagementsystem.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Course createCourse(Course course) {
        Course c = courseRepository.save(course);
        return c;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(int id) {
        Course c = courseRepository.findById(id).orElseThrow(()->
        new ResourceNotFoundException("Course", "ID", id));
        return c;
    }

    @Override
    public Course updateCourse(int id, Course course) {
        Course c = courseRepository.findById(id).get();
        c.setCode(course.getCode());
        c.setCredit(course.getCredit());
        c.setTitle(course.getTitle());

        Course c1 = courseRepository.save(c); 
        return c1;
    }

    @Override
    public String deleteCourse(int id) {
        courseRepository.deleteById(id);
        return "Course got deleted successfully!";
    }

    @Override
    public String assignStudentToCourse(int crid, int sid) {
        Student s=studentRepository.findById(sid).orElseThrow(()->
		new ResourceNotFoundException("Student", "Id", sid));
		
		Course cr = courseRepository.findById(crid).orElseThrow(()->
		new ResourceNotFoundException("Course", "Id", crid));
		
		List<Student> students=new ArrayList<>();
		students.add(s);
		
		//assign students to course
		cr.setStudents(students);
		
		//assign course to student
		s.setCourse(cr);
		
		courseRepository.save(cr);
		return "Students assigned to Course successfully";
    }
    
}
