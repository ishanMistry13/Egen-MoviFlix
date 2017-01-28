package com.egen.MoviFlixApi.Repository;

import com.egen.MoviFlixApi.Entities.User;

public interface UserRepositry {
	
	public void addUser(User user);
	
	public User findUser(String email, String usrPwd);

}
