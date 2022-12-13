package com.ACC.services;

import java.util.Optional;

import javax.security.auth.login.AccountException;

import org.springframework.beans.factory.annotation.Autowired;

import com.ACC.Exception.Accountexception;
import com.ACC.Exception.InsufficientFundException;
import com.ACC.Model.Account;
import com.ACC.Model.AccountDto;
import com.ACC.REPO.AccRepo;


public class AccountdaoImpl implements Accountdao {

	@Autowired
	public AccRepo accrepo;
	
	
	@Override
	public Account openAccount(Account acc) throws Accountexception {
		Account savedacc=accrepo.save(acc);
	     return savedacc;
		
	}


	@Override
	public Account closeAccount(Integer accno) throws Accountexception {
		Optional<Account> op=accrepo.findById(accno);
		
		if(op.isPresent()) {
			
			 Account acc=op.get();
			
			accrepo.delete(acc);
			return acc;
		}
			
		else {
			throw new Accountexception("account does not exist");
		}
			
		}


	@Override
	public Account depositAmount(Integer accno, Integer amount) throws Accountexception {
		Account acco= accrepo.findById(accno)
				.orElseThrow(() -> new Accountexception("Account does not exist "));
		
		acco.setBalance(acco.getBalance()+amount);
		
		return accrepo.save(acco);
		
	}


	@Override
	public Account withdrawAmount(int accno, Integer amount) throws  InsufficientFundException, Accountexception {
		Account acco= accrepo.findById(accno)
				.orElseThrow(() -> new Accountexception("Account does not exist "));
		
		acco.setBalance(acco.getBalance()-amount);
		
		return accrepo.save(acco);
	}


	@Override
	public String transferAmount(AccountDto dto) throws Accountexception, InsufficientFundException {
	
		  
		
		
		return null;
	}
	
	
	
}	
	
	
	


