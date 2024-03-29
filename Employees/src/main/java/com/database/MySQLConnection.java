package com.database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLConnection {

	private static Connection conn = null;

	public static Connection getConnection() throws IOException{
		//loading db properties
		ClassLoader loader = MySQLConnection.class.getClassLoader();
		Properties props = new Properties();
		FileInputStream in = new FileInputStream(loader.getResource("db.properties").getPath());
		props.load(in);
		in.close();
				
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "root";

		
		if(conn != null){
			return conn;
		}else{
			try {
				//1. Load the driver 
				Class.forName(driver);			
				//2. Established the connection to db
				conn = DriverManager.getConnection(url, username, password);
				System.out.println("Successfully Connected to DB.");
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}			
		}
		return conn;
	}
}
