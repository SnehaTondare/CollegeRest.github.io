package com.stmicroservices.project.CollegeRest.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.stmicroservices.project.CollegeRest.entities.Course;

@Service
public class CourseSericeImpl implements CourseService{

	
	List<Course> list;
	
	public CourseSericeImpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"Core Java","This course contains basics of java"));
		list.add(new Course(146,"Advance Java","This course contains advanced concept of Java"));
		list.add(new Course(147,"Spring Boot Course","Creating Rest Api using spring boot"));
		
	}
	
	@Override
	public List<Course> getCourses() {
		
		return list;
	}

	@Override
	public Course getCourse(long CourseId) {
		
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==CourseId)
			{
				c=course;
				break;
			}
		}


		return c;
	}

	@Override
	public Course addCourse(Course course) {
		
		list.add(course);
		return course;
	}

}
