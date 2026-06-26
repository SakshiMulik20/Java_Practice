package leave.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import leave.pojo.Employee;
import leave.util.ConnectionUtil;

public class EmployeeDAO {

    private Connection con;

    public EmployeeDAO() throws Exception {
        con = ConnectionUtil.getDbConnection();
        System.out.println("----inside EmployeeDAO----obj created----");
    }

    // select all
    public ArrayList<Employee> getAllEmps() throws SQLException {
        System.out.println("\n---inside getAllEmps-----");
        String sql = "select * from employee";
        Statement stmt = con.createStatement();
        ResultSet rset = stmt.executeQuery(sql);

        ArrayList<Employee> allEmps = new ArrayList<Employee>();
        while (rset.next()) {
            Employee emp = new Employee(
                    rset.getInt("empid"),
                    rset.getString("name"),
                    rset.getString("email"),
                    rset.getString("pwd"),
                    rset.getString("dept"),
                    rset.getString("role"));
            allEmps.add(emp);
        }
        rset.close();
        return allEmps;
    }

    // insert
    public int registerEmp(Employee emp) throws SQLException {
//        System.out.println("\n---inside registerEmp-----");
    	
        String sql = "insert into employee(name,email,pwd,dept) values(?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, emp.getName());
        pstmt.setString(2, emp.getEmail());
        pstmt.setString(3, emp.getPwd());
        pstmt.setString(4, emp.getDept());
        int i = pstmt.executeUpdate();
        return i;
    }

    // login
    public Employee login(String email, String pwd) throws SQLException {
    
        String sql = "select * from employee where email=? and pwd=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        
        pstmt.setString(1, email);
        pstmt.setString(2, pwd);
        
        ResultSet rset = pstmt.executeQuery();

        if (rset.next()) {
            System.out.println("Valid");
            return new Employee(
                    rset.getInt("empid"),
                    rset.getString("name"),
                    rset.getString("email"),
                    rset.getString("pwd"),
                    rset.getString("dept"),
                    rset.getString("role"));
        } else {
            System.out.println("Invalid");
            return null;
        }
    }
}