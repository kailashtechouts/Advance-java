package org.sample1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class URL1 extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("your_name");
		String link = "urls2?user="+name;		
		out.println("<h1> MY name is "+name+"</h1>");
		out.println("<a href = '"+link+"'> Go to URL2</a>");
		
	}

}
