package com.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Entity.Employee;
import com.Exception.EmployeeException;

public class EmployeeDaoImpl implements EmployeeDao {
	
	
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("empUnit");
		
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		
		
		
		et.begin();
		
		em.persist(employee);
		
		et.commit();
		
		em.close();
		
		return employee;
	}

	public Employee getEmployeeById(int empId) throws EmployeeException {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("empUnit");
		
		EntityManager em=emf.createEntityManager();
		
		Employee emp=em.find(Employee.class, empId);
		if(emp!=null) {
			return emp;
			
		}
		else {
			throw new EmployeeException("no employee");
		}
		
		
	}

	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		
EntityManagerFactory emf=Persistence.createEntityManagerFactory("empUnit");
		
		EntityManager em=emf.createEntityManager();
		
		Employee emp=em.find(Employee.class, empId);
        EntityTransaction et=em.getTransaction();
	
		et.begin();
		if(emp!=null) {
		em.remove(emp);
		et.commit();
		em.close();
		return emp;
		}
		else {
			throw new EmployeeException("employee not found");
		}
		
		
}

	public Employee updateEmployee(Employee employee) throws EmployeeException {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("empUnit");
		
		EntityManager em=emf.createEntityManager();
		
		
        EntityTransaction et=em.getTransaction();
        
        et.begin();
        em.merge(employee);
        et.commit();
        em.close();
	
		return employee;
	}

	

}
