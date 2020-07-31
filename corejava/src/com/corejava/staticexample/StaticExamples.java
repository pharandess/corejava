/**
 * This example explains static method in java
 * Static keyword can be used with class, variable, method and block. 
 * Static members belong to the class instead of a specific instance, this means if 
 * you make a member static, you can access it without object.
 */
package com.corejava.staticexample;

public class StaticExamples {
	
	static String collageName = "ABC";
	static String address ; 
	static int pin;

	// static block is used to set values for the static variables
	static
	{
		collageName = "TKIET";
		address = "Warananagar Kolhapur";
		pin = 1234;
		
	}
	// another static block, static block execute in sequence in which they are defined
	static
	{
	
		pin = 416114;
	}
	
	String 	branch;
	int 	capacity;
	
	public static void collageAddress() {
		System.out.println("Collage Name is " + collageName);
		System.out.println("address is " + address);
		System.out.println("pin is " + pin);
	}
	
	public StaticExamples(String branch, int capacity) {
		
		this.branch = branch;
		this.capacity = capacity;
		
	}
	
	public void displayBranch() {
		
		collageAddress();
		System.out.println("Branch = " + this.branch);
		System.out.println("Capacity = " + this.capacity);		
		
	}

}
