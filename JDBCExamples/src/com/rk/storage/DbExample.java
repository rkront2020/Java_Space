package com.rk.storage;

import java.sql.*;



public class DbExample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		//Connection from Java App to DB
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "rootroot");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emp");
		
		System.out.println("Emp No. " + "Emp Name " + "Emp Sal");
		while(rs.next()) {
			System.out.println(rs.getInt(0) + " " + rs.getString(1) + " " + rs.getFloat(2));
		}

	}

}
