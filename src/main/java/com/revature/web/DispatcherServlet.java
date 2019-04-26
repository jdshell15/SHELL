package com.revature.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class DispatcherServlet
 */
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final ObjectMapper mapper = new ObjectMapper();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("We have Entered DispatcherServlet");
	resp.setContentType("application/json");
	
	//getOutputStream() because it will write the response more efficiently than getWriter().println()
	//mapper.writeValueAsBytes() converts whatever the dispatcher returns into a byte[], which getOutputStream
	//Dispatcher.process() returns whatever resource we have available at the HttpServletRequest's URI
	resp.getOutputStream().write(mapper.writeValueAsBytes(Dispatcher.process(req, resp)));
	System.out.println("response has been sent successfully");
}

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
	System.out.println("We have Entered DispatcherServlet.doPost");
	resp.setContentType("application/json");
	resp.getOutputStream().write(mapper.writeValueAsBytes(Dispatcher.processPost(req, resp)));
	System.out.println("response has been sent successfully");


};
}