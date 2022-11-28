package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rollNo ;
	private String name ;
	private String email ;
	private int mobile;
	
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Course course;



	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getRollNo() {
		return rollNo;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getMobile() {
		return mobile;
	}



	public void setMobile(int mobile) {
		this.mobile = mobile;
	}



	public Course getCourse() {
		return course;
	}



	public void setCourse(Course course) {
		this.course = course;
	}



	public Student(int rollNo, String name, String email, int mobile, Course course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.course = course;
	}



	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", course="
				+ course + "]";
	}
	
	
	
	
}
