
package com.corejava.exercise;

/**
 * Program to calculate world population by getting current population and growth rate from user
 * Input : Current Population, Growth Rate
 * Output: Population from 2001 to 2010 (in years)
 */

import java.util.Scanner;                                                                              //import scanner to get value from input stream

public class WorldPopulation {

		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);                                        //create object for scanner class
					
			int year = 2000;      
			
			// Get the current population from user
			System.out.println("Enter the Current population in year" +year+ ": ");
			long currentPop = input.nextLong();                                             //declared in long type to accept numbers in billions
			
			// Get the growth rate percentage from user
			System.out.println("Enter the Growth Rate%: ");
			double growthRate = input.nextDouble();                                         //declared as double type to accept precision value 
			
			System.out.println("Current Population in year "+year+" is: " +currentPop);     //Display current population
			
			while (year < 2010) {

				year = year+1;
				currentPop = (long) (currentPop + (currentPop * (growthRate/100)));
				System.out.println("Population in year "+year+" is: " +currentPop);     //Display population based on growth rate
				
			}
			input.close();                                                                  //close scanner

	}

}
Solution
Enter the Current population in year2000: 6000000000
	Enter the Growth Rate%: 1
Current Population in year 2000 is: 6000000000
	Population in year 2001 is: 6060000000
	Population in year 2002 is: 6120600000
	Population in year 2003 is: 6181806000
	Population in year 2004 is: 6243624060
	Population in year 2005 is: 6306060300
	Population in year 2006 is: 6369120903
	Population in year 2007 is: 6432812112
	Population in year 2008 is: 6497140233
	Population in year 2009 is: 6562111635
	Population in year 2010 is: 6627732751

