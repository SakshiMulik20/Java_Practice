package com.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.pojo.Student;
import com.util.ConnectionUtil;

public class StudentDAO {

	private Connection con;

	public StudentDAO() throws Exception {
		con = ConnectionUtil.getDbConnection();
		System.out.println("----inside StudentDAO----obj created----");
	}

	
	public ArrayList<Student> getAllStudents() throws SQLException {
//		System.out.println("\n---inside getAllStudents-----");
		String sql = "select * from student";
		Statement stmt = con.createStatement();
		ResultSet rset = stmt.executeQuery(sql);

		ArrayList<Student> allStd = new ArrayList<Student>();

		while (rset.next()) {
			Student s = new Student(rset.getInt("id"), rset.getString("name"), rset.getString("email"), rset.getDouble("percentage"));
			allStd.add(s);
		}
		rset.close();
		return allStd;
	}
	

	public int addStudent(Student s) throws SQLException {
		
//	    System.out.println("\n---inside addStudent-----");
		
	    String sql = "insert into student values(?,?,?,?)";

	    PreparedStatement pstmt = con.prepareStatement(sql);

	    pstmt.setInt(1, s.getId());
	    pstmt.setString(2, s.getName());
	    pstmt.setString(3, s.getEmail());
	    pstmt.setDouble(4, s.getPercentage());

	    int i = pstmt.executeUpdate();
	    return i;
	}

	public int updateName(int id, String name) throws SQLException {
//		System.out.println("---inside updateName-----");
		String sql = "update student set name=? where id=?";

		PreparedStatement pstmt = con.prepareStatement(sql);

		pstmt.setString(1, name);
		pstmt.setInt(2, id);

		int i = pstmt.executeUpdate();
		return i;
	}
	
	public ArrayList<String> getAllEmails() throws SQLException {
//	    System.out.println("---inside getAllEmails-----");
	    String sql = "select email from student";

	    Statement stmt = con.createStatement();
	    ResultSet rset = stmt.executeQuery(sql);

	    ArrayList<String> emails = new ArrayList<String>();

	    while (rset.next()) {
	        emails.add(rset.getString("email"));
	    }
	    rset.close();
	    return emails;
	}

	
	public Student searchById(int id) throws SQLException {
//		System.out.println("---inside searchById-----");
		
		String sql = "select * from student where id=?";

		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);

		ResultSet rset = pstmt.executeQuery();

		if (rset.next()) {
			System.out.println("Student found");
			return new Student(rset.getInt("id"), rset.getString("name"), rset.getString("email"), rset.getDouble("percentage"));
		} else {
			System.out.println("Student not found");
			return null;
		}
	}

	public int deleteStudent(int id) throws SQLException {
//		System.out.println("---inside deleteStudent-----");
		String sql = "delete from student where id=?";

		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);

		int i = pstmt.executeUpdate();
		return i;
	}
	


}
