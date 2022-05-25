package com.ty.laptop.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionObject {

	// Provides connection Object to caller
	
	private final static String URL = "jdbc:mysql://localhost:3306/ck" ;
	private final static String USERNAME = "root" ;
	private final static String PASSWORD = "root" ;
	
	
	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
