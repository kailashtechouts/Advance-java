package org.sample3.crudexample;

import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/ViewServlet")  
public class ViewServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {  
    	
        res.setContentType("text/html");  
        PrintWriter out=res.getWriter();  
        out.println("<a href='main.html'>Add New Employee</a>");  
        out.println("<h1>Employees List</h1>");  
          
        List<Company> list=ComDao.getAllEmployees();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Salary</th><th>Edit</th><th>Delete</th></tr>");  
        for(Company c:list){  
        	 out.print("<tr><td>"+c.getComid()+"</td><td>"+c.getComname()+"</td><td>"+c.getCompassword()+"</td>" 
                    +" <td>"+c.getSalary()+"</td><td><a href='EditServlet?id="+c.getComid()+"'>edit</a></td>"  
                    +" <td><a href='DeleteServlet?id="+c.getComid()+"'>delete</a></td></tr>");  
            }  
        out.print("</table>");  
          
        out.close();  
    }  
}  