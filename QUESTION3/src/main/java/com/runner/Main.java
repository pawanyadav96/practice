package com.runner;

import java.util.Scanner;

import com.entity.Employee;
import com.exception.employeeexception;
import com.service.Dao;
import com.service.Daoimpl;

public class Main {
	
	
public static	Dao dao=new Daoimpl();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("Enter Your Choice: "
				+"\n1. Save Employee"
				+"\n2. Get address of employee"
				+"\n3. give bonus to employee"
				+"\n4. Delete employee"
				+"\n5. Exit");
		
		int choice=sc.nextInt();
		
  switch(choice){
  case 1: System.out.println("enter id ");
           int id=sc.nextInt();
  
          System.out.println("enter name");
          
          String name=sc.next();
  
            
          System.out.println("enter adress");
          
          String add=sc.next();
          
          System.out.println("enter salary");
          
          int salary=sc.nextInt();
  
          Employee emp=new Employee(id,name,add,salary);
	try {
		dao.save(emp);
	} catch (employeeexception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	  break;
  
  
  case 2:
	  
	  System.out.println("enter id to get adress of employee");
         int id1=sc.nextInt();
	
		dao.getAddressOfEmployee(id1);

		// TODO Auto-generated catch block
		
	

		break;
  case 3:
	  
	  System.out.println("enter the id of employee to give bonus");
              int empid=sc.nextInt();
   
     System.out.println("enter the bonus");
              int bonus=sc.nextInt();
		
		dao.giveBonusToEmployee(empid, bonus);
		Employee emps=dao.findbyid(empid);
		
		
		System.out.println("salary after bonus is "+emps.getSalary());
		break;
	
  case 4:
	  System.out.println("enter id to delete employee");
	   int deleteid=sc.nextInt();
	  dao.deleteEmployee(deleteid);
 break;
  default: 
	   System.out.println("Thank you");
	   break;

}
	}
	}
}
	
