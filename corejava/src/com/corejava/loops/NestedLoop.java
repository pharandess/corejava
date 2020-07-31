/**
 * This example explain nested for loop. 
 * Program takes input from the user for number of rows and columns 
 * and print those many rows and columns using nested for loop.
 */
package com.corejava.loops;

import java.util.Scanner;

public class NestedLoop {
	public static void main(String[] args) {

		int rows, column;

		Scanner scr = new Scanner(System.in);
		System.out.print("Enter Number Of Rows = ");

		rows = scr.nextInt();

		System.out.println("Enter Number Of columns = ");
		column = scr.nextInt();

		System.out.println("Start Loop");
		
		for (int i = 0; i < rows; i++) {

			
			for (int j = 0; j < column; j++) {
				System.out.print("* ");

			}

			System.out.println("");
		}

		scr.close();
	}
}