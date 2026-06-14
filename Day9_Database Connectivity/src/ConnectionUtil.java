import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static Connection getDBConnection() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				System.out.println("__Driver loaded__");
				
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test" , "root" ,"sakshi");
				
				System.out.println("Connection done");
				return con;
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		
			return null;
			
	}

}
}