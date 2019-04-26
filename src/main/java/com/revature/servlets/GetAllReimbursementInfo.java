package com.revature.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.ReimbursementDaoImpl;
import com.revature.users.Reimbursement;

/**
 * Servlet implementation class GetAllReimbursementInfo
 */
public class GetAllReimbursementInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReimbursementDaoImpl rdi;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllReimbursementInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			System.out.println("inside the GetAllReimbursementInfo Servlet try");
		listReimbursements(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}catch(Exception e) {
		//System.out.println("exception stack trace" + e.printStackTrace());
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
	private void listReimbursements(HttpServletRequest request, HttpServletResponse response) throws Exception{
		System.out.println("inside the listReimbursements");
		List<Reimbursement> reimbursements = rdi.getAllReimbursement();
		request.setAttribute("reimbursement", reimbursements);
		System.out.println("session attribute" + request.getAttribute("reimbursement"));
		request.getRequestDispatcher("/ManagerHome.jsp").forward(request, response);
		//RequestDispatcher rd = request.getRequestDispatcher("/ManagerHome.jsp");
		//rd.forward(request,response);
	}
	
}
