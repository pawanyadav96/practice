package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Exception.Customerexception;
import com.example.demo.Model.Customer;
import com.example.demo.Model.CustomerDto;
import com.example.demo.Repo.CustomerRepo;



public class ServiceDaoImpl implements ServiceDao{
	
	@Autowired
	public CustomerRepo crepo;
	

	@Override
	public Customer registerCustomer(Customer Customer) throws Customerexception {
		Customer customer=crepo.save(Customer);
		return customer;
	}

	@Override
	public Customer getCustomerById(Integer customerId) throws Customerexception {
		
		return crepo.findById(customerId)
				.orElseThrow(() -> new Customerexception(" does not exist with id "+customerId));
		
		
	}

	@Override
	public List<Customer> getAllCustomerDetails() throws Customerexception {
		List<Customer> customer=crepo.findAll();
		
		
		if(customer.size() == 0)
			throw new Customerexception("No record found");
		else
		
		return customer;
	}

	@Override
	public Customer deleteCustomerById(Integer customerId) throws Customerexception {
		
		Optional<Customer> customer=crepo.findById(customerId);
		
		if(customer.isPresent())
		{
		        Customer cuss=  customer.get();
		        
		        crepo.delete(cuss);
		        
		        return cuss;
		}
		
		else
		{
			throw new Customerexception("not found");
		}
		
	}

	@Override
	public List<Customer> getCustomerDetailsByAddress(String address) throws Customerexception {
		
	List<Customer>customers=crepo.findByAddress(address);
	 if(customers.size()!=0)
	 {
		 return customers;
	 }
	
	 else
	 {
		 throw new Customerexception("invalid address");
	 }
	}

	@Override
	public Customer updateCustomer(Customer customer) throws Customerexception {
		Optional<Customer> cuss=crepo.findById(customer.getCustomerId());
		
		  if(cuss.isPresent()) {
			  Customer cu=crepo.save(customer);
			  return cu;
		  }
		  else {
			  throw new Customerexception("No record found");
		  }
		
		
		
	}

	@Override
	public List<CustomerDto> getNameAddressAgeOfAllCustomers() throws Customerexception {
		List<CustomerDto> customers=crepo.getNameAddressAge();
		
		if(customers.size()==0)
		{
			throw new Customerexception("not found");
		}
		else
		{
			return customers;
		}
		
	}

	

	

}
