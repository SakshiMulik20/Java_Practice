package com.shopping.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.shopping.model.Product;
import com.shopping.util.Connectionutil;

public class ProductDAO {
	
	private Connection con;
	public ProductDAO() {
		
		con=Connectionutil.getDBCon();
		System.out.println("___ProductDAO____\n");
	}
	
	//select * from product
	public ArrayList<Product> getAllPrds(){
		try {
			System.out.println("----getAllPrds----\n");
			
			String sql="select * from product";
			Statement stmt =con.createStatement();
			
			ResultSet rset=stmt.executeQuery(sql);
			
			ArrayList<Product> prdList=new ArrayList<Product>();
			
			while(rset.next()){
				prdList.add(new Product(rset.getInt("pid"),
						rset.getString("pname"),
						rset.getDouble("price"),
						rset.getInt("quantity")));
			}
			rset.close();
			
			return prdList;
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public int addNewPrd(Product newPrd){
		try {
			System.out.println("-----addnre product----"+newPrd);
			String sql="Insert into product(pname,price,quantity) values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1, newPrd.getPname());
			pstmt.setDouble(2, newPrd.getPrice());
			pstmt.setInt(3, newPrd.getQuantity());
			
			int i = pstmt.executeUpdate();
			
			return i ;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
		
	}
	
	public void sreachPrd(Product newPrd) {
		try {
			System.out.println("----searchprd----");
			String sql="select * from product where pid=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			
			pstmt.setInt(1, newPrd.getPid());
			
			ResultSet rset = pstmt.executeQuery();
			
			if(rset.next()) {
				return;
			}

			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
