package org.sample3.crudexample;

import java.io.IOException;  
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/EditServlet2")  
public class EditServlet2 extends HttpServlet {  
	protected void doPost(HttpServletRequest req, HttpServletResponse res)  throws ServletException, IOException {  
		res.setContentType("text/html");  
		PrintWriter out=res.getWriter();  

		String com_id=req.getParameter("com_id");  
		int id=Integer.parseInt(com_id);  
		String name=req.getParameter("com_name");  
		String password=req.getParameter("com_password");  
		int salary= Integer.parseInt(req.getParameter("salary"));  


		Company c=new Company();  
		c.setComid(id);  
		c.setComname(name);  
		c.setCompassword(password);  
		c.setSalary(salary);


		Connection status=ComDao.createC();  
		if(id>0){  
			res.sendRedirect("ViewServlet");  
		}else{  
			out.println("Sorry! unable to update record");  
		}  

		out.close();  
	}  
}


