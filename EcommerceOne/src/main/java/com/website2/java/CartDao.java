package com.website2.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.website1.java.ProductDao;
import com.website1.java.ProductDetails;

public class CartDao {


	public static Connection createCon() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/ecommerce";
		String username = "root";
		String userpassword = "root";

		return DriverManager.getConnection(url, username, userpassword);
	}
	public static int savedAllDetails(String name) {
		int status = 0;
		try {
			Connection con = createCon();
			String query = "INSERT INTO cart VALUES(?,?,?,?,?);";
			PreparedStatement ps = con.prepareStatement(query);	
			List<ProductDetails> list = ProductDao.getProductDetails(name);
			ps.setString(1,name);
			for(ProductDetails p:list) {
			ps.setString(2, p.getProductDesc());
			ps.setInt(3, p.getProductPrice());
			ps.setString(4, p.getProductImageUrl());
			ps.setString(5, p.getProductCtg());
			status = ps.executeUpdate();  
			ps.close();
			con.close();	
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public static List<ProductDetails> getProductDetails(){
		List<ProductDetails> ll = new ArrayList<ProductDetails>();
		try {
			Connection con = createCon();
			String query = "select * from cart";
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(query);
			while(rs.next()) { 
			ProductDetails p = new ProductDetails();
            p.setProductName(rs.getString(1));
            p.setProductDesc(rs.getString(2)); 
            p.setProductPrice(rs.getInt(3));  
            p.setProductImageUrl(rs.getString(4));  
            p.setProductCtg(rs.getString(5));  
            ll.add(p); 
			}
			s.close();
			con.close();	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ll;
}
	public static int OrderDetails(String name) {
		int status = 0;
		try {
			Connection con = createCon();
			String query = "INSERT INTO orders VALUES(?,?,?,?,?);";
			PreparedStatement ps = con.prepareStatement(query);	
			List<ProductDetails> list = ProductDao.getProductDetails(name);
			ps.setString(1,name);
			for(ProductDetails p:list) {
			ps.setString(2, p.getProductDesc());
			ps.setInt(3, p.getProductPrice());
			ps.setString(4, p.getProductImageUrl());
			ps.setString(5, p.getProductCtg());
			CartDao.deleteCart(name);
			status = ps.executeUpdate();
			ps.close();
			con.close();	
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public static int deleteCart(String name) {
		int status=0;  
	    try{  
	        Connection con=createCon();  
	        PreparedStatement ps=con.prepareStatement("delete from cart where productName=?");  
	        ps.setString(1,name);  
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	  
	    return status;  
	}  
	
	public static List<ProductDetails> getOrderDetails(){
		List<ProductDetails> list = new ArrayList<ProductDetails>();
		try {
			Connection con = createCon();
			String query = "select * from orders";
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(query);
			while(rs.next()) { 
			ProductDetails p = new ProductDetails();
            p.setProductName(rs.getString(1));
            p.setProductDesc(rs.getString(2)); 
            p.setProductPrice(rs.getInt(3));  
            p.setProductImageUrl(rs.getString(4));  
            p.setProductCtg(rs.getString(5));  
            list.add(p); 
			}
			s.close();
			con.close();	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list;
}
}