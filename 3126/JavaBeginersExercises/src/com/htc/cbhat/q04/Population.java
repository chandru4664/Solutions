package com.htc.cbhat.q04;

public class Population {

	public static void main(String[] args) {
		
		int currentYear = 2000;
		long population = 6000000000L;
		while ( currentYear < 2010 ) {
			currentYear++;
			population = Math.round(population + population * 0.01);
		}
		
		System.out.println("Population in " + currentYear + ": " + population);
		
	}

}
