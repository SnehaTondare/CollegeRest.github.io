package com.stmicroservices.project.CollegeRest.Services;

import java.util.List;

import com.stmicroservices.project.CollegeRest.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long CourseId);

	public Course addCourse(Course course);
}
