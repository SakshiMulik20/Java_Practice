package com.shopping.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectionutil {
	
	private static Connection con;
	
	public static Connection getDBCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mit","root","sakshi");
			
			System.out.println("Connected to Db");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con; 
	}

}
