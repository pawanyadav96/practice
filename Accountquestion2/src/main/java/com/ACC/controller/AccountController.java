package com.ACC.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ACC.Exception.Accountexception;
import com.ACC.Exception.InsufficientFundException;
import com.ACC.Model.Account;
import com.ACC.services.Accountdao;


@RestController
public class AccountController {
	
	@Autowired
	public Accountdao dao;
	
	
	@PostMapping("/Accounts")
	public ResponseEntity<Account> registerAccounthandler( @Valid @RequestBody Account acc) throws Accountexception{
		
			Account account=dao.openAccount(acc);
			 return new ResponseEntity<Account>(account,HttpStatus.CREATED);
			
	}
	
	@DeleteMapping("/Accountdeleted/{id}")
	public ResponseEntity<Account> deleteAccountHandler(@PathVariable("id") Integer id) throws Accountexception{
		Account deleted=dao.closeAccount(id);
		
		return new ResponseEntity<Account>(deleted,HttpStatus.OK);
	}
	@PutMapping("/Account/{accno}/{balance}")
	public ResponseEntity<Account> deposithandler(@PathVariable("accno") Integer accno, @PathVariable("balance") Integer balance)  throws Accountexception{
		
		Account updated= dao.depositAmount(accno, balance);
		
		return new ResponseEntity<Account>(updated,HttpStatus.ACCEPTED);

	

}
	@PutMapping("/Accountwithdrawl/{accno}/{balance}")
public ResponseEntity<Account> withdrawlHandler(@PathVariable("accno") Integer accno, @PathVariable("balance") Integer balance)  throws Accountexception,InsufficientFundException{
		
		Account updated= dao.withdrawAmount(accno, balance);
		
		return new ResponseEntity<Account>(updated,HttpStatus.ACCEPTED);

}
}