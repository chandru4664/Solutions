package com.htc.corejava.exercises;

public class Population {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start_yr = 2000;
		int end_yr = 2010;
		long init_population = 6000000000l;
		long final_population=0;
				
		System.out.println("In Year " + start_yr + " world population is 6 billion." );
		
		while(start_yr <= end_yr) {
			final_population = init_population + (long)(init_population * 0.01);
			init_population = final_population;
			start_yr++;
		}
		System.out.println("By end of " + end_yr + " the world population is " + final_population + ".");
	}

}
