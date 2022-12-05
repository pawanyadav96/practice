package com.service;

import java.util.List;

import com.entity.Gym;
import com.entity.Person;
import com.entity.Trainer;
import com.exception.GymException;
import com.exception.TrainerException;

public interface Dao {
	
	
	public void addGym(Gym gym);
	
	public  Trainer registerTrainer(Trainer trainer);
	
	public void registerPerson(Person person,int gym_id)throws GymException;
	
	public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymException;
	
	public List<Person> getAllthePersonByGymName(String gym_name)throws GymException;

}
