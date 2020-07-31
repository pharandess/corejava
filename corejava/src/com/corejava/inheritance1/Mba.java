/** Mba class extend Student class and add new property as subject.
 * 
 */
package com.corejava.inheritance1;

public class Mba extends Student {
	private String subject;
	
	public Mba(int rollno, String name , String subject){
		super(rollno,name);
		this.subject = subject;
	}
	//overloaded method
	public void display(){
		super.display();
		System.out.print(" subject=" + this.subject);
	}
	
	/*public void display(){
		
		System.out.print( "rollno="+this.rollno + " name="+this.name + " subject=" + this.subject);
	}*/
	
	public static void main(String[] args) {
		Mba m1 = new Mba(1,"Jonathan Lewis","Oracle");
		m1.display();
	}
}