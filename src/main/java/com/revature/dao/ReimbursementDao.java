package com.revature.dao;

import java.util.List;

import com.revature.users.Reimbursement;


public interface ReimbursementDao {
	
		List<Reimbursement> getAllReimbursement();
		Reimbursement getReimbursementById(int id);
		Reimbursement createReimbursement(Reimbursement reimbursement);
		Reimbursement updateReimbursement(String userid, String amount, String description, String status );
		long deleteReimbursement(Reimbursement... toBeDeleted);
		Reimbursement approveDeny(String id,String appD,String manager);

}
