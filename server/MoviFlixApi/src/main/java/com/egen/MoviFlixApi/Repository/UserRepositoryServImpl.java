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
	public void addUser(User user) {

	}

	@Override
	public User findUser(String email, String usrPwd) {

		return null;
	}

}
