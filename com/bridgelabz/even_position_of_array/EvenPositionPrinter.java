package com.bridgelabz.even_position_of_array;

//Java Program to print
//the elements of an array present on an even position
public class EvenPositionPrinter {
	public static void main(String[] args) {
		int[] input = { 1, 2, 1, 100, 5, 1, 100, 8, 100, 10 };
		for (int i = 0; i < input.length; i = i + 2) {
			System.out.print(input[i] + " ");
		}

	}
}
