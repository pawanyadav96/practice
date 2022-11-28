package com.Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Util {
	
private static EntityManagerFactory emf;  
	
	static {
		emf =Persistence.createEntityManagerFactory("studentCourse");  
	}
	
	public static EntityManager provideEntity() {
		

		
		return emf.createEntityManager();
	}

}
