package org.sample3.crudexample;

import java.io.IOException;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/DeleteServlet")  
public class DeleteServlet extends HttpServlet {  
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
    	
        int com_id=Integer.parseInt(request.getParameter("com_id"));  
        ComDao.deleteuser(com_id);  
        response.sendRedirect("ViewServlet");  
    }  
}  