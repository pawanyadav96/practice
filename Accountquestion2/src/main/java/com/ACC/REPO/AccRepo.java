package com.ACC.REPO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ACC.Exception.Accountexception;
import com.ACC.Exception.InsufficientFundException;
import com.ACC.Model.Account;
import com.ACC.Model.AccountDto;

public interface AccRepo extends JpaRepository<Account, Integer>{
	
	

	
	
	

}
