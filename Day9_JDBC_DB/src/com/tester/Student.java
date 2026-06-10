package com.tester;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.util.ConnectionUtil;

public class Student {
	Connection con = ConnectionUtil.getDBConnection();
	Scanner sc = new Scanner(System.in);
	
	int rollno ;String name,city ; double marks;
	
	//show
	public void show() throws SQLException {
		String sql="select * from student";
		
		Statement stmt=con.createStatement();

		ResultSet rset=stmt.executeQuery(sql);
		while(rset.next()) {
			System.out.println(rset.getInt("rollno")+" "
					+rset.getString("name")+" "
					+rset.getString("city") + " "
					+rset.getDouble("marks"));
			}
	}
	
	public void add(int rollno ,String name , String city , double marks) throws SQLException {
		
		
		String sqlInsert="Insert into student values(?,?,?,?)";
	
		PreparedStatement pstmt = con.prepareStatement(sqlInsert);
		pstmt.setInt(1, rollno);
		pstmt.setString(2, name);
		pstmt.setString(3, city);
		pstmt.setDouble(4, marks);
		
		int row=pstmt.executeUpdate();
		System.out.println(row+" Inserted");
	}
	
	public void update(int rollno ,String name , String city , double marks) throws SQLException {
		
		String sqlUpdate="Update student set name =?, city=?, marks=? where rollno=?";
		
		PreparedStatement pstmt1 = con.prepareStatement(sqlUpdate);
		pstmt1.setString(1, name);
		pstmt1.setString(2, city);
		pstmt1.setDouble(3, marks);
		pstmt1.setInt(4, rollno);
		
		int row1=pstmt1.executeUpdate();
		System.out.println(row1+ "row updated");
		
	}
	
	public void delete(int rollno) throws SQLException {
		String sqlDelete="delete from student where rollno=?";
		
		PreparedStatement pstmt2 = con.prepareStatement(sqlDelete);
		pstmt2.setInt(1, rollno);
		
		int row2=pstmt2.executeUpdate();
		System.out.println(row2+ " row deleted");
	}

}
