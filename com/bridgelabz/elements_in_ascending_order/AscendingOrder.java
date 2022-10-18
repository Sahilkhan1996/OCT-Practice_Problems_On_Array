package com.bridgelabz.elements_in_ascending_order;

import java.util.Arrays;

public class AscendingOrder {
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
		System.out.println(Arrays.toString(input));
	}
}