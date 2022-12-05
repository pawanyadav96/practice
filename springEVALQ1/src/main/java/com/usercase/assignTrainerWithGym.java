package com.usercase;

import java.util.Scanner;

import com.exception.GymException;
import com.exception.TrainerException;
import com.service.Dao;
import com.service.DaoImpl;

public class assignTrainerWithGym {
	
	public static Dao dao=new DaoImpl();
	public static void main(String[]args) {
		  Scanner sc = new Scanner(System.in);
		 
		  System.out.println("enter trainer id");
		  int tid=sc.nextInt();
		  
		  System.out.println("enter gym id");
		  int gid=sc.nextInt();
		  
		  try {
			dao.assignTrainerWithGym(tid, gid);
		} catch (TrainerException t) {
			// TODO Auto-generated catch block
			System.out.println(t.getMessage());
		}
		  catch (GymException g) {
				// TODO Auto-generated catch block
				System.out.println(g.getMessage());
		  }
}
}