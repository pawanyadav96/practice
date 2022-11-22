package com.Runner;

import java.util.Scanner;

import com.Entity.Employee;
import com.Exception.EmployeeException;
import com.Service.EmployeeDao;
import com.Service.EmployeeDaoImpl;

public class GetEmployeeById {
	
	public static EmployeeDao dao=new EmployeeDaoImpl();
	
	
	public static void main(String[] args) throws EmployeeException {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter employee id to find all his details");
		
		int id=sc.nextInt();
		
	Employee emp=dao.getEmployeeById(id);
	
	if(emp!=null) {
		System.out.println(emp);
		
	}

}
}