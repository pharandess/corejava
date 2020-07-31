/**
 * This is example of Inheritance. Student is parent class which has rollno and name 
 * properties. It has display method.
 *  
 */
package com.corejava.inheritance1;

public class Student {
	
	protected int rollno;
	protected String name;	
		
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public void display(){
	System.out.print("P*rollno="+this.rollno + " P*name="+this.name);
	}
	
}
