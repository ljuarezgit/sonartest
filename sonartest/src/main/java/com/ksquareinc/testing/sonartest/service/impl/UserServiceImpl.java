package com.ksquareinc.testing.sonartest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksquareinc.testing.sonartest.dao.UserDao;
import com.ksquareinc.testing.sonartest.model.User;
import com.ksquareinc.testing.sonartest.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	private UserDao userDao;
	@Autowired
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public void create(User user) {
		this.userDao.create(user);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}
}
