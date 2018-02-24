package com.htc.corejava.day1;

public class WordPopulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The current world population (in 2000) 
		 * is 6 billion. If the population increases 
		 * by 1% every year, what will be the population in 2010? 
		 * What data type would you use for storing the world population? Why?
		 * 
		 * Written by Prasanna Mate
		 * 23-Feb-2018.
		 */
		double population = 6000000000d;
		for (int i = 1; i < 11; i++) {
			population = population + population * 0.01;
		}
		System.out.println(population);
	}

}
