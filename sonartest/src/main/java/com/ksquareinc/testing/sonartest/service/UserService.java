package com.ksquareinc.testing.sonartest.service;

import java.util.List;

import com.ksquareinc.testing.sonartest.model.User;


public interface UserService {
	void create(User user);

	List<User> findAll();
}
