package org.sample3.crudexample;

import java.io.IOException;  
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/EditServlet")  
public class EditServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  
    	
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update Employee</h1>");  
        
        String com_id=request.getParameter("id");  
        int id=Integer.parseInt(com_id);  
          
       List<Company> x = ComDao.getAllEmployees();  
       for(Company c:x ) {
          
        out.print("<form action='EditServlet2' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+c.getComid()+"'/></td></tr>");  
        out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+c.getComname()+"'/></td></tr>");  
        out.print("<tr><td>Password:</td><td><input type='password' name='password' value='"+c.getCompassword()+"'/></td></tr>");  
        out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+c.getSalary()+"'/></td></tr>");  
        out.print("</td></tr>");  
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
       }
        out.close();  
    }  
}  