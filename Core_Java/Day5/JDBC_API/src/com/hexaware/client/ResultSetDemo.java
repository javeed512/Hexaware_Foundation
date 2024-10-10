package com.hexaware.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {

	public static void main(String[] args) {

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "admin");

			Statement stmt = conn.createStatement();

			String select = "select * from Employees "; // static query

			ResultSet rs = stmt.executeQuery(select);

			while (rs.next()) {

				int eid = rs.getInt("eid");
				String ename = rs.getString("ename");
				double salary = rs.getDouble("salary");

				System.out.println(eid + "  " + ename + "  " + salary);
				
				
			//	Integer comm = rs.getInt("comm"); // null
					
			/*
			 * if(rs.wasNull()) {
			 * 
			 * System.err.println("Records not found");
			 * 
			 * }
			 */
			}
			
			stmt.close();
			rs.close();
			conn.close();
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
