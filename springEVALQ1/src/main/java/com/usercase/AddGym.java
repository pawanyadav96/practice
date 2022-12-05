package com.usercase;

import java.util.Scanner;

import com.entity.Gym;
import com.service.Dao;
import com.service.DaoImpl;

public class AddGym {
	public static Dao dao=new DaoImpl();
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter gym name");
		 String name=sc.next();
		 
		 System.out.println("Enter monthly fees");
		 int fees=sc.nextInt();
		 
		 Gym gym=new Gym();
		 gym.setGym_name(name);
		 
		 gym.setMonthly_fee(fees);
		 
		 dao.addGym(gym);
	
	}

}
