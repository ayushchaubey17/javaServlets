package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		System.out.println("hello");
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.print("hello bro");
		System.out.println(req);
		String name = req.getParameter("name)
		
	}

}
