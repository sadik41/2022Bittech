package com.bit.ui.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * 1. import
 * 2. load and register the driver ===> com.mysql.sql.jdbc
 * 3.Create Connection
 * 4. Create a Statement
 * 5. execute the query
 * 6. process the results
 * 7. close
 */
public class ReadDB {
	
	public void jdbc() throws SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("", "", " ");
		Statement st  = con.createStatement();
		ResultSet rs = st.executeQuery();
		
		// added new code 
		
		
	}

}
