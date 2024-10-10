package com.hexaware.client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectsPSDemo {

	public static void main(String[] args) {

		Connection conn = DBUtil.getDBConnection();

		String selectAll = "select * from Employees  where salary > ?";

		try {
			PreparedStatement pstmt = conn.prepareStatement(selectAll);
			
						pstmt.setDouble(1, 40000);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int eid = rs.getInt("eid");
				String ename = rs.getString("ename");
				double salary = rs.getDouble("salary");

				System.out.println(eid + "  " + ename + "  " + salary);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
