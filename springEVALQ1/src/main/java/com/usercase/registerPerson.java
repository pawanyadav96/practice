package com.usercase;

import java.util.Scanner;

import com.entity.Person;
import com.exception.GymException;
import com.service.Dao;
import com.service.DaoImpl;

public class registerPerson {
	
	public static Dao dao=new DaoImpl();
	public static void main(String[]args) {
		  Scanner sc = new Scanner(System.in);
		
		  
		  System.out.println("name of person");
		
		  String name=sc.next();
		  
		  System.out.println("enter person email");
		  
		  String email=sc.next();
		  
		  System.out.println("enter mobileno");
		  int mbl=sc.nextInt();
		  
		  System.out.println("enter gym id");
		  int gym_id=sc.nextInt();
		  
		  
		  Person person=new Person();
		  person.setName(name);
		  person.setEmail(email);
		  person.setMobile(gym_id);
		  
		  
		  try {
			dao.registerPerson(person, gym_id);
		} catch (GymException e) {
			System.out.println(e.getMessage());
			
		}
	}

}
