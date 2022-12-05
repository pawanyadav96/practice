package com.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	
	
private static EntityManagerFactory emf; 
	
	static {
		emf =Persistence.createEntityManagerFactory("GYM1assignment");  
	}
	
	public static EntityManager provideEntity() {
		
		
		return emf.createEntityManager();
	}

}
