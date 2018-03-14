package com.htc.javatraining.exercises;

import java.util.Scanner;

public class fibonacciNumbers {
	
	public static void main(String[] args) {
		
		int preNum = 0;
		int curNum = 0;
		int nextNum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to print fibonacci series:");
		int totNum = scanner.nextInt();
		
		if (totNum < 0) {
			System.out.println("Invalid inout");
		} else {
			System.out.println("The fibonacci Numbers are:");
			if (totNum < 1) {
				System.out.print(curNum);
			} else {
				if(totNum < 2) {
					curNum++;
					System.out.print(preNum + " " + curNum);
				} else {
					curNum++;
					System.out.print(preNum + " " + curNum);
					for(int i = 0; i < totNum-2; i++) {
						nextNum = preNum + curNum;
						System.out.print(" " + nextNum);
						preNum = curNum;
						curNum = nextNum;
					}
				}
			}
		}
		
		scanner.close();
		
	}

}
