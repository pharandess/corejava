/** Single diamention array example  
 *	This example accept  
 *	This example take input from user for the tow array with 5 element in each array.
 *	Then displays the sum of element from each array.  
 */
package com.corejava.array;

import java.util.Scanner;

public class SinDiamArrayAddDemo {
	public static void main(String[] args) {

		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		int[] arr3 = new int[arr2.length];

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter 5 integer for array1  ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scr.nextInt();
		}
		
		System.out.println("Enter 5 integer for array2");
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = scr.nextInt();
			;
		}

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				arr3[i] = arr1[i] + arr2[i];
			}
			System.out.println("Elements from third array");
			
			for (int i = 0; i < arr3.length; i++) {
				System.out.println(arr1[i] + "+" + arr2[i] + "=" + arr3[i]);
			}
		}
		scr.close();
	}
}
