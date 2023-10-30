package com.database.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
	
	public static void main(String[] args) {
		try {
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3307/core_java","root","Gaurav");
		Statement s =con.createStatement();
		String query = "insert into employee values(11,'mayur','sontake',34444,'m@gmail.com')";
		
	} catch(Exception e) {
		
		e.printStackTrace();
	}
		
	}
}
