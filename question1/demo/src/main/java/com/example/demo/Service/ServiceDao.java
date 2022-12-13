package com.example.demo.Service;

import java.util.List;

import com.example.demo.Exception.Customerexception;
import com.example.demo.Model.Customer;
import com.example.demo.Model.CustomerDto;

public interface ServiceDao {
	
	public Customer registerCustomer(Customer Customer)throws Customerexception;
	
	public Customer getCustomerById(Integer customerId)throws Customerexception;
	
	public List<Customer> getAllCustomerDetails()throws Customerexception;
	
	//public Customer loginCustomer(String email, String password)throws Customerexception;

	
	public Customer deleteCustomerById(Integer customerId)throws Customerexception;
	
	public List<Customer> getCustomerDetailsByAddress(String address)throws Customerexception;
	
	public Customer updateCustomer(Customer customer)throws Customerexception;
	
	public List<CustomerDto> getNameAddressAgeOfAllCustomers()throws Customerexception;
	
//	public List<Customer> getCustomersBetweenAge(Integer start_age ,Integer end_age)throws Customerexception;

	
	

}
