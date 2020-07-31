package com.corejava.algorithms;

public class BubbleSort {

	public void BubbleSortDefault(int[] array) {
		System.out.println("Method BubbleSortDefault");
		int[] arg = array;

		System.out.println("Before sorting array is");
		for (int i = 0; i < arg.length; i++) {

			System.out.print(arg[i] + " ");
		}
		System.out.println();
		/* Bubble sort default implementation Method 1 */

		for (int i = 1; i < arg.length; i++) // In the first loop iterate for length -1
		{

			for (int j = 0; j < arg.length - 1; j++) {

				if (arg[j] > arg[j + 1]) {

					int tmp = arg[j];
					arg[j] = arg[j + 1];
					arg[j + 1] = tmp;

				}
			}

		}

		System.out.println("After sorting array is");
		for (int i = 0; i < arg.length; i++) {

			System.out.print(arg[i] + " ");
		}

	}

	public void BubbleSortImproved1(int[] array) {

		/**
		 * Bubble sort improved method. In this method in inner loop is iterated array
		 * length minus 1 as the largest number is already reached to the last position
		 * in the first iteration and so on
		 */
		System.out.println();
		System.out.println("Method BubbleSortImproved1");
		int[] secondArray = array;
		System.out.println("Arreay before sorting");
		for (int i = 0; i < secondArray.length; i++) {
			System.out.print(secondArray[i] + " ");
		}
		System.out.println("");
		for (int i = 1; i < secondArray.length; i++) {
			for (int j = 0; j < secondArray.length - i; j++) {

				if (secondArray[j] > secondArray[j + 1]) {
					int temp = secondArray[j];
					secondArray[j] = secondArray[j + 1];
					secondArray[j + 1] = temp;
				}
			}
		}

		System.out.println("Arreay before sorting");
		for (int i = 0; i < secondArray.length; i++) {
			System.out.print(secondArray[i] + " ");
		}

	}

	public void BubbleSortImproved2(int[] array) {

		int[] arr = array;
		System.out.println();
		System.out.println(" Method BubbleSortImproved2");
		System.out.println(" Before Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		boolean swaphappen;
		swaphappen = true;

		int i = 1;

		while (swaphappen) {

			swaphappen = false;

			for (int j = 0; j < arr.length - i; j++) {

				if (arr[j] > arr[j + 1]) {

					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;

					swaphappen = true;
				}

			}

			i++;

		}

		System.out.println(" ");
		System.out.println(" After Sort");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}

	}

	public static void main(String args[]) {

		BubbleSort srt = new BubbleSort();

		srt.BubbleSortDefault(new int[] { 67, 4, 2, 99, 5, 6 });
		srt.BubbleSortImproved1(new int[] { 88, 101, 45, 2, 9, 1, 3 });
		srt.BubbleSortImproved2(new int[] { 88, 101, 45, 2, 9, 1, 3 });
	}

}
