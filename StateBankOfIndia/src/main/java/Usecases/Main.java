package Usecases;

import java.util.Date;
import java.util.Scanner;
import Entity.Account;
import Services.DaoImpl;
import Services.stateBankDao;

public class Main {
	
	public static	stateBankDao dao=new DaoImpl();
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
			System.out.println("Enter Your Choice: "
					+"\n1. Save Account"
					+"\n2. Find account"
					+"\n3. delete account"
					+"\n4. withdrawl"
					+"\n5. deposit");
			
			int choice=sc.nextInt();
			
	  switch(choice){
	  case 1: System.out.println("enter email ");
	          String s=sc.next();
	  
	          System.out.println("enter address");
	          
	          String add=sc.next();
	  
	            
	          System.out.println("enter Balance");
	          
	          double bal=sc.nextInt();
	          
	          System.out.println("enter date");
	          
	          String date=sc.next();
	  
	          Account acc=new Account();
	          acc.setEmail(s);
	          acc.setAddress(add);
	          acc.setBalance(bal);
	          acc.setDate((java.sql.Date) new Date());
		  
	          
	          dao.saveAccount(acc);
		  break;
	  
	  
	  case 2:
		  
		  System.out.println("enter id to find account");
	         int id1=sc.nextInt();
		
			dao.findAccountById(id1);

		
			
		

			break;
	  case 3:
		  
		  System.out.println("enter the id to delete account");
	              int accid=sc.nextInt();
	   
	    dao.deleteAccountById(accid);
		
			
		
			break;
		
	  case 4:
		  System.out.println("enter id to find account");
		   int id2=sc.nextInt();

		     System.out.println("enter money to withdrawl");
		              double d=sc.nextDouble();
				
				dao.withdrawFromAccount(d, id2);
			Account accs=dao.findAccountById(id2);
				
				
				System.out.println("amount after withdrwl "+accs.getBalance());
	 break;
	

	  case 5:
		  System.out.println("enter id to find account");
		   int id3=sc.nextInt();

		     System.out.println("enter money to deposit");
		              double d2=sc.nextDouble();
				
				dao.withdrawFromAccount(d2, id3);
			Account accss=dao.findAccountById(id3);
				
				
				System.out.println("amount after deposit "+accss.getBalance());
	 break;
		
	}
			}
		}

}

		

