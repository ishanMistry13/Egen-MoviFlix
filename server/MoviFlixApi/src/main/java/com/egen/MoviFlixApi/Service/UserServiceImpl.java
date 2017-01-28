package com.egen.MoviFlixApi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egen.MoviFlixApi.Entities.User;
import com.egen.MoviFlixApi.Exception.BadRequestException;
import com.egen.MoviFlixApi.Repository.UserRepositoryServImpl;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepositoryServImpl usrRepo;
	
	@Override
	public User addUser(User user) {
		
		User existing = usrRepo.findUser(user.getEmailId(), user.getUsrPwd());
		
		if(existing != null){
			
			throw new BadRequestException("User Already Exists");
			
		}
		
		return usrRepo.addUser(user);
		
		
	}

	@Override
	public User findUser(String email, String userPwd) {
		
		
		
		return null;
	}

}
