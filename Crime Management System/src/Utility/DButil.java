package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {

	public static Connection ProvideConnection() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/crime_management_project";
		
		try {
			conn=DriverManager.getConnection(url, "root", "bonvaileo");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return conn;
		
	}
}
