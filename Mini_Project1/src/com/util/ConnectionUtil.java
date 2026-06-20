package com.util;
 
import java.sql.Connection;
import java.sql.DriverManager;
 
public class ConnectionUtil {
 
	private static Connection con;
 
	public static Connection getDbConnection() throws Exception {
		if (con == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "sakshi");
			System.out.println("----Connection created----");
		}
		return con;
	}
 
}
 