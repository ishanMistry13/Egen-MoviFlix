package com.egen.MoviFlixApi.Repository;

import com.egen.MoviFlixApi.Entities.User;

public interface UserRepositry {
	
	public User addUser(User user);
	
	public User findUser(String email);

}
