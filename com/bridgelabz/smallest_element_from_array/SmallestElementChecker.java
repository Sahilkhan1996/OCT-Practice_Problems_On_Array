package com.bridgelabz.smallest_element_from_array;

//Java Program to print the smallest element in an array

public class SmallestElementChecker {
	public static void main(String[] args) {
		int[] input = { 20, 2, 1, 100, 5, 1, 100, 8, 100, 10 };
		int min = input[0];
		// Iterating all the array elements
		for (int i = 0; i < input.length; i++) {
			// checking if the array elements is smaller than min variable
			if (min > input[i]) {
				// if minimum then adding that element in the min var
				min = input[i];
			}
		}
		System.out.println("Smallest element is: " + min);
	}
}
