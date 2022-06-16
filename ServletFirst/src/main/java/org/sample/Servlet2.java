package org.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.Cookie;

public class Servlet2 extends HttpServlet {
	
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		try(PrintWriter out = res.getWriter()) {
			
			out.println("<DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet Servlet1</title>");
			out.println("<head>");
			out.println("<body>");
			
			//getting all cookies
			Cookie[] cookies =req.getCookies();
			boolean f = false;
			String name = "";
			
			if(cookies == null) {
				out.println("<h1>You are new user go to home page enter your name");
				return;
			}
			else {
				for(Cookie c:cookies) {
					String tname = c.getName();
					if(tname.equals("user_name")) {
						 f = true;
						name = c.getValue();
					}
				}
			}
			if(f) {
			
			out.println("<h1>Hello , " + name + " welcome back to website</h1>");
			out.println("<h1>Thank You</h1>");
			}
			else {
				out.println("<h1>You are new user go to home page enter your name");
			}
			out.println("</head>");
			out.println("</html>");
		}
	}

}
