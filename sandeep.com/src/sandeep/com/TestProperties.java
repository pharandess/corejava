package sandeep.com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TestProperties {
	
	public static void main (String args[]){

		FileReader reader = null;
		Properties p = new Properties();
		
			try {
				 reader = new FileReader("D:\\Sample File\\properties.property.txt");
				 p.load(reader);
				 System.out.println(p.getProperty("User"));
				 System.out.println(p.getProperty(p.getProperty("User")+".password"));
				 
				 p.setProperty("Company", "Nice");
				 p.setProperty("EmployeeId", "93263");
				 
				 p.store(new FileWriter("D:\\Sample File\\properties.property.txt"), "Properties File Example");
				 
				 
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
