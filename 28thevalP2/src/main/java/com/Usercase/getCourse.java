package com.Usercase;

import java.util.Scanner;

import com.Exception.CourseNotFoundException;
import com.Service.Dao;
import com.Service.DaoImpl;

public class getCourse {
	
	public static Dao dao=new DaoImpl();
public static void main(String[]args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter course id");
	int id=sc.nextInt();
	
	try {
	dao.getCourse(id);
	} catch (CourseNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
}
}
