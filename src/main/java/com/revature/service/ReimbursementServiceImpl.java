package com.revature.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dao.ReimbursementDao;
import com.revature.dao.ReimbursementDaoImpl;
import com.revature.users.Reimbursement;


public class ReimbursementServiceImpl implements ReimbursementService {

	private final ReimbursementDao dao = new ReimbursementDaoImpl();
	private final ObjectMapper mapper = new ObjectMapper();
	
	
	
	
	@Override
	public List<Reimbursement> getAllReimbursement(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("We are inside the ReimbursementServiceImpl");
		// TODO Auto-generated method stub
		return dao.getAllReimbursement();
	}

	@Override
	public Reimbursement createReimbursement(HttpServletRequest request, HttpServletResponse response) {
		try {
			//from the HTTP Request body, parse the JSON into a Users Object
			Reimbursement reimbursement = mapper.readValue(request.getInputStream(),Reimbursement.class);
			return dao.createReimbursement(reimbursement);
		}catch (IOException e) {
			return null;
			
		}
	
}}
