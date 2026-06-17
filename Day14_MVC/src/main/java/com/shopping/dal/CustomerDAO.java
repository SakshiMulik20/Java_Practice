package com.shopping.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.shopping.model.Customer;
import com.shopping.util.Connectionutil;

public class CustomerDAO {
	
	private Connection con ;
	
	public CustomerDAO(){
		con=Connectionutil.getDbCon();
	}
	public Customer login(String email,String pwd) {
		
		System.out.println("In validate login "+email+" "+pwd);
		
		try {
			
			String sql="select * from Customer where email=? and pwd=?";
			
			PreparedStatement pstmt=con.preparedStatement(sql);
			
			pstmt.setString(1, email);
			pstmt.setString(2, pwd);
			
			ResultSet rset=pstmt.executeQuery();
			if(rset.next()) {
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
