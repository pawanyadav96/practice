package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Gym {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
    private int	gym_id; 
	private String gym_name ;
	private int monthly_fee;

	 @ManyToMany(cascade = CascadeType.ALL)
	    private List<Person> listOfPerson = new ArrayList<Person>();
	
	
	 @ManyToOne(cascade = CascadeType.ALL)
	    private Trainer trainer;


	public int getGym_id() {
		return gym_id;
	}


	public void setGym_id(int gym_id) {
		this.gym_id = gym_id;
	}


	public String getGym_name() {
		return gym_name;
	}


	public void setGym_name(String gym_name) {
		this.gym_name = gym_name;
	}


	public int getMonthly_fee() {
		return monthly_fee;
	}


	public void setMonthly_fee(int monthly_fee) {
		this.monthly_fee = monthly_fee;
	}


	public List<Person> getListOfPerson() {
		return listOfPerson;
	}


	public void setListOfPerson(List<Person> listOfPerson) {
		this.listOfPerson = listOfPerson;
	}


	public Trainer getTrainer() {
		return trainer;
	}


	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}


	public Gym(int gym_id, String gym_name, int monthly_fee, List<Person> listOfPerson, Trainer trainer) {
		super();
		this.gym_id = gym_id;
		this.gym_name = gym_name;
		this.monthly_fee = monthly_fee;
		this.listOfPerson = listOfPerson;
		this.trainer = trainer;
	}


	public Gym() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Gym [gym_id=" + gym_id + ", gym_name=" + gym_name + ", monthly_fee=" + monthly_fee + ", listOfPerson="
				+ listOfPerson + ", trainer=" + trainer + "]";
	}
	 
	 
}
