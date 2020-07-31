/**
 * This example for the JDBC connection and retrive result set and display result. 
 *  
 */

package com.corejava.jdbc;


import java.awt.Cursor;
import java.sql.*;

import java.sql.DriverManager;

public class DatabaseStatementExample {

	public static void main(String args[]) {

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl", "scott",
					"password");

			System.out.println("Connection Established !!!");

			Statement st = con.createStatement();
			System.out.println("Statement Object created!!!");
			
			ResultSet res = st.executeQuery("select table_name from user_tables");
			
			System.out.println("****** Result Set Data ******");
			while (res.next()) {
				
				System.out.println(res.getString(1));
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
