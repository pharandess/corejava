/**
 * This program shows use of control statement continue, break and return.
 *  
 * 
 */
package com.corejava.conditions;

public class ContolStatmentExample {

	public static void main(String args[]) {

		
		// continue example
		System.out.println("Print odd number between 1 and 10");
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0)
				continue;

			System.out.println(i);

		}
		
		// beak example
		System.out.println("Break loop when i = 6");
		for (int i = 1; i <= 10; i++) {
			
			if (i==6) {
				break;
			}
			System.out.println(i);
			
		}
		System.out.println("Return when condition is met");
		// return
		for (int i=1;i<5;i++) {
			if (i== 3)
				return;
			System.out.println(i);
			
		}
		System.out.println("This statement is not printed because of return.");
	}
}