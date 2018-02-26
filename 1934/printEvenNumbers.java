package com.htc.javatraining.exercises;

public class printEvenNumbers {

	public static void main(String[] args) {
		
		System.out.println("The even numbers between 0 and 100 are:");
		
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
}
