package com.example.demo.Exception;

import java.time.LocalDateTime;

public class MyErrorDetail {
	
	private LocalDateTime timestamp;
	private String message;
	private String description;
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public MyErrorDetail(LocalDateTime timestamp, String message, String description) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}
	public MyErrorDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MyErrorDetail [timestamp=" + timestamp + ", message=" + message + ", description=" + description + "]";
	}
	
	

}
