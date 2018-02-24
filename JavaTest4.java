package com.htc.core.java.day1;

public class JavaTest4 {

	public static void main(String[] args) {
		long worldPopulation = 6000000000L;
		double populationNextYear = 0d;

		System.out.println("World Population in year" + " 2000" + ":" + worldPopulation);

		for (int year = 2001; year <=2010; year++)
		{
			populationNextYear = (worldPopulation* (0.01)) + worldPopulation;
			worldPopulation   = (long) populationNextYear ;
			System.out.println("World Population in year "+ year + ":"  + worldPopulation);
		}

	}

}
