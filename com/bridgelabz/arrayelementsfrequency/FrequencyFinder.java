package com.bridgelabz.arrayelementsfrequency;

import java.util.Scanner;

//I/P:num=1
//O/P:frequency of number:3
public class FrequencyFinder {
	public static void main(String[] args) {
		int[] input = { 1, 2, 1, 100, 5, 1, 100, 8, 100, 10 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check the frequency: ");
		int num = sc.nextInt();
		int result = FrequencyFinder.frequncychecker(num, input);
		System.out.println("the frequency of the number " + num + " is " + result);
		sc.close();
	}

	public static int frequncychecker(int num, int[] input) {

		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (num == input[i]) {
				count++;
			}
		}
		return count;
	}
}
