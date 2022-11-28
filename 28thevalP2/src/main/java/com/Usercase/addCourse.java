package com.Usercase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Service.Dao;
import com.Service.DaoImpl;
import com.entity.Course;
import com.entity.Student;

public class addCourse {
	
	
	
	public static Dao dao=new DaoImpl();
	public static void main(String[]args) {
		
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter course name");
		String courname=sc.next();
		
		System.out.println("Enter course duration");
		int dur=sc.nextInt();
		
		System.out.println("enter course fees");
		int fee=sc.nextInt();
		
		Course cr=new Course();
		cr.setCourseName(courname);
		cr.setDuration(dur);
		cr.setFee(fee);
		
		
		
		Student st1=new Student();
		System.out.println("enter student name");
		String sname=sc.next();
		
		System.out.println("enter email");
		String email=sc.next();
		
		System.out.println("enter mobile");
		int mob=sc.nextInt();
		
		st1.setName(sname);
		st1.setEmail(email);
		st1.setMobile(mob);
		st1.setCourse(cr);
		 Student stu2=new Student();
			System.out.println("enter student name");
			String s2name=sc.next();
			
			System.out.println("enter email");
			String email2=sc.next();
			
			System.out.println("enter mobile");
			int mob2=sc.nextInt();
		 
			List<Student> stu1=new ArrayList<>();
			
			stu1.add(stu2);
			stu1.add(st1);
			
			cr.setStu(stu1);
		dao.addCourse(cr);
		
		
		
		
		
		
	}
	

}
