package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns="/logout" ,name= "LoginForm2")
public class LoginForm2 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter obj = resp.getWriter();
		obj.println("<h1> hello to my webPage</h1>"
				+ "<h2>how are you</h2>"
				+ "<h3>byeee byeeee</h3>");
		
		obj.println("<hr>"
				+ "<h1>hellow everyOne</h1>");
		
		String name = "ayush kumar";
		obj.println(name);
		
		
		
	}
	
	
	
	

}
