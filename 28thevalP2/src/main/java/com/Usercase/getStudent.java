package com.Usercase;

import java.util.Scanner;

import com.Exception.StudentNotFoundException;
import com.Service.Dao;
import com.Service.DaoImpl;

public class getStudent {
	
	public static Dao dao=new DaoImpl();
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student roll number");
		int roll=sc.nextInt();
		try {
		dao.getStudent(roll);
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
