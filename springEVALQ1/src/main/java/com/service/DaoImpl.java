package com.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.Util.EMUtil;
import com.entity.Gym;
import com.entity.Person;
import com.entity.Trainer;
import com.exception.GymException;
import com.exception.TrainerException;

public class DaoImpl implements Dao{
	  EntityManager em = EMUtil.provideEntity();
	@Override
	public void addGym(Gym gym) {
		 em.getTransaction().begin();
	        em.persist(gym);
	        em.getTransaction().commit();

	        em.close();

	        System.out.println("Gym  registered");
		
	}

	@Override
	public Trainer registerTrainer(Trainer trainer) {
		
		 em.getTransaction().begin();
	        em.persist(trainer);
	        em.getTransaction().commit();

	        em.close();
		
		return trainer;
	}

	@Override
	public void registerPerson(Person person, int gym_id) throws GymException {
		Gym gym=em.find(Gym.class,gym_id );
		
		if(gym==null) throw new GymException("No member registered with this id");
		
		
		gym.getListOfPerson().add(person);
		
		person.getListOfGym().add(gym);
		
		 em.getTransaction().begin();
	        em.persist(person);
	        em.getTransaction().commit();

	        em.close();

	        System.out.println("Person registered successfully");
		
	}

	@Override
	public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymException {
		Gym gym=em.find(Gym.class,gym_id );
		
		Trainer trainer=em.find(Trainer.class, trainer_id);
		
		if(gym==null) throw new GymException("gym not found");
		
		if(trainer==null) throw new TrainerException("Trainer not found");
		
		gym.setTrainer(trainer);
		
		trainer.getGym().add(gym);
		
		  em.getTransaction().begin();
	        em.persist(trainer);
	        em.getTransaction().commit();

	        em.close();

	        System.out.println("Assigned");
		
		
	}

	@Override
	public List<Person> getAllthePersonByGymName(String gym_name) throws GymException {
		List<Person> allPerson=null;
		
		Query q=em.createQuery("select listOfperson from Gym where gym_name=?1");
		
		q.setParameter(1,gym_name);
		
		allPerson=q.getResultList();
		
		
		if(allPerson.size()==0)throw new GymException("NO person in the gym");
		
		em.close();
		return allPerson;
	}

}
