package com.egen.MoviFlixApi.Service;

import com.egen.MoviFlixApi.Entities.User;

public interface UserService {
	
	
	public User addUser(User user);
	
	public User findUser(String email, String userPwd);

}
