package com.Service;

import java.util.List;

import javax.persistence.EntityManager;

import com.Exception.CourseNotFoundException;
import com.Exception.StudentNotFoundException;
import com.Utility.Util;
import com.entity.Course;
import com.entity.Student;

public class DaoImpl implements Dao {
	
	EntityManager em=Util.provideEntity();

	public void addCourse(Course course) {
		
		em.getTransaction().begin();
		em.persist(course);
		
		em.getTransaction().commit();
		System.out.println("registered");
		
		em.close();
		
		
	}

	@Override
	public void getStudent(int roll_no) throws StudentNotFoundException {
		Student st=em.find(Student.class, roll_no);
		
		if(st==null) throw new StudentNotFoundException("studnt not found");
		Course cr=st.getCourse();
		System.out.println(cr.getCourseName());
		System.out.println(cr.getDuration());
		System.out.println(cr.getFee());
		
		
		
	}

	@Override
	public void getCourse(int course_id) throws CourseNotFoundException {
	Course crr=	em.find(Course.class, course_id);
	
	if(crr==null)throw new CourseNotFoundException("not found");
	
	System.out.println( "course is"+crr.toString());
	System.out.println("========================");
	
	List<Student> st=crr.getStu();
	
	for(Student s:st) {
		System.out.println(s.getName());
		System.out.println(s.getMobile());
		System.out.println(s.getEmail());
	}
		
	}

}
