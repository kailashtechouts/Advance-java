package org.sample1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class AccountServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {  
		res.setContentType("text/html");  
		PrintWriter out=res.getWriter();  

		req.getRequestDispatcher("url.html").include(req, res);  

		Cookie ck[]=req.getCookies();  
		if(ck!=null){  
			String name=ck[0].getValue();  
			if(!name.equals("")||name!=null){  
				out.print("<b>Welcome to Profile</b>");  
				out.print("<br>Welcome, "+name);  
			}  
		}
		else {  
			out.print("Please login first");  
			req.getRequestDispatcher("login.html").include(req, res);  
		}  
		out.close();  
	}  
}  

