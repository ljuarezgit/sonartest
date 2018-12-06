package com.ksquareinc.testing.sonartest.webcontroller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ksquareinc.testing.sonartest.model.User;
import com.ksquareinc.testing.sonartest.service.UserService;
import com.ksquareinc.testing.sonartest.webcontroller.UserController;

@RestController
@RequestMapping("/api")
public class UserControllerImpl implements UserController {

	private UserService userService;
     
	 @Autowired
	 public UserControllerImpl(UserService userService) {
			this.userService = userService;
	}

	@Override
	@RequestMapping(value = "/users/", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getUsers() {
	List<User> result = this.userService.findAll();
		
		if(result==null || result.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<User>>(result,HttpStatus.OK);

	}

}
