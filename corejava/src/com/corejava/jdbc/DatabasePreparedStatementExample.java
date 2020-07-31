/**
 * Example to show usage of prepared statement
 */

package com.corejava.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class DatabasePreparedStatementExample {

	public static void main(String args[]) throws Exception {

		// connection object created outside try block so that we can refer it in
		// finally
		// block
		Connection con = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl", "scott", "password");
			con.setAutoCommit(false);

			PreparedStatement stmt = con.prepareStatement("insert into Emp1 (id,name) values(?,?)");

			// One of the main difference between BufferedReader
			// and Scanner class is that former class is meant to just read String or text
			// data while Scanner class is meant to both read and parse text data into Java
			// primitive types like int, short, float, double, and long.

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			while (true) {

				System.out.println("Insert another row");

				String anotherrow = reader.readLine();

				if (anotherrow.toLowerCase().startsWith("n")) {

					break;
				}

				System.out.println("Enter id:");

				int id = Integer.parseInt(reader.readLine());

				System.out.println("Name:");

				String name = reader.readLine();

				// bind input

				stmt.setInt(1, id);
				stmt.setString(2, name);
				// execute the statement
				int i = stmt.executeUpdate();
				System.out.println(i);

			}

			con.commit();
			System.out.println("Records commited successfully");

			stmt = con.prepareStatement(" update Emp1 set email = ? where id = ?");
			stmt.setString(1, "sandeep@abc.com");
			stmt.setInt(2, 1);

			int i = stmt.executeUpdate();
			System.out.println(i + "rows updated");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		finally {

			System.out.println();
			if (!(con == null)) {
				con.close();
			}

		}
	}

}
