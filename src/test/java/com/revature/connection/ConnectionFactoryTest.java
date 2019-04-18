package com.revature.connection;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import com.revature.dao.UsersDao;
import com.revature.dao.UsersDaoImpl;
import com.revature.users.Users;
import com.revature.utility.ConnectionFactory;
import java.util.List;





public class ConnectionFactoryTest {
	private UsersDao dao = new UsersDaoImpl();

	
	@BeforeClass
	public static void getConnection() {
		ConnectionFactory.getConnection();
	}
	
	
	  @Test 
	  public void getAllUsersShouldReturn() {
		  List<Users> users =
	  dao.getAllUsers(); assertEquals(1, users.size()); }
	 
}
