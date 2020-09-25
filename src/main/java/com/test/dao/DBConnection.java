package com.test.dao;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection createConnection()
	 {
	     Connection con = null;
	  // JDBC driver name and database URL
	 	final String DB_URL = "jdbc:mysql://127.0.0.1/java_servlet_db";

	 	// Database credentials
	 	final String USER = "root";
	 	final String PASS = "root";

	     try
	     {
	         try
	         {
	        	 Class.forName("com.mysql.jdbc.Driver"); //loading MySQL drivers. This differs for database servers 
	         } 
	         catch (ClassNotFoundException e)
	         {
	            e.printStackTrace();
	         }       
	         con = DriverManager.getConnection(DB_URL,USER,PASS); //attempting to connect to MySQL database
	         System.out.println("Printing connection object "+con);
	     } 
	     catch (Exception e) 
	     {
	        e.printStackTrace();
	     }   
	     return con; 
	 }
}
