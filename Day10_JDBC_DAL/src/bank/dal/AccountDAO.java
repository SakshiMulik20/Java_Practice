package bank.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bank.pojo.Account;
import bank.pojo.ConnectionUtil;

public class AccountDAO {
	
	
	private Connection con;
	public AccountDAO() throws ClassNotFoundException {
		con = ConnectionUtil.getDBConnection();
		System.out.println("Object created");
	}
	
	public ArrayList<Account> getAllActs() throws SQLException {
		
		String sql="select * from Account";
		Statement smt=con.createStatement();
		ResultSet rset=smt.executeQuery(sql);
		
		ArrayList<Account> allActs=new ArrayList<Account>();
		
		while (rset.next()) {
		    Account act = new Account(
		        rset.getInt("actid"),
		        rset.getString("name"),
		        rset.getString("email"),
		        rset.getString("pwd"),
		        rset.getDouble("balance")
		    );
		    allActs.add(act);
	}
		return allActs;
		
	}
	
	public void createNewAccount(Account act) throws SQLException {

		 String sql = "insert into Account values(?,?,?,?,?)";
		 PreparedStatement pst = con.prepareStatement(sql);

		 pst.setInt(1, act.getActid());
		 pst.setString(2, act.getName());
		 pst.setString(3, act.getEmail());
		 pst.setString(4, act.getPwd());
		 pst.setDouble(5, act.getBalance());

		 int rows = pst.executeUpdate();
		 System.out.println(rows +" Inserted");
	}
	
	public void updateAccount(Account act) throws SQLException {

	    String sql = "update Account set name=?, email=?, pwd=?, balance=? where actid=?";
	    PreparedStatement pst = con.prepareStatement(sql);

	    pst.setString(1, act.getName());
	    pst.setString(2, act.getEmail());
	    pst.setString(3, act.getPwd());
	    pst.setDouble(4, act.getBalance());
	    pst.setInt(5, act.getActid());

	    int rows = pst.executeUpdate();
	    System.out.println(rows+ "row updated");
	}
	
	public void deleteAccount(int actid) throws SQLException {

		String sqlDelete = "delete from Account where actid=?";

		PreparedStatement pst = con.prepareStatement(sqlDelete);
		pst.setInt(1, actid);

		int rows = pst.executeUpdate();
		System.out.println(rows + " row deleted");
	
		}
	
	public Account getActDtls(int actid) throws SQLException {

	    String sql = "select * from Account where actid=?";
	    PreparedStatement pst = con.prepareStatement(sql);
	    pst.setInt(1, actid);

	    ResultSet rset = pst.executeQuery();

	    Account act = null;

	    if (rset.next()) {
	        act = new Account(
	              rset.getInt("actid"),
	             rset.getString("name"),
	            rset.getString("email"),
	            rset.getString("pwd"),
	            rset.getDouble("balance")
	        );
	    }
	    return act;
	}
	
	public Account login(String email, String pwd) throws SQLException {
		System.out.println("login"+ email + " " + pwd);
		
		String sql="select * from Account where email=? and pwd=?";
		
		PreparedStatement pst = con.prepareStatement(sql);
		
		pst.setString(1, email);
		pst.setString(2, pwd);
		
		ResultSet rset = pst.executeQuery();
		
		if(rset.next()) {
			System.out.println("Valid");
			System.out.println("Account:" + rset.getInt("actid")+" "
					+rset.getString("name")+" "
					+rset.getString("email") + " "
					+rset.getString("pwd")+ " "
					+rset.getDouble("balance"));
			return new Account(
		              rset.getInt("actid"),
			             rset.getString("name"),
			            rset.getString("email"),
			            rset.getString("pwd"),
			            rset.getDouble("balance")
			        );
			
		}else {
			System.out.println("Invalid");
		}
		return null;
		
	}
	
	public void withdraw(Account act , double amount) throws SQLException {
		String update = "update Account set balance=? where actid=?";
		
		 double cBalance = act.getBalance();
		 double upBalance = cBalance - amount;
		
		PreparedStatement pst = con.prepareStatement(update);
		
		pst.setDouble(1, upBalance);
		pst.setInt(2, act.getActid());
		
		int rows = pst.executeUpdate();
		System.out.println(rows);
		
	}
	
	public void moneyTransfer(Account sender , int reciever , double amount) throws SQLException {
		String sacc="update Account set balance=? where actid=?";
		PreparedStatement pst = con.prepareStatement(sacc);
		pst.setDouble(1, sender.getBalance()-amount);
		pst.setInt(2, sender.getActid());
		
		Account act = getActDtls(reciever);
		String racc="update Account set balance=? where actid=?";
		PreparedStatement pst1 = con.prepareStatement(racc);
		pst.setDouble(1, act.getBalance()+amount);
		pst.setInt(2, act.getActid());
		
		System.out.println("Tranfer done");
		System.out.println("New balance :" + (sender.getBalance()-amount));
		
		
		
	}
	
	

}
