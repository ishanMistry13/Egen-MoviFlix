package com.egen.MoviFlixApi.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.egen.MoviFlixApi.Entities.User;

@Repository
public class UserRepositoryServImpl implements UserRepositry {

	@PersistenceContext
	private EntityManager em;

	@Override
	public User addUser(User user) {
		
		em.persist(user);

		return user;

	}

	@Override
	public User findUser(String email) {
		TypedQuery<User> query = em.createQuery("Select u from User u WHERE u.emailId=:pEmailId", User.class);
		//Query query = em.createQuery("Select u from User u Where u.emailId=\'ishanmistry13@gmail.com\'");
		query.setParameter("pEmailId", email);
		
		List<User> users = query.getResultList();
		
		//User user = query.getSingleResult();
		//System.out.println(users.get(0).toString());

		if (users != null && users.size() == 1) {
			System.out.println("Printing users: "+users.get(0));
			return users.get(0);

		} else {
			return null;

		}
		
		
	}

}
