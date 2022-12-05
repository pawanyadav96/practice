package com.usercase;

import java.util.Scanner;

import com.entity.Gym;
import com.entity.Trainer;
import com.service.Dao;
import com.service.DaoImpl;

public class AddTrainer {
	
	
	public static Dao dao=new DaoImpl();
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter Trainer name");
		 String name=sc.next();
		 
		 System.out.println("Enter year of experience");
		 int fees=sc.nextInt();
		 
		 System.out.println("enter Trainer email");
		 String email=sc.next();
		 Trainer trainer=new Trainer();
		 trainer.setTrainer_name(name);
		 trainer.setYear_of_experience(fees);
		 trainer.setEmail(email);
		 
		 
		 dao.registerTrainer(trainer);
		
	
	}
}
