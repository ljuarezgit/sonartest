package com.ksquareinc.testing.sonartest.webcontroller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ksquareinc.testing.sonartest.model.User;


public interface UserController {

	public ResponseEntity<List<User>> getUsers();
}
