package com.htc.javatraining.exercises;

public class worldPopulation {
	
	public static void main(String[] args) {

		double population = 6000000000L;			//we use double as it stores long values with decimals
		
		for (int i=2000; i < 2010; i++) {
			population += (population * 0.01);
		}
		
		System.out.print("Population in 2010 is: " + population);

	}

}
