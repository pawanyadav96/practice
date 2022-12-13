package com.ACC.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer	accountNo;
	@Size(min = 3,max = 8, message = "length must be greater than 3 ")
	private String accountHolderName;
	@Size(min = 3,max = 8, message = "length must be greater than 3 ")
private String	address;
	@Size(min = 3,max = 8, message = "length must be greater than 3 ")
	private String email;
	@Size(min=10000)
	private double balance;
	@Size(min = 10)
	private String mobile;
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", address=" + address
				+ ", email=" + email + ", balance=" + balance + ", mobile=" + mobile + "]";
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(Integer accountNo,
			@Size(min = 3, max = 8, message = "length must be greater than 3 ") String accountHolderName,
			@Size(min = 3, max = 8, message = "length must be greater than 3 ") String address,
			@Size(min = 3, max = 8, message = "length must be greater than 3 ") String email, double balance,
			@Size(min = 10) String mobile) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.address = address;
		this.email = email;
		this.balance = balance;
		this.mobile = mobile;
	}
	public Integer getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	
	
	
	
	
	
	

}
