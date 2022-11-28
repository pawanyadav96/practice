package com.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert2user {
	
	public static void main(String[]args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("question1");
	
	EntityManager em=emf.createEntityManager();

	//EntityTransaction et=em.getTransaction();		
	User user1=new User();
  
	user1.setUserId(1);
	user1.setUserName("nrupul");
	user1.setEmailid("nrupul@gmail.com");
	user1.getPh().add(new Phoneno(1,12364,"Home"));
	user1.getPh().add(new Phoneno(2,15654,"Landline"));
	user1.getPh().add(new Phoneno(3,12364,"Office"));
	
	User user2=new User();
	  
	user2.setUserId(2);
	user2.setUserName("albert");
	user2.setEmailid("nrupul@gmail.com");
	user2.getPh().add(new Phoneno(1,992364,"Home"));
	user2.getPh().add(new Phoneno(2,995654,"Landline"));
	user2.getPh().add(new Phoneno(3,18962364,"Office"));
	
	em.getTransaction().begin();
	
	em.persist(user2);
	//em.persist(user1);
	System.out.println("done");
	em.getTransaction().commit();
	em.close();
	
	
	
	

}
}
