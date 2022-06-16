package org.sample3.crudexample;

import java.io.IOException;  
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

@WebServlet("/CrudS1")
public class CrudS1  extends HttpServlet {  

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {  
		res.setContentType("text/html");  
		PrintWriter out=res.getWriter();  

		int id = Integer.parseInt(req.getParameter("com_id"));
		String name=req.getParameter("com_name");  
		String password=req.getParameter("com_password"); 
		int salary=Integer.parseInt(req.getParameter("salary")); 


		Company c=new Company(); 
		c.setComid(id);
		c.setComname(name);  
		c.setCompassword(password);  
		c.setSalary(salary);

		boolean status=ComDao.insertUser(c);  
		if(status){  
			out.print("<p>Record saved successfully!</p>");  
			req.getRequestDispatcher("/main.html").include(req, res);  
		}else{  
			out.println("Unable to save information");  
		}  

		out.close();  
	}  

}  

