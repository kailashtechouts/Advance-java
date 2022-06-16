package org.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("This is success servlet");
		out.println("<h2>Sucessfully Registered</h2>");
	}

	
}
