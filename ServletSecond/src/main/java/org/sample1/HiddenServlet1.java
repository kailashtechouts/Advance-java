package org.sample1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiddenServlet1 extends HttpServlet{

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("user_name");
		
		out.println("<h1> Your name is : "+name+"</h1>");
		out.println(""
				+ "<form action = 'servlet2'>"
				+ "<input type = 'hidden' name = 'user_name' value = '"+name+"' />"
				+  "<button>Send to Hidden Servlet2</button>"
				+ ""
				+ ""
				+ "</form>");
	}
}
