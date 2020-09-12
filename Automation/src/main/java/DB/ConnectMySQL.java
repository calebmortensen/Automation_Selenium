package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;


public class ConnectMySQL {
	
	String jdbcURL = "jdbc:mysql://localhost:3306/selenium";
	String username = "root";
	String password = "secret";
	Connection con = null;
	Statement stm = null;
	ResultSet rs = null;
	
	@Test
	public void db() throws ClassNotFoundException, SQLException
	{
				
		
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("mysql Driver Loaded");
		
		con = DriverManager.getConnection(jdbcURL, username, password);
		
		System.out.println("Connected to MySQL DB");
		
		//Statement allows you to execute database queries
		stm=con.createStatement();
		
		//Store query in ResultSet
		rs=stm.executeQuery("select * from user");
		
		while (rs.next())
		{
			
			String firstname = rs.getString("firstname");			
			System.out.println("Database record is " + firstname);
			
			String lastname = rs.getString("lastname");			
			System.out.println("Database record is " + lastname);
			
			String email = rs.getString("email");			
			System.out.println("Database record is " + email);
			
		}
				
				
	}
	
	public void disconnect() {
		try {
			
			if(rs != null) {
				rs.close();
				System.out.println("ResultSet Closed");
			}
			
			if(stm != null) {
				stm.close();
				System.out.println("Statement Closed");
				}
			if(con != null) {
				con.close();
				System.out.println("Connection Closed");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
		
}
