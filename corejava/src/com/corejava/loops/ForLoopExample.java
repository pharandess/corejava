package com.corejava.loops;
import java.util.Scanner;

/* Example to explain for loop. Program takes input number from the user and 
 * print numbers till that number starting from input number. 
 * 
 */
public class ForLoopExample {

	public static void main(String[] args) {
		
		int num;
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter Number:");
		num = scr.nextInt();
					
		for (int i=1;i<=num;i++){
			System.out.println(i);
		}
		scr.close();
	}
}
