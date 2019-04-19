package com.revature.connection;

import org.junit.Test;

import com.revature.dao.UsersDao;
import com.revature.dao.UsersDaoImpl;

public class ConnectionFactoryTest {
	private UsersDao uDao = new UsersDaoImpl();
	
	
	@Test
	public void testUpdate() {
		uDao.updateUsers("James", "Shell", "password", "MrShell");
	}
}
