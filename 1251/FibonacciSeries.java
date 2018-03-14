package com.htc.coreexercise.beginers;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
	int newNumber ;
	int currentNumber=1;
	int preNumber=0;	
	Scanner scn = new Scanner(System.in); // need this object to accept input from user
	
	System.out.println("How many fibonacci numbers do you need?");
	try {
		int intHowMany = scn.nextInt(); // read the console for input
		scn.close();
		if (intHowMany==0) return ; // in case the user entered 0

		if (intHowMany==1) {  // in case user entered 1
			System.out.print("0");
		}
		else if(intHowMany==2) // in case user entered 2
		{
			System.out.print("0,1");
		}
		else {
			System.out.print("0,1,");
				for(int i=2;i<intHowMany;i++)
				{
					newNumber=preNumber+currentNumber;
					System.out.print(newNumber+ ",");
					preNumber=currentNumber;
					currentNumber= newNumber;
				}
		}
	}
	catch (Exception e) {// general exception message for all invalid entries		
		System.out.println("Please provide a valid number");
	}

	}
}
