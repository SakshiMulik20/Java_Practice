package com.tester;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.util.ConnectionUtil;

public class Test_Delete {

	public static void main(String[] args) throws SQLException {
				
		Connection con=ConnectionUtil.getDBConnection();
				
				Scanner sc = new Scanner(System.in);
				
				int rollno;
				
				System.out.println("enyter roll no to delete");
				rollno = sc.nextInt();
				
				String sqlDelete="delete from student where rollno=?";
				
				PreparedStatement pstmt = con.prepareStatement(sqlDelete);
				pstmt.setInt(1, rollno);
				
				int row=pstmt.executeUpdate();
				System.out.println(row+ " deleted");
				
				sc.close();

				
			}
}


