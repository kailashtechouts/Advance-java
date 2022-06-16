package org.sample1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiddenServlet2 extends HttpServlet{

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("user_name");
		out.println("<h1> Welcome to Servlet 2</h1>");
		out.println("<h1 style = 'color:black;'>Welcome Back  " + name + "</h1>");
	}
}
