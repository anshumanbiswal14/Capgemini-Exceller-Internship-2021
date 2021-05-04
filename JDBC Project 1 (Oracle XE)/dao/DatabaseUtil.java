package com.capg.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseUtil {
	
	public static Connection con;  // hold database connection
	
	static
	{
	
		try
		{
			String path = "jdbc:oracle:thin:@localhost:1521:XE";
			String username = "user1";
			String password = "9066";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");  // Search Oracle Driver class and create instance
			con = DriverManager.getConnection(path,username,password);
			System.out.println("---->> Check Connection :- "+con);
		}
		catch(Exception e)
		{
			// Spring Logger code , render over server / not on UI
			System.out.println(e);
		}
		
		
		
	}
		




}//end class