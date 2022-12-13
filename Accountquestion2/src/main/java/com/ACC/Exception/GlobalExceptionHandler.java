package com.ACC.Exception;



import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;






@ControllerAdvice
public class GlobalExceptionHandler {
	@org.springframework.web.bind.annotation.ExceptionHandler(Accountexception.class)
	public ResponseEntity<MyErrorDetail> employeExceptionHandler(Accountexception ee,WebRequest req){
		
		MyErrorDetail err=new MyErrorDetail();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ee.getMessage());
		err.setDescription(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetail>(err,HttpStatus.BAD_REQUEST);
		
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetail> ExceptionHandler(Exception se, WebRequest req) {
		
		MyErrorDetail err= new MyErrorDetail();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(se.getMessage());
		err.setDescription(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetail>(err,HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler
public ResponseEntity<MyErrorDetail> insufficientfundExceptionHandler(InsufficientFundException ife,WebRequest req){
		
		MyErrorDetail err=new MyErrorDetail();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ife.getMessage());
		err.setDescription(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetail>(err,HttpStatus.BAD_REQUEST);
		
	}
	

}
	
			
		

