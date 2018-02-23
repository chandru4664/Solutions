package com.htc.cbhat.q10;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Read user input
		System.out.print("How many elements in Fibonacci Sequence you want? ");
		int elements = input.nextInt();

		System.out.println("Here is the sequence:");
		displayFibonacci(elements);
		
		input.close();
		
	}
	
	private static void displayFibonacci(int ele) {
		
		int curValue = 1;
		int prevValue = 1;
		
		// First two elements of Fibonacci Sequence are 1 and 1
		for (int i = 0; i < 2; i++ ) {
			System.out.print(1 + "\t");
		}
		
		for (int i = 2; i < ele; i++ ) {
			// Generate new set
			curValue += prevValue;
			prevValue = curValue - prevValue;
			
			System.out.print(curValue + "\t");
		}
	}

}
