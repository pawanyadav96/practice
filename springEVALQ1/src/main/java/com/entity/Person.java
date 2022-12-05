package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int person_id ;
	private String name ;
	private String email ;
	private int mobile;

	 @ManyToMany(cascade = CascadeType.ALL,mappedBy = "listOfPerson")
	    private List<Gym> listOfGym = new ArrayList<Gym>();

	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", listOfGym=" + listOfGym + "]";
	}

	public Person(int person_id, String name, String email, int mobile, List<Gym> listOfGym) {
		super();
		this.person_id = person_id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.listOfGym = listOfGym;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
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

	public List<Gym> getListOfGym() {
		return listOfGym;
	}

	public void setListOfGym(List<Gym> listOfGym) {
		this.listOfGym = listOfGym;
	}
	
	
	
	
}
