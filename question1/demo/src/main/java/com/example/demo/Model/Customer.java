package com.example.demo.Model;







import org.hibernate.validator.constraints.Range;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer customerId;
	
     @Size(min = 3,max = 10, message = "length must be greater than 3 ")
	 private String customerName;
     @Size(min = 3,max = 15, message = "length must be greater than 3 ")
	 private String address;
	 
	 @Size(min=18,message="Age must be 18")
	private Integer age ;
	 @Email
	private String email;
	 @Range(min = 10,max= 10, message = "phone no should be of 10 characters." )
	private Integer mobile ;
	 @Size(min = 8,max = 15, message = "length must be greater than 3 ")
	private String password ;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer customerId,
			@Size(min = 3, max = 10, message = "length must be greater than 3 ") String customerName,
			@Size(min = 3, max = 15, message = "length must be greater than 3 ") String address,
			@Size(min = 18, message = "Age must be 18") Integer age, @Email String email,
			@Range(min = 10, max = 10, message = "phone no should be of 10 characters.") Integer mobile,
			@Size(min = 8, max = 15, message = "length must be greater than 3 ") String password) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.age = age;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", age=" + age + ", email=" + email + ", mobile=" + mobile + ", password=" + password + "]";
	}
	

}
