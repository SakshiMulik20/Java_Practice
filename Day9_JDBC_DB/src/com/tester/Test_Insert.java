package com.tester;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.util.ConnectionUtil;

public class Test_Insert {

	public static void main(String[] args) throws SQLException {
		
		Connection con=ConnectionUtil.getDBConnection();
		
		Scanner sc = new Scanner(System.in);
		
		int rollno;String name,city;double marks;
		
		System.out.println("Enter rollno name city marks");
		rollno = sc.nextInt();
		name=sc.next();
		city=sc.next();
		marks=sc.nextDouble();
		
		
		String sqlInsert="Insert into student values(?,?,?,?)";
				
		//parametrized query 
		//use preparestatement
		PreparedStatement pstmt = con.prepareStatement(sqlInsert);
		//assign values to parameter
		pstmt.setInt(1, rollno);
		pstmt.setString(2, name);
		pstmt.setString(3, city);
		pstmt.setDouble(4, marks);
		
		int row=pstmt.executeUpdate();
		System.out.println(row+" Inserted");
		
	 System.out.println(sqlInsert);
	 
	 sc.close();

	}

}
