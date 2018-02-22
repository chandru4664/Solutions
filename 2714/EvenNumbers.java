package com.corejava.exercise;

/** Program to print all even numbers from 0 to 100 **/

public class EvenNumbers {

	public static void main(String[] args) {
		
		int num = 100;
		System.out.println(" Even numbers within 100 are:");
		
		for (int i =1;i<=num;i++) {
			if(i%2 == 0) {
				System.out.print(i+"\n");
			}
		}

	}

}
