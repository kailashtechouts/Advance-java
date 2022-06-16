package org.sample1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLogout extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {  
		
		res.setContentType("text/html");  
		PrintWriter out=res.getWriter();  

		req.getRequestDispatcher("url.html").include(req, res);  

		Cookie ck=new Cookie("name","");  
		ck.setMaxAge(0);  
		res.addCookie(ck);  

		out.print("You successfully logged out!");  
	}  
}  

