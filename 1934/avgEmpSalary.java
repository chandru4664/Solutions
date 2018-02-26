package com.htc.javatraining.exercises;

public class avgEmpSalary {

	public static void main(String[] args) {
		
		int[] empSalary = {55000, 76000, 98000, 87000, 67000};
		int totSalary = 0;
		float avgSalary = 0.0f;
		
		for(int i = 0; i < empSalary.length; i++) {
			totSalary += empSalary[i];
		}
		
		avgSalary = totSalary/5;
		System.out.println("Employee average salary is: " + avgSalary);
	}
	
}
