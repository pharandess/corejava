package com.corejava.jdbc;
import java.sql.*;

public class DatabaseExecuteProcedureExample {

	public static void main (String args[]) {
		
		Connection con;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl", "scott", "password");
			
			CallableStatement cal = con.prepareCall("call ");
			
		}
		
		catch (Exception e) {
			
		}
	}
	
}
