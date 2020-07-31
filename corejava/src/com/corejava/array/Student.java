package com.corejava.array;

public class Student {

	private String firstName;
	private String lastName;
	private String email;
	private int rollNumber;
	private int inClass;

	public  Student(String firstNam, 
						String lastName, 
						String email, 
						int rollNumber, 
						int inClass) 
	{

		this.firstName=firstNam;
		this.lastName=lastName;
		this.email=email;
		this.rollNumber=rollNumber;
		this.inClass=inClass;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getInClass() {
		return inClass;
	}

	public void setInClass(int inClass) {
		this.inClass = inClass;
	}

	public void displayInfo() {

		System.out.println(" *** Student Information ***");
		System.out.println("Name : " + this.firstName + " " + this.lastName);
		System.out.println("rollnumber : " + this.rollNumber);
		System.out.println("email : " + this.email);
		System.out.println("class : " + this.inClass);

	}

}
