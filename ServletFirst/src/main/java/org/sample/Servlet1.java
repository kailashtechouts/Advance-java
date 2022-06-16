package org.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		try(PrintWriter out = res.getWriter()) {
			
			out.println("<DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet Servlet1</title>");
			out.println("<head>");
			out.println("<body>");
			
			String name = req.getParameter("name");
			out.println("<h1>Hello , " + name + " welcome to website</h1>");
			out.println("<h1><a href = 'servlet2'>Go to Servlet 2</a></h1>");
			
			//create a cookie
			Cookie c = new Cookie("user_name", name);
			res.addCookie(c);
			
			
			
			out.println("</head>");
			out.println("</html>");
		}
	}

}
