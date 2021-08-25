package com.app.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MysSqlDBconnection {
	private static Connection connection;

	private MysSqlDBconnection() {
	
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/project_1";
		String username = "root";
		String password = "Vija2017@";
		connection = DriverManager.getConnection(url, username, password);
		return connection;

	}
}

