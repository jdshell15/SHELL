package com.revature.dao;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.revature.users.Users;

public interface UsersDao {
	List<Users> getAllUsers();
	Users getUsersById(int id);
	Users createUsers(Users users);
	Users updateUsers(Users toBeUpdated);
	long deleteUsers(Users... toBeDeleted);
	Users getUsersByLogininfo(String login,String password, HttpServletResponse response);
	Users viewInfo(String login);
}
