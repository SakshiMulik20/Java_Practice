package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	public static Connection getDBConnection() throws ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","sakshi");
			
			return con;
			
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
		
		return null;
		
	}

}
