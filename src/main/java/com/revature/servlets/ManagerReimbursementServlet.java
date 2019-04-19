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
 * Servlet implementation class ManagerReimbursementServlet
 */
public class ManagerReimbursementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerReimbursementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String appD = request.getParameter("pending");
		
		ReimbursementDaoImpl update = new ReimbursementDaoImpl();
		Reimbursement updateMyUser = update.approveDeny(id,appD);
		System.out.println(updateMyUser);
		response.sendRedirect("ManagerHome.jsp");
	}

}
