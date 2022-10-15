package com.dailycoding.swagger.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycoding.swagger.dao.CourseRepository;
import com.dailycoding.swagger.model.Course;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;
	
	public Course addCourse(Course course)
	{
		return courseRepository.save(course);
	}
	
	public Optional<Course> getCourseById(int courseId) {
		return courseRepository.findById(courseId);
	}
}
