package com.revature.web;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.revature.service.ReimbursementService;
import com.revature.service.ReimbursementServiceImpl;
import com.revature.service.UsersService;
import com.revature.service.UsersServiceImpl;

public class Dispatcher {

	private static final UsersService usersService = new UsersServiceImpl();
	private static final ReimbursementService reimbursementService = new ReimbursementServiceImpl();
	//restrict instantiation

	private Dispatcher() {
		
	}
	
	public static Object process(HttpServletRequest request, HttpServletResponse response) {
		final String uri = request.getRequestURI().replace("/project1.0", "");
		System.out.println("Inside the Dispatcher: " + request.getMethod() + "request going to" + uri);
		System.out.println("before switch case in dispatcher process");
		switch(uri) {
		case"/users":
			
			System.out.println("inside /users in dispatcher process");
			return usersService.getAllUsers(request, response);
			
		case"/reimbursement":
			return reimbursementService.getAllReimbursement(request, response);
			
		
			default:
				return Collections.singletonMap("message", "It has not yet been implemented");
		}
}
	
	
	public static Object processPost(HttpServletRequest request, HttpServletResponse response) {
		final String uri = request.getRequestURI().replace("/project1.0/api", "");
		System.out.println("we are inside  the dispatcher:" + request.getMethod() + " The Request Going To " + uri);
		switch(uri) {
		case"/users":
			return usersService.createUsers(request, response);
			
		case"/reimbursement":
			return reimbursementService.createReimbursement(request, response);
			default:
				return Collections.singletonMap("message", "Not yet implemented");
				
	}
	
	
	
}}
