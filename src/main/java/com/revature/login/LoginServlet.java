package com.revature.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.UsersDaoImpl;
import com.revature.users.Users;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			
			
		if(username == null || username.equals("") || password == null || password.equals("")) {

			response.sendRedirect("frontPage.html");
	}else {
		
		UsersDaoImpl attempt = new UsersDaoImpl();
		//attempt.getUsersByLogininfo(username,password,response); // returns Users object
		Users myUser = attempt.getUsersByLogininfo(username,password,response);
		String type = myUser.getUsertype();
		
		if(type.equals("Manager")) {
			response.sendRedirect("ManagerHome.html");
		}else {
			response.sendRedirect("UserHome.html");
		}}}

		catch(IOException e) {
		}
		
	}
		
		
		

    
	
		
	}

