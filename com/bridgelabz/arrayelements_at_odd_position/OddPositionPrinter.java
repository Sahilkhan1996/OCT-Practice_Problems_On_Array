package com.bridgelabz.arrayelements_at_odd_position;
//Java Program to print the elements
//of an array present on odd position

public class OddPositionPrinter {
public static void main(String[] args) {
	int[] input = { 0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	for (int i = 1; i < input.length; i = i + 2) {
		System.out.print(input[i] + " ");
	}
}
}
