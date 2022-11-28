package com.Service;

import com.Exception.CourseNotFoundException;
import com.Exception.StudentNotFoundException;
import com.entity.Course;

public interface Dao {
	
	
public void addCourse(Course course);

public void getStudent(int roll_no) throws StudentNotFoundException;

public void getCourse(int course_id) throws CourseNotFoundException;
}
