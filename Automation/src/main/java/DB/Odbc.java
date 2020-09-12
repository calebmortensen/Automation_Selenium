package DB;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Odbc {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://URL.com;databaseName=MY_DB_NAME;integratedSecurity=True";
		String user = "";
		String pass = "";
		
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connected to Microsoft SQL Server");

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}