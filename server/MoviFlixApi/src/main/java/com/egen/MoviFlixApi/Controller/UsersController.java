package com.egen.MoviFlixApi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.egen.MoviFlixApi.Entities.User;
import com.egen.MoviFlixApi.Service.UserService;

@RestController
@RequestMapping(value = "user")
public class UsersController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.POST)
	public User addUser(@RequestBody User newUser) {
		User user = userService.addUser(newUser);
		
		return user;
		

	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "{emailId:.+}")
	public @ResponseBody User findUser(@PathVariable("emailId") String emailId){
		System.err.println(emailId);
		
		return userService.findUser(emailId);
		
		
	}

}
