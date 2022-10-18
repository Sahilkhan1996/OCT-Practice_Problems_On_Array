package com.bridgelabz.duplicate_elements_of_array;

//Java Program to print the duplicate elements of an array
//I/P:{1,2,3,4,1,2}
//O/P:{1,2}
public class DuplicateElementPrinter {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 1, 2,1};
		for(int i=0; i<input.length; i++ ) {
			for(int j=i+1; j<input.length; j++) {
				if(input[i]==input[j]) {
					System.out.print(input[i]+" ");
					break;
				}
			}
		}
	}
}
