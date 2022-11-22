package com.Runner;

import java.util.Scanner;

import com.Entity.Employee;
import com.Exception.EmployeeException;
import com.Service.EmployeeDao;
import com.Service.EmployeeDaoImpl;

public class DeleteEmployee {
	
	public static EmployeeDao dao=new EmployeeDaoImpl();
	
	
	public static void main(String[]args) throws EmployeeException {
		
        Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter employee id to find all his details");
		
		int id=sc.nextInt();
		
		
		
		Employee emp=dao.deleteEmployeeById(id);
		
		if(emp==null) {
			throw new EmployeeException("employee not found");
		}
		else {
			System.out.println(emp);
		}
		
	}

}
