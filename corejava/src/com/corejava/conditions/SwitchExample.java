/*
 * This example explain use of switch statement along with use of break statement.
 * Break: In Java, break is majorly used for:
 *	1) Terminate a sequence in a switch statement (discussed above).
 *	2) To exit a loop.
 *	3) Used as a “civilized” form of goto.Using break to exit a Loop
 *  
 */
package com.corejava.conditions;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String args[]) {

		int option;
		boolean quit = false;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Choose Option");
			System.out.println("1 : Addtion");
			System.out.println("2 : Substraction");
			System.out.println("3 : Division");
			System.out.println("4 : Multiplication");
			System.out.println("5 : Exit");

			System.out.print("Enter you option : ");

			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("This is Addition");
				break;
			case 2:
				System.out.println("This is Substraction");
				break;
			case 3:
				System.out.println("This is Division");
				break;
			case 4:
				System.out.println("This is Multiplication");
				break;
			case 5:
				System.out.println("Program Terminated");
				quit = true;
				break;
			}

		} while (!quit);

		sc.close();
	}

}
