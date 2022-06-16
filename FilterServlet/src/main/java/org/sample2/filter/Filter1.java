package org.sample2.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter1 implements Filter {

	 public void init(FilterConfig args0) throws ServletException {}
	 
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fic) throws IOException, ServletException {
		
		 PrintWriter out=res.getWriter();  
		    out.print("Invoking Filter Before");
		    out.println("<br>");
		         
		  //sends request to next resource  
		    fic.doFilter(req, res);
		    
		    out.println("<br>");      
		    out.print("Invoking Filter After");  
		    }  
		    public void destroy() {}  
		}  


