package com.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.entity.Employee;
import com.exception.employeeexception;
import com.utility.Util;

public class Daoimpl implements Dao {

	@Override
	public void save(Employee emp) throws employeeexception{
		// TODO Auto-generated method stub
		
		
		
		EntityManager em=Util.provideEntitymanager();
		
		EntityTransaction et=em.getTransaction();
		
		
		et.begin();
		
		em.persist(emp);
		
		et.commit();
		
		em.close();
	
		}

	

	@Override
	public String getAddressOfEmployee(int empId) {
		
		String s="Not found";
		// TODO Auto-generated method stub
		EntityManager em=Util.provideEntitymanager();
		
		Employee emp=em.find(Employee.class, empId);
		
		if(emp!=null) {
			
			System.out.println(emp.getAddress());
		}else 
		{
			System.out.println(s);
		}
		
		
		return s;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		// TODO Auto-generated method stub
		String s="employee not found with the id";
		EntityManager em=Util.provideEntitymanager();
		
		Employee emp=em.find(Employee.class, empId);
		
		EntityTransaction et=em.getTransaction();
		
		if(emp!=null) {
			
			emp.setSalary(emp.getSalary()+bonus);
			
			et.begin();
			
			em.persist(emp);
			
			et.commit();
			
			em.close();
			
			
		}
		
		
		
		return s;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		
		boolean flag=false;
		EntityManager em=Util.provideEntitymanager();
		
	 EntityTransaction et=em.getTransaction();
	 
	Employee emp= em.find(Employee.class, empId);
	
	if(emp!=null) {
		
		et.begin();
		
		em.remove(emp);
		
		flag=true;
		System.out.println("employee deleted");
		
		et.commit();
		
		em.close();
		}
		
		return flag;
	}



	@Override
	public Employee findbyid(Integer id) {
		
		EntityManager em=Util.provideEntitymanager();
		
	Employee emp=	em.find(Employee.class, id);
	
	return emp;
	
		
	}

}
