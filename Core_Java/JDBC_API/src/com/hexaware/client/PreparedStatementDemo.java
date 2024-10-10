package com.hexaware.client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) {

		Connection conn = DBUtil.getDBConnection();

		String insertQuery = "insert into Employees values(?,?,?)"; // ? positional parameters

		String updateQuery = "update Employees set ename = ?  , salary = ?   where eid = ?";
		
		
		try {

			/*
			 * PreparedStatement pstmt = conn.prepareStatement(insertQuery);
			 * 
			 * pstmt.setInt(1, 101); pstmt.setString(2, "shivam"); pstmt.setDouble(3,
			 * 45000);
			 * 
			 * int count = pstmt.executeUpdate();
			 */
			
			
			PreparedStatement pstmt = conn.prepareStatement(updateQuery);
			
					pstmt.setString(1,"shivam reddy");
					pstmt.setDouble(2, 99000);
					pstmt.setInt(3, 101);
			
			
			int count = pstmt.executeUpdate();
			
			
			
			// String deleteQuery ="delete from Employees  where eid = ?";
			
					// pstmt.setInt(1,101);
			

			System.out.println(count + " records  effected");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		;

	}

}
