package com.htc.core.java.day1;

import java.util.Scanner;

public class JavaTest15b {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); 
		reader.close(); 

		int[] numberArray = new int[]{10,20,30,40,50,60,70,80,90,100};


		for (int i =0; i< numberArray.length;i++)
		{
			if (numberArray[i] == n)
			{
				System.out.println("The Number " + n +" is   present in the Array" );

			}


		}


	}

}
