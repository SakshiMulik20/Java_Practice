package com.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	
	public static Connection getDBConnection() {
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mit","root","sakshi");
			System.out.println("Connected");
			return con;
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		return null;
	}

}
