package com.revature.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.ReimbursementDaoImpl;
import com.revature.dao.UsersDaoImpl;
import com.revature.users.Reimbursement;
import com.revature.users.Users;

/**
 * Servlet implementation class UserReimbursementServlet
 */
public class UserReimbursementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserReimbursementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String amount = request.getParameter("amount");
		String description = request.getParameter("description");
		String status = "pending";
		String manager = "pending";

	
		ReimbursementDaoImpl submit = new ReimbursementDaoImpl();
			Reimbursement submitMyRequest = submit.updateReimbursement(userid,amount,description,status,manager);
			System.out.println(submitMyRequest);
			response.sendRedirect("UserHome.jsp");	
	}

}
