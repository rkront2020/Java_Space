package com.registration.reg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("RegistrationTesting");
		/*System.out.println(request.getParameter("fname"));
		System.out.println(request.getParameter("lname"));
		System.out.println(request.getParameter("eid"));*/
		
		String firstname = request.getParameter("fname");
		String Lastname = request.getParameter("lname");
		String EmailID = request.getParameter("eid");
		
		PrintWriter out = response.getWriter();
		out.println("FirstName :" + firstname + " Lastname :" + Lastname +" EmailId :"+ EmailID);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
