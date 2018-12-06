package com.ksquareinc.testing.sonartest.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ksquareinc.testing.sonartest.dao.UserDao;
import com.ksquareinc.testing.sonartest.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public void create(User user) {
		if(user==null)
			throw new IllegalArgumentException("user cannot be null");
		
		System.out.println("User added " + user.toString());
		
	}

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<>();
		users.add(new User());
		users.add(new User());
		
		return users;
	}

}