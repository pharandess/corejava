/*
 * 	This example explain use of the if else condition.
	This program covers return statement as well.
 * 	Program take score as input from user and provide grade.  
 */
package com.corejava.conditions;

import java.util.Scanner;

public class IfConditionExample {

	public static void main(String args[]) {

		int mark;
		// scanner object to accept input from user.
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Markes between 0 and 100 :");

		mark = sc.nextInt();

		if (mark < 0 || mark > 100) {
			System.out.println("Invalid Marks, enter marks between 0 and 100");
			sc.close();
			// The return statement is used to explicitly return from a method. That is, it
			// causes a program control to transfer back to the caller of the method
			return;

		}

		if (mark >= 90) {

			System.out.println("Brilliant !!! You got A ++ Grade ");
		} else if (mark >= 80) {

			System.out.println("Excellent !!! You got A + Grade ");

		} else if (mark >= 60) {
			System.out.println("Good !!! You got A Grade ");
		} else if (mark >= 40) {

			System.out.println("Hushhh !!! Just passed ");
		} else {
			System.out.println("Bad Luck !!! You Failed ");
		}

		sc.close();
	}

}
