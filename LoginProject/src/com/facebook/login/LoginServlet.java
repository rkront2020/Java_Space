package com.facebook.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println("System Call at : " + dtf.format(now));
		
		
		String userName = request.getParameter("uname");
		String userPwd = request.getParameter("upwd");
		
		PrintWriter out= response.getWriter();
		//out.println("USerName is " + userName + "Password is " + userPwd);
		if((userName.equals("vrc")) && (userPwd.equals("rahul"))) {
			out.println("Success");
		}
		else {
			out.println("Failure");
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("MyLearning", "Secret JSP tutorial");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
