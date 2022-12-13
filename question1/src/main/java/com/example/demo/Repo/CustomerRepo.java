package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.Customer;
import com.example.demo.Model.CustomerDto;



public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	
	
	public List<Customer> findByAddress(String address);
	
	
	@Query("select new com.example.demo.Model.CustomerDto(c.name,c.address, c.age) from Customer c ")
	public List<CustomerDto> getNameAddressAge();
	

}
