package com.entity;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class getallphoneno {
	public static void main(String[]args) throws UserNotFoundException {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("question1");
		
		EntityManager em=emf.createEntityManager();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter user id ");
		int id=sc.nextInt();
		
		User u=em.find(User.class, id);
	
	Set<Phoneno> ph=u.getPh();
	if(ph.size()==0) throw new UserNotFoundException("user not found");
System.out.println(ph.toString());
	
	
	}

}
