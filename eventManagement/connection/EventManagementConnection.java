package com.eventManagement.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class EventManagementConnection {
	

	

		   // JDBC driver name and database URL
		   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   static final String DB_URL = "jdbc:mysql://localhost/eventmanagement";

		   //  Database credentials
		   static final String USER = "root";
		   static final String PASS = "Yagnesh@soni811";
			
		   private static Connection conn = null;

			public static Connection getConnection() throws SQLException, ClassNotFoundException
			{
				if(conn != null)
					return conn;
				else
				{
					try{
						   //STEP 2: Register JDBC driver
						   Class.forName("com.mysql.jdbc.Driver");

						   //STEP 3: Open a connection
						   //System.out.println("Connecting to database...");
						   conn = DriverManager.getConnection(DB_URL,USER,PASS);
						   
						   return conn;
					}
					finally
					{}
				}
			}
		
		
			public static void closeConnection() throws SQLException
			{
				try
				{
					if(conn != null)
						conn.close();
				}
				finally
				{}
			}
		
		
	

	
	
}
