package com.egen.MoviFlixApi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.egen.MoviFlixApi.Entities.User;
import com.egen.MoviFlixApi.Exception.BadRequestException;
import com.egen.MoviFlixApi.Exception.EntityNotFoundException;
import com.egen.MoviFlixApi.Repository.UserRepositoryServImpl;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepositoryServImpl usrRepo;

	@Override
	@Transactional
	public User addUser(User user) {

		User existing = usrRepo.findUser(user.getEmailId());

		if (existing != null) {
			throw new BadRequestException("User Already Exists");
		}

		return usrRepo.addUser(user);

	}

	@Override
	@Transactional(readOnly = true)
	public User findUser(String email) {
		User user = usrRepo.findUser(email);
		
		if (user == null) {

			throw new EntityNotFoundException("User does not exists");
		}

		return user;
	}

}
