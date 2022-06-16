package com.website.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.website1.java.ProductDetails;


public class UserDao {

	public static Connection createCon() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/ecommerce";
		String username = "root";
		String userpassword = "root";

		return DriverManager.getConnection(url, username, userpassword);
	}
	public static int insertUser(UserDetails u)  {
		int f = 0;
		try {
			Connection con = createCon();
			String query = "INSERT INTO Persons( name,email_id, password) VALUE(?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, u.getName());
			ps.setString(2, u.getEmail_id());
			ps.setString(3, u.getPassword());

			f = ps.executeUpdate();
			ps.close();
			con.close();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	public static boolean check(UserDetails u)  {
		try {

			Connection con = createCon();
			String query = "select * from Persons";
			PreparedStatement ps = con.prepareStatement(query);	
			ResultSet rs=ps.executeQuery();  
			String email=u.getEmail_id();
			String password=u.getPassword();
			while(rs.next()) {
				String dbemail=rs.getString(3);
				String dbPassword=rs.getString(4);
				if((email.equals(dbemail)) && (password.equals(dbPassword))) {
					return true;
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}