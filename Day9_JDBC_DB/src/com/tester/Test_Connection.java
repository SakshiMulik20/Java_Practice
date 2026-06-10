package com.tester;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.ConnectionUtil;

public class Test_Connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Connection con = ConnectionUtil.getDBConnection();
		
		String sql="select * from student";
		
		Statement stmt=con.createStatement();

		ResultSet rset=stmt.executeQuery(sql);
		while(rset.next()) {
			System.out.println(rset.getInt("rollno")+" "
					+rset.getString("name")+" "
					+rset.getString("city") + " "
					+rset.getDouble("marks"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

}
