package com.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Util {

	public static EntityManagerFactory emf;
	static {
		emf=Persistence.createEntityManagerFactory("empUnit");
		
	}
	public static EntityManager provideEntitymanager() {
		return emf.createEntityManager();
	}
	
}
