/**	Example of single diamention array
 * This example accept array size and then take input from the user
 * for the size of the array  		
 * 
 */
package com.corejava.array;
import java.util.Scanner;

public class SingleDiamentionArrayDemo {
	


	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		int arraySize; 
		System.out.println("Enter Array size:");
		arraySize = scr.nextInt();
		
		int[] arr = new int[arraySize];
		
		for (int i=0;i<arraySize;i++){
			System.out.println("Enter NUmber:");
			arr[i] = scr.nextInt();
		}
		System.out.println("You Entered");
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		scr.close();
	}
}