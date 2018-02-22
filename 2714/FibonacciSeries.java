package com.corejava.exercise;

/**
 * Program to write Fibonacci series
 * Input : Total numbers to be displayed
 * Output: Fibonacci series number
 *
 */

import java.util.Scanner;                                                                  //Import scanner to get value from input stream

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int first = 0, second = 1, sum =0;
		
		Scanner input = new Scanner(System.in);                                            //Create scanner object to get input from user
		System.out.println("Enter total number to be displayed for Fibonacci series:");    
		int number = input.nextInt();
		
		System.out.print("Fibonacci series of first "+number+ " numbers are: ");           
		
		for (int i=1;i<=number;i++) {
			System.out.print(first + " ");                                                //Print Fibonacci series iterating through loop
			sum = first + second;
			first = second;
			second = sum;
		}
		input.close();                                                                     //Close input object

	}

}
