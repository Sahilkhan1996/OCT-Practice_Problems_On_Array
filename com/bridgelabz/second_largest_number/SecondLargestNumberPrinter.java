package com.bridgelabz.second_largest_number;

public class SecondLargestNumberPrinter {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 1, 2, 1 };
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] > input[j]) {
					// swapping
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}

		}
		System.out.println("Second Largest Number is: " + input[1]);
	}
}
