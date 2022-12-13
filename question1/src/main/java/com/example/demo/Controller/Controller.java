package com.example.demo.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Exception.Customerexception;
import com.example.demo.Model.Customer;
import com.example.demo.Model.CustomerDto;
import com.example.demo.Service.ServiceDao;

public class Controller {
	@Autowired
	public ServiceDao sdao;
	
	
	@PostMapping("/Customer")
	public ResponseEntity<Customer> registerCustomer( @jakarta.validation.Valid @RequestBody Customer cus) throws Customerexception{
		
			Customer customer=sdao.registerCustomer(cus);
			 return new ResponseEntity<Customer>(customer,HttpStatus.CREATED);
			
	}
	@GetMapping("/Customer/{Id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("Id") Integer Id)throws Customerexception{
		
		Customer customer= sdao.getCustomerById(Id);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		
	}
	@GetMapping("/Customer")
	public ResponseEntity<List<Customer>> getAllCustomer()throws Customerexception{
		
		List<Customer> customer= sdao.getAllCustomerDetails();
		return new ResponseEntity<List<Customer>>(customer,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/Customer/{Id}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable("Id") Integer Id)throws Customerexception{
		
		Customer customer= sdao.deleteCustomerById(Id);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		
	}
	
	@GetMapping("/CustomerByAdress/{add}")
	public ResponseEntity<List <Customer>> getCustomerByAdress(@PathVariable("add") String add)throws Customerexception{
		
		List<Customer> customer=sdao.getCustomerDetailsByAddress(add);
		return new ResponseEntity<List<Customer>>(customer,HttpStatus.OK);
		
	}
	@PutMapping("/Customer")
	public ResponseEntity<Customer> updateEmployeeHandler(@RequestBody Customer cuss) throws Customerexception{
		
		Customer updatedcustomer= sdao.updateCustomer(cuss);
		
		
		return new ResponseEntity<Customer>(updatedcustomer,HttpStatus.ACCEPTED);
	
	
	}
	
	@GetMapping("/Customers/nameAndAdressAndAge")
	public ResponseEntity<List<CustomerDto>> getNameAndAdressByImpId() throws Customerexception{
		
List<CustomerDto> results=sdao.getNameAddressAgeOfAllCustomers();
		
		
		return new ResponseEntity<List<CustomerDto>>(results,HttpStatus.OK);
	}
	
	

}
