
package com.corejava.inheritance2;

/**
 * 
 * Java program to illustrate concept of inheritance.
 *
 */
public class Bicycle {

	// bicycle has two fields
	protected int gear;
	protected int speed;
	final int wheels;
	

	// Bicycle class has one constructor

	public Bicycle(int gear, int speed) {

		this.gear = gear;
		this.speed = speed;
		this.wheels = 2;
		
	}

	// Final Method

	public final void classDescription() {

		System.out.println("You can not override  this method ");

	}

	// Bicycle has three methods
	public void applyBreak(int decrement) {
		this.speed -= decrement;
	}

	public void speedUp(int increment) {
		this.speed += increment;
	}

	// toString method to print infor of Bicycle.
	public String toString() {

		return (" No of gears " + this.gear + "\n" + " Speed of bicycle is " + this.speed);
	}

}
