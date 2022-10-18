package com.bridgelabz.largest_element_from_array;

//I/P:array
//O/P:largest Number 100
public class LargestElementChecker {
	public static void main(String[] args) {
		int[] input = { 1, 2, 1, 100, 5, 1, 100, 8, 100, 10 };
		int max = 0;
		// Iterating all the array elements
		for (int i = 0; i < input.length; i++) {
			// checking if the array elements is greater than max variable
			if (max < input[i]) {
				// if maximum then adding that element in the max var
				max = input[i];
			}
		}
		System.out.println("Largest number is: " + max);
	}
}