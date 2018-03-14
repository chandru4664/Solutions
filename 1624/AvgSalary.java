package com.htc.corejava.exercises;

public class AvgSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer empsalary[] = {1008090,200900,300560,50055,6004567};
		Integer avgSalary=0;
		
		for(Integer number:empsalary) {
			avgSalary = avgSalary + number;
		}
		
		System.out.println("Average Salary in a store with 5 employess is " + (double)avgSalary / empsalary.length);
	}

}
