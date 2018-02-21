package com.htc.corejava.day1;

/*
 * Current world population (in 2000) is 6 billion. If the population increases by 1% every year, what will be
 * the population in 2010
 */
public class WorldPopulation {

	public static void main(String[] args) {
		
		long current = 6000000000L; //population (in 2000) is 6 billion
		long annual;
		int year = 2001;
		while(year<=2010) // Looping
		{
			annual = current + (current * 1/100);
			current = annual;
			System.out.println("Population for " + year + " is " + current);
			year = year +1;
		}
	}

}
