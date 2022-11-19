package com.service;

import com.entity.Employee;
import com.exception.employeeexception;

public interface Dao {
	
	public void save(Employee emp) throws employeeexception;
	public Employee findbyid(Integer id);
	public String getAddressOfEmployee(int empId) ;
	public String giveBonusToEmployee(int empId, int bonus);
	public boolean deleteEmployee(int empId);

}
