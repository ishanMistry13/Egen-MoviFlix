package com.egen.MoviFlixApi.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.egen.MoviFlixApi.Entities.User;

@Repository
public class UserRepositoryServImpl implements UserRepositry {

	@PersistenceContext
	private EntityManager em;

	@Override
	public User addUser(User user) {
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		
		return user;
		
	}

	@Override
	public User findUser(String email, String usrPwd) {
		
		
		
		
		return null;
	}

}
