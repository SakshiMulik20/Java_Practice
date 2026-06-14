import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test_Connectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("__Driver loaded__");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test" , "root" ,"sakshi");
			
			System.out.println("Connection done");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
