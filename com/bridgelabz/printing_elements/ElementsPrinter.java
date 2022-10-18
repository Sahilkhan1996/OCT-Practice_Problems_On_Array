package com.bridgelabz.printing_elements;

import java.util.Arrays;

public class ElementsPrinter {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 10, 100 };

		// printing elements of array with for loop
		for (int i = 0; i < input.length-1; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println(input[input.length-1]);

		// printing elements of array with the for each loop
		for (int i : input) {
			System.out.println(i);
		}

		// printing array elements with the toString
		System.out.println(Arrays.toString(input));
	}
}
