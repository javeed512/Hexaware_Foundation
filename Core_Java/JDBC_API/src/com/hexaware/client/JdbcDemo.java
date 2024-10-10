package com.hexaware.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "admin");

			Statement stmt = conn.createStatement();

			String insert = "insert into Employees values(114,'adam',50000)";

			//String update = "update Employees set ename = 'javeed khan' , salary = 99000 where eid = 111   ";
			
			 // String delete = "delete from Employees where eid = 111";
			
		
	
			int count = stmt.executeUpdate(insert);
			// it is used for DML , return integer which mean no. of records   effected

			System.out.println(count +" records effected");
			
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
