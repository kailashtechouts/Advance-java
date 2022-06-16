package org.sample3.crudexample;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComDao {

	static  Connection con;
	public static Connection createC() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/crudexample";
			String username = "root";
			String userpassword = "techouts";

			con = DriverManager.getConnection(url, username, userpassword);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	private static final String INSERT_CRUD_SQL = "INSERT INTO crud" + " (com_id,com_name ,com_password, salary)  VALUES " + "(?,?,?,?);";
	private static final String SELECT_CRUD_BY_ID = "select com_id,com_name ,com_password, salary)  from crud where com_id = ?";
	private static final String SELECT_ALL_CRUD = "select * from crud";
	private static final String DELETE_CRUD_SQL = "delete from crud where id = ?;";
	private static final String UPDATE_CRUD_SQL = "update crud set com_id = ?,com_name = ?, com_password = ?, salary = ?; ";

	//create or insert person
	public static boolean insertUser(Company comp)  {
		Boolean f = false;
		try {
			Connection con = createC();
			PreparedStatement ps = con.prepareStatement(INSERT_CRUD_SQL);
			ps.setInt(1, comp.getComid());
			ps.setString(2, comp.getComname());
			ps.setString(3, comp.getCompassword());
			ps.setDouble(4, comp.getSalary());

			ps.executeUpdate();
			f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	//update
	public static boolean updateUser(Company comp) {
		Boolean rowUpdate = false;
		try {
			Connection con = createC();
			PreparedStatement ps = con.prepareStatement(UPDATE_CRUD_SQL);
			ps.setInt(1, comp.getComid());
			ps.setString(2, comp.getComname());
			ps.setString(3, comp.getCompassword());
			ps.setDouble(4, comp.getSalary());

			ps.executeUpdate();
			rowUpdate = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowUpdate;
	}
	//select
	public static boolean selectUser(int com_id)  {
		Boolean f = false;
		try {
			Connection con = createC();
			PreparedStatement ps = con.prepareStatement(SELECT_CRUD_BY_ID);
			ps.setInt(1, com_id);
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				String name = rs.getString("com_name");
				String password = rs.getString("com_password");
				Double salary = rs.getDouble("salary");


				ps.executeUpdate();
				f = true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	//select all
	public static List<Company> getAllEmployees(){  
		List<Company> list=new ArrayList<Company>();  

		try {
			Connection con = createC();
			PreparedStatement ps = con.prepareStatement(SELECT_ALL_CRUD );

			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				Company c=new Company();  
				c.setComid(rs.getInt("com_id"));
				c.setComname(rs.getString("com_name"));
				c.setCompassword(rs.getString("com_password"));
				c.setSalary(rs.getInt("salary"));
				list.add(c);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	//delete
	public static boolean deleteuser(int comp) {
		Boolean rowdelete = false;
		try {
			Connection con = createC();
			PreparedStatement ps = con.prepareStatement(DELETE_CRUD_SQL);
			ps.setInt(1, comp);;
			ps.executeUpdate();
			rowdelete = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowdelete;
	}
}



