package com.egen.MoviFlixApi.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.egen.MoviFlixApi.Entities.User;
import com.egen.MoviFlixApi.Exception.BadRequestException;
import com.egen.MoviFlixApi.Service.UserService;


@RestController
@RequestMapping(value="user")
public class UsersController {
	
	@Autowired
	private UserService userService;
	
	
	
	@RequestMapping(method=RequestMethod.POST)
	public void addUser(@RequestBody User newUser){
		User user = userService.findUser(newUser.getEmailId());
		if(user !=null){
			
			throw new BadRequestException("email ID already exists");
			
		}
		
		userService.addUser(newUser);
		
	}
	
	
	
	
	

}
