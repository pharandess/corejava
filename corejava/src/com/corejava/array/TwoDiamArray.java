/** Two diamentional array example
 * 
 */
package com.corejava.array;
public class TwoDiamArray {
public static void main(String[] args) {
	
	int arr[][] = new int[3][2];
	// int arr[][] = {{1,2},{2,4},{4,5}}
	
	System.out.println("Array Length");
	System.out.println(arr.length);
	System.out.println(arr[0].length);
	
	System.out.println("Print array");

	  for (int i=0;i<arr.length;i++){
		
		for (int j=0;j<arr[i].length;j++){
			arr[i][j] = i+j;
			System.out.print(arr[i][j]);
			if (j!= arr[i].length-1){
				System.out.print(",");
			}
		}
		
	
		System.out.println();		
	}	
}
}