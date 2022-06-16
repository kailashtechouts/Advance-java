package org.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Test2 extends GenericServlet {

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("This is servlet using generic");
		PrintWriter out = res.getWriter();
		out.println("<h1>This is generic servlet</h1>");
	}
}
