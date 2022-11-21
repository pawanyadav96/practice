package Services;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;



import Entity.Account;
import Utility.Util;

public class DaoImpl implements stateBankDao{

	public Account findAccountById(int id) {
		
		EntityManager em=Utility.Util.provideEntitymanager();
		Account acc=em.find(Account.class, id);
		
		return acc;
	}

	public String saveAccount(Account account) {
		
		EntityManager em=Util.provideEntitymanager();
		
    EntityTransaction et=em.getTransaction();
    
	
		
		et.begin();
		
		em.persist(account);
		
		et.commit();
		
		em.close();
		
		return "Account saved";
	}

	public String deleteAccountById(int id) {
	 String s="wirhdrawl";
		EntityManager em=Util.provideEntitymanager();
		
	 EntityTransaction et=em.getTransaction();
	 
	Account acc= em.find(Account.class,id);
	
	if(acc!=null) {
		
		et.begin();
		
		em.remove(acc);
		
		s="account deleted";

		
		et.commit();
		
		em.close();
		}
		return s;
	}

	public String withdrawFromAccount(double amount, int accountId) {
	String s="Account not found";
	EntityManager em=Util.provideEntitymanager();
	
	Account acc= em.find(Account.class, accountId);
	
	EntityTransaction et=em.getTransaction();
	
	if(acc!=null) {
		
		acc.setBalance(acc.getBalance()-amount);
		
		et.begin();
		
		em.persist(acc);
		
		et.commit();
		
		em.close();
	
	}
	return s;
	}

	public String depositInAccount(double amount, int accountId) {
		String s="Added";
		EntityManager em=Util.provideEntitymanager();
		
		Account acc= em.find(Account.class, accountId);
		
		EntityTransaction et=em.getTransaction();
		
		if(acc!=null) {
			
			acc.setBalance(acc.getBalance()+amount);
			
			et.begin();
			
			em.persist(acc);
			
			et.commit();
			
			em.close();
		
		
	}
		return s;
	

}
}
