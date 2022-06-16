package org.sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class Test implements Servlet{
	
	ServletConfig conf;
	@Override
	public void init(ServletConfig conf) {
		this.conf = conf;
		System.out.println("creating Objects");
		
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("servicing")	;
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>This is my output from servlet Interface</h1>");
		out.println("<h2>Todays date and time is "+new Date().toString()+"</h2>");
		
	}

	@Override
	public void destroy() {
		System.out.println("destroying");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		return "Created by Kailash";
	}
}
