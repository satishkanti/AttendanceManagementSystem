package com.kanti.attendancemanagementsystem.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanti.attendancemanagementsystem.entities.Course;
import com.kanti.attendancemanagementsystem.entities.CourseRegistration;
import com.kanti.attendancemanagementsystem.entities.Student;
import com.kanti.attendancemanagementsystem.exception.ResourceNotFoundException;
import com.kanti.attendancemanagementsystem.repository.CourseRegistrationRepository;
import com.kanti.attendancemanagementsystem.repository.CourseRepository;
import com.kanti.attendancemanagementsystem.repository.StudentRepository;
import com.kanti.attendancemanagementsystem.service.CourseRegistrationService;

@Service
public class CourseRegistrationServiceImpl implements CourseRegistrationService{

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;


    /*public CourseRegistration registerCourse(Course course) {
        return courseRepository.save(course);
    }*/

    /*@Override
    public String assignStudentToCourseRegistration(int cid, int sid) {
        Student s=studentRepository.findById(sid).orElseThrow(()->
		new ResourceNotFoundException("Student", "Id", sid));
		
		Course cr = courseRepository.findById(cid).orElseThrow(()->
		new ResourceNotFoundException("Course", "Id", cid));
		
		List<Student> students=new ArrayList<>();
		students.add(s);
		
		//assign students to course
		cr.setStudents(students);
		
		//assign course to student
		s.setCourse(cr);
		
		courseRepository.save(cr);
		return "Students assigned to Course successfully";
    }*/
    
}
