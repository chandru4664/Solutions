package com.htc.basic.javabasic;

public class EvenNumbers {
	public static void main(String args[]) {

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("You entered an even number." + i);
			} else {
				/* To print odd numbers , not part of the requirement */
				System.out.println("You entered an odd number." + i);
			}
		}
	}

}
