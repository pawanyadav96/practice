package com.Runner;

import java.util.Scanner;

import com.Entity.Employee;
import com.Exception.EmployeeException;
import com.Service.EmployeeDao;
import com.Service.EmployeeDaoImpl;

public class Update {
	
	public static EmployeeDao dao=new EmployeeDaoImpl();
	
	public static void main(String []args) throws EmployeeException {
		
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name of employee");
		String name=sc.next();
		
		System.out.println("Enter Adress of employee");
		String adress=sc.next();
		
		System.out.println("Enter salary of employee");
		int salary=sc.nextInt();
		
		 Employee emp=new Employee(name,adress,salary);
		
		dao.updateEmployee(emp);
		
	}

}
