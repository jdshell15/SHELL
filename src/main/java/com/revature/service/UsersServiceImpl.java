package com.revature.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.revature.dao.UsersDaoImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dao.UsersDao;
import com.revature.users.Users;

public class UsersServiceImpl implements UsersService {

	private final UsersDao dao = new UsersDaoImpl();
	private final ObjectMapper mapper = new ObjectMapper();
	
	
	
	
	@Override
	public List<Users> getAllUsers(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("We are inside the UsersServiceImpl");
		// TODO Auto-generated method stub
		return dao.getAllUsers();
	}

	@Override
	public Users createUsers(HttpServletRequest request, HttpServletResponse response) {
		try {
			//from the HTTP Request body, parse the JSON into a Users Object
			Users users = mapper.readValue(request.getInputStream(),Users.class);
			return dao.createUsers(users);
		}catch (IOException e) {
			return null;
			
		}
	}

}
