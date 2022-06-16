package com.website1.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.User;

public class ProductDao {

	public static Connection createCon() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/ecommerce";
		String username = "root";
		String userpassword = "root";

		return DriverManager.getConnection(url, username, userpassword);
	}
	public static int insertProduct(ProductDetails u){
		int f = 0;

		try {
			Connection con = createCon();
			String query = "INSERT INTO Productdetails VALUES(?,?,?,?,?);";
			PreparedStatement ps = con.prepareStatement(query);		
			ps.setString(1, u.getProductName());
			ps.setString(2, u.getProductDesc());
			ps.setInt(3, u.getProductPrice());
			ps.setString(4, u.getProductImageUrl());
			ps.setString(5, u.getProductCtg());
			f = ps.executeUpdate();  
			ps.close();
			con.close();	
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return f;
	}
	public static List<ProductDetails> getProduct(String ctg){
		List<ProductDetails> l = new ArrayList<ProductDetails>();
		try {
			
			
			Connection con = createCon();
			String query = "select * from productdetails where ctg = ?;";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,ctg);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) { 
			ProductDetails p = new ProductDetails();
            p.setProductName(rs.getString(1));
            p.setProductDesc(rs.getString(2)); 
            p.setProductPrice(rs.getInt(3));  
            p.setProductImageUrl(rs.getString(4));  
            p.setProductCtg(rs.getString(5));  
            l.add(p); 
			}
			
			ps.close();
			con.close();	
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return l;
}
	public static List<ProductDetails> getProductDetails(String m){
		List<ProductDetails> ll = new ArrayList<ProductDetails>();
		try {
			
			
			Connection con = createCon();
			String query = "select * from productdetails where productName= ?;";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,m);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) { 
			ProductDetails p = new ProductDetails();
            p.setProductName(rs.getString(1));
            p.setProductDesc(rs.getString(2)); 
            p.setProductPrice(rs.getInt(3));  
            p.setProductImageUrl(rs.getString(4));  
            p.setProductCtg(rs.getString(5));  
            ll.add(p); 
			}
			
			ps.close();
			con.close();	
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return ll;
}

}
