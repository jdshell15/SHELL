package com.revature.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.users.Users;



public interface UsersService {

	List<Users> getAllUsers(HttpServletRequest request, HttpServletResponse response);
	Users createUsers(HttpServletRequest request, HttpServletResponse response);
}
