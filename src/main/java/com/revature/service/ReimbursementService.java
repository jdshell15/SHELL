package com.revature.service;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.revature.users.Reimbursement;


public interface ReimbursementService {
	List<Reimbursement> getAllReimbursement(HttpServletRequest request, HttpServletResponse response);
	Reimbursement createReimbursement(HttpServletRequest request, HttpServletResponse response);
}
