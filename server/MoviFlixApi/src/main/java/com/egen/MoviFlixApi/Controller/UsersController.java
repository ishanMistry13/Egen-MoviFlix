package com.egen.MoviFlixApi.Controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.egen.MoviFlixApi.Entities.Users;

@RestController
@RequestMapping(value="userSignUp")
public class UsersController {
	
	@RequestMapping(method=RequestMethod.POST)
	public void addUser(@RequestBody Users users){
		
		
	}

}
