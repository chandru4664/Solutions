package com.htc.basic.javabasic;

public class WorldPopulation {

	public static void main(String[] args) {
		
		long population = 6000000000L; 
		for(int year= 2001 ; year < 2010; year ++){
			population = (long) (population + (population * 0.01));
			System.out.println("Population for " + year + " is " + population);
		}
	}

}


//Good 
