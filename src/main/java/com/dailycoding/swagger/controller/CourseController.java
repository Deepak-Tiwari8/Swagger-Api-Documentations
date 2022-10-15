package com.dailycoding.swagger.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycoding.swagger.model.Course;
import com.dailycoding.swagger.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	CourseService courseService;

	@PostMapping("/")
	public Course saveCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	
	@GetMapping("/{courseId}")
	public Optional<Course> findCourseById(@PathVariable("courseId") int courseId)
	{
		return courseService.getCourseById(courseId);
	}
}
