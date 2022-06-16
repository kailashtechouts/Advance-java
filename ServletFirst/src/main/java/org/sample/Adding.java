package org.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Adding extends HttpServlet {



	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();
		writer.println("<html>Hello, I am a Java servlet!</html>");
		writer.flush();
		
		String number1 = request.getParameter("num1");
		int num1 = Integer.parseInt(number1);

		String number2 = request.getParameter("num2");
		int num2 = Integer.parseInt(number2);

		int sum  = num1 + num2;

		writer.println("<html>Sum  is: " + sum + "</html>");
		writer.flush();

	}
}

