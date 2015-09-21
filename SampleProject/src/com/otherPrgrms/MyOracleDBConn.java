package com.otherPrgrms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyOracleDBConn {
	public static Connection conn;
	public static Connection getConnection(){
		if (conn==null){
			try{
				//Load the jdbc Driver
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","hr","password");
			}
			catch(ClassNotFoundException e){
			e.printStackTrace();
			}
			catch(SQLException e){
			e.printStackTrace();
			}
		}
		return conn;
		
		
	}

}
