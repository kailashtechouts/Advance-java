package org.sample1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HTTPSession1  extends HttpServlet {  

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {  


		res.setContentType("text/html");  
		PrintWriter out = res.getWriter();  

		String n=req.getParameter("userName");  
		out.print("Welcome "+n);  

		HttpSession session=req.getSession();  
		session.setAttribute("uname",n);  

		out.print("<a href='https2'> visit </a>");  

		out.close();  

	}  
}  



