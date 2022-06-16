package org.sample1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HTTPSession2  extends HttpServlet {  

	public void doGet(HttpServletRequest req, HttpServletResponse res)  throws ServletException, IOException {


		res.setContentType("text/html");  
		PrintWriter out = res.getWriter();  

		HttpSession session=req.getSession(false);  
		String n=(String)session.getAttribute("uname");  
		out.print("Hi i am "+n);  

		out.close();  

	}
}  


