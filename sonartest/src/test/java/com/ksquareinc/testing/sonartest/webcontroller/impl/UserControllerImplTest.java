package com.ksquareinc.testing.sonartest.webcontroller.impl;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ksquareinc.testing.sonartest.model.User;
import com.ksquareinc.testing.sonartest.service.UserService;
import com.ksquareinc.testing.sonartest.webcontroller.UserController;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerImplTest {

	@Mock
	private UserService userService;
	
	private UserController userController;
	
	@Before
	public void setUp() {
		this.userController = new UserControllerImpl(userService);
	}
	@Test
	public void testGetAllSuccess() {
		
		List<User> users = new ArrayList<>();
		users.add(new User());
	
		when(userService.findAll()).thenReturn(users);
		
		ResponseEntity<List<User>> response = this.userController.getUsers();
		
		assertThat(response,notNullValue());
		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
			
	}
	@Test
	public void testGetAllNull() {
		
		List<User> users = null;
	
		when(userService.findAll()).thenReturn(users);
		
		ResponseEntity<List<User>> response = this.userController.getUsers();
		
		assertThat(response,notNullValue());
		assertThat(response.getStatusCode(), equalTo(HttpStatus.NO_CONTENT));
			
	}
	@Test
	public void testGetAllEmpty() {
		
		List<User> users = new ArrayList<>();
	
		when(userService.findAll()).thenReturn(users);
		
		ResponseEntity<List<User>> response = this.userController.getUsers();
		
		assertThat(response,notNullValue());
		assertThat(response.getStatusCode(), equalTo(HttpStatus.NO_CONTENT));
			
	}
}
