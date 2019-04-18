package com.revature.dao;

import java.util.List;

import com.revature.users.Reimbursement;


public interface ReimbursementDao {
	
		List<Reimbursement> getAllReimbursement();
		Reimbursement getReimbursementById(int id);
		Reimbursement createReimbursement(Reimbursement reimbursement);
		Reimbursement updateReimbursement(Reimbursement toBeUpdated);
		long deleteReimbursement(Reimbursement... toBeDeleted);
	

}
