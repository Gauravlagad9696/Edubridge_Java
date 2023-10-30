package com.database.crud;

import java.sql.*;

class MysqlConn {
	public static void main(String args[]) {
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/core_java", "root", "Gaurav9696");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			while (rs.next())
			System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+ "   " + rs.getString(4));
			con.close();
		} catch (Exception e) {
		 System.out.println(e);
		}
	}
}