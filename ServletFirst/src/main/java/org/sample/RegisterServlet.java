package org.sample;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h2>Welcome to Register servlet</h2>");
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		String cond = req.getParameter("condition");

		if(cond != null) {
			if(cond.equals("checked")) {

				out.println("<h2> Name : " +name +"</h2>");
				out.println("<h2> Password : " +password +"</h2>");
				out.println("<h2> Email : " +email +"</h2>");
				out.println("<h2> Gender : " +gender +"</h2>");
				out.println("<h2> Course : " +course +"</h2>");
				
				//forward method
				RequestDispatcher rd = req.getRequestDispatcher("success");
				rd.forward(req, res);
			}
			else {
				out.println("you have not accepted terms and condition");
			}
		}
			else {
				out.println("you have not accepted terms and condition");
				
				//get object of Request Dispatcher
				RequestDispatcher rd = req.getRequestDispatcher("SubmitForm.html");
				
				//include method
				rd.include(req, res);
			}
		}
	}

