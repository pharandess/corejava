package com.corejava.algorithms;

public class QuickSort {

	public static void sort(int[] numbers) {
		sort(numbers, 0, numbers.length - 1);
	}

	public static void sort(int[] numbers, int start, int end) {

		if (start < end) {

			int p = partition(numbers, start, end);
			sort(numbers, start, p - 1);
			sort(numbers, p + 1, end);
		}
	}

	public static int partition(int[] numbers, int start, int end) {

		int pivote = numbers[end];
		int x = start - 1;

		for (int i = start; i < end; i++) {
			if (numbers[i] < pivote) {
				x++;
				swap(numbers, x, i);
			}
		}
		swap(numbers, x + 1, end);
		return x + 1;

	}

	public static void swap(int[] a, int i, int j) {

		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

	public static void main(String[] args) {

		int[] a = new int[] { 5, 6, 3, 9, 72, 2, 67, 10 };

		System.out.println("Before Sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		sort(a);

		System.out.println("");
		System.out.println("After Sort");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
