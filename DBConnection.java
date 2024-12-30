package com.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	Connection con;
	
	public Connection getconnection() {
		
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		
	 } catch (Exception e) {
		 
		 System.out.println(e);
	  }
		return con;
   }
}