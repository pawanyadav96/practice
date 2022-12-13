package com.ACC.services;

import javax.security.auth.login.AccountException;

import com.ACC.Exception.Accountexception;
import com.ACC.Exception.InsufficientFundException;
import com.ACC.Model.Account;
import com.ACC.Model.AccountDto;

public interface Accountdao {
	
	public Account openAccount(Account acc)throws Accountexception;
	
	public Account closeAccount(Integer accno)throws Accountexception;
	
	
	public Account depositAmount(Integer accno, Integer amount)throws Accountexception;
	
	public Account withdrawAmount(int accno, Integer amount)throws Accountexception,InsufficientFundException;
	
	public String transferAmount(AccountDto dto)throws Accountexception, InsufficientFundException;
	

	
}
