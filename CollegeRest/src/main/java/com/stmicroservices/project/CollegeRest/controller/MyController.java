package com.stmicroservices.project.CollegeRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stmicroservices.project.CollegeRest.Services.CourseService;
import com.stmicroservices.project.CollegeRest.entities.Course;


@RestController
public class MyController {
	
	@Autowired
	private CourseService CourseServices;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to course application";		
	}
	
	
	@GetMapping("/Courses")
	public List<Course> getCourses()
	{
		return this.CourseServices.getCourses();
	}
	
	
	@GetMapping("/Courses/{CourseId}")
	public Course getCourse(@PathVariable String CourseId) 
	{
		return this.CourseServices.getCourse(Long.parseLong(CourseId));
		
	}
	
	@PostMapping("/Course")
	public Course addCourse(@RequestBody Course course)
	{
		return this.CourseServices.addCourse(course);
		
	}
	

}
