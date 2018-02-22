package com.htc.hadoop.corejava.beginners;

public class PopulationDemo {

	public static void main(String[] args) {
		long worldPopulation = 6000000000L;
		for (int i = 2001; i <= 2010; i++) {
			worldPopulation += worldPopulation * 0.01;
		}
		System.out.println("World Population by 2010 = " + worldPopulation);
	}

}
