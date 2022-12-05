package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Trainer {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	private int trainer_id;
	private String trainer_name;
	private int year_of_experience;
    private String 	email;

    @OneToMany(cascade = CascadeType.ALL,mappedBy="trainer")
  private   List<Gym> gym=new ArrayList<Gym>();

	public int getTrainer_id() {
		return trainer_id;
	}

	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}

	public String getTrainer_name() {
		return trainer_name;
	}

	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}

	public int getYear_of_experience() {
		return year_of_experience;
	}

	public void setYear_of_experience(int year_of_experience) {
		this.year_of_experience = year_of_experience;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Gym> getGym() {
		return gym;
	}

	public void setGym(List<Gym> gym) {
		this.gym = gym;
	}

	public Trainer(int trainer_id, String trainer_name, int year_of_experience, String email, List<Gym> gym) {
		super();
		this.trainer_id = trainer_id;
		this.trainer_name = trainer_name;
		this.year_of_experience = year_of_experience;
		this.email = email;
		this.gym = gym;
	}

	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Trainer [trainer_id=" + trainer_id + ", trainer_name=" + trainer_name + ", year_of_experience="
				+ year_of_experience + ", email=" + email + ", gym=" + gym + "]";
	}
    
    
}
