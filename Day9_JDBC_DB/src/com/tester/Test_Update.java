package com.tester;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.util.ConnectionUtil;

public class Test_Update {

	public static void main(String[] args) throws SQLException {
		
Connection con=ConnectionUtil.getDBConnection();
		
		Scanner sc = new Scanner(System.in);
		
		int rollno;String name,city;double marks;
		
		System.out.println("enyter roll no to update");
		rollno = sc.nextInt();
		
		System.out.println("Enter new  name city marks");
		name=sc.next();
		city=sc.next();
		marks=sc.nextDouble();
		
		String sqlUpdate="Update student set name =?, city=?, marks=? where rollno=?";
		
		PreparedStatement pstmt = con.prepareStatement(sqlUpdate);
		pstmt.setString(1, name);
		pstmt.setString(2, city);
		pstmt.setDouble(3, marks);
		pstmt.setInt(4, rollno);
		
		int row=pstmt.executeUpdate();
		System.out.println(row+ " inserted");

		sc.close();
	}

}
