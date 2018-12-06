package com.ksquareinc.testing.sonartest.dao;

import java.util.List;

import com.ksquareinc.testing.sonartest.model.User;


public interface UserDao {
	
	public void create(User user);

	public List<User> findAll();
}
