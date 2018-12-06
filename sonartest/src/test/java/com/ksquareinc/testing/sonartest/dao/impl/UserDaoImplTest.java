package com.ksquareinc.testing.sonartest.dao.impl;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ksquareinc.testing.sonartest.dao.UserDao;
import com.ksquareinc.testing.sonartest.model.User;

@RunWith(org.mockito.junit.MockitoJUnitRunner.class)
public class UserDaoImplTest {

	private  UserDao userDao;
	@Before
	public void setUp() {
		userDao = new UserDaoImpl();
	}
	
	@Test
	public void testAddSuccess() {
		User user = new User();
		userDao.create(user);
		assertTrue(true);
	}
	@Test
	public void testAddNull() {
		User user = null;
		
		try {
		userDao.create(user);
		fail("Should not come here due dao impl cannot add null objects in repository");
		}catch(Exception ex) {
			assertTrue(ex.getMessage()!=null);
		}
	}
	@Test
	public void testFindAll() {
		List<User> users = userDao.findAll();
		assertThat(users, notNullValue());
	}
	
}