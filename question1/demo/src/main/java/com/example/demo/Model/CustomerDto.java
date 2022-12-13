package com.example.demo.Model;

public class CustomerDto {
	
	
	private String name;
	private String address;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public CustomerDto(String name, String address, Integer age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomerDto [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	
	
	

}
