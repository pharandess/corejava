package com.corejava.inheritance2;
// https://www.geeksforgeeks.org/inheritance-in-java/
import java.awt.print.Printable;

public class MountanBike extends Bicycle {
	
	// Mountain class add new field.
	int seatHight;
	
	// the MountainBike has new constructor 
	public MountanBike(int speed, int gear, int seatHight ) {
		// invoke base class Bicycle constructor.
		super(speed,gear);
		this.seatHight = seatHight;
	}
	
	// MountanBike add one more method   setHeight
	
	public void setHeight(int seatHeight) {
		this.seatHight = seatHeight;
	}
	
	// subclass override toString method 
	
	public String toString () {
		return (super.toString() + "\n" + " seatHight is " + this.seatHight);
	}
	
	// Try to override final method
	
//	public void classDescription() {
//		
//		System.out.println("can not override final method from parent class Bicycyle");
//	}
	
	
	// Mountain Bike 
	
	public static void main (String args[]) {

		MountanBike b1 = new MountanBike(10, 5, 15);
		System.out.println(b1.toString());
				
		// trying to assign value to the final variable will give error 
		//b1.wheels = 3;
		
	}
	
}