package com.usercase;

import java.util.List;
import java.util.Scanner;

import com.entity.Person;
import com.exception.GymException;
import com.service.Dao;
import com.service.DaoImpl;



public class getAllPersonByGymName {
	
	public static Dao dao=new DaoImpl();
	public static void main(String[]args) {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("enter gym name");
		  String name=sc.next();
		  
		  try {
	List<Person> person=dao.getAllthePersonByGymName(name);
	for(Person p:person) 
	{
		System.out.println(p);
	}
	
		} catch (GymException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		  

}
}