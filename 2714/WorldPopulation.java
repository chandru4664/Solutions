
package com.corejava.exercise;

/**
 * Program to calculate world population by getting current population and growth rate from user
 * Input : Current Population, Growth Rate
 * Output: Population from 2001 to 2010 (in years)
 */

import java.util.Scanner;                                                                  //import scanner to get value from input stream

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
				System.out.println("Population in year "+year+" is: " +currentPop);		    //Display population based on growth rate
				
			}
			input.close();                                                                  //close scanner

	}

}
