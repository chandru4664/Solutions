package com.htc.coreexercise.beginers;

public class WorldPopulation {

	public static void main(String[] args) {// Percentage growth of WorldPopulation
		double population; // we use double as int and Long cannot store the value of this large magnitude
		population =6000000000L;
		for(int year=2000;year<=2010;year++) {
			System.out.println("Population in the year " + year + " is " + population);
		population= population + (population *0.01);
		}

	}

}
