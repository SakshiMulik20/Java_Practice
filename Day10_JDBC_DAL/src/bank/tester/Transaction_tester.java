package bank.tester;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import bank.pojo.ConnectionUtil;

public class Transaction_tester {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con = ConnectionUtil.getDBConnection();
		try {
			con.setAutoCommit(false);
			String str1 = "insert into Account values(31,'rahul','rahul','rahul',5000)";
			
			String str2 ="insert into Account values(30,'ram','rahm','rahm',10000)";

			Statement stmt=con.createStatement();
			int i =stmt.executeUpdate(str1);
			System.out.println("1 act inserted");
			
			i =stmt.executeUpdate(str2);
			System.out.println("2 act inserted");
			
			con.commit();
			System.out.println("commit");
		}catch(Exception e){
			System.out.println("Transaction rollback");
			con.rollback();
			e.printStackTrace();
		}
	}
	}
