package com.htc.javatraining.exercises;

public class empTotalSalary {
	
	public static void main(String[] args) {
	
		double[] empBasicSalary = {45300.56, 56560.75, 78450.00, 92000.76, 65000.75};
		int[] empDA = {200, 320, 150, 300, 420};
		float[] empHRA = {2322.45f, 2100.00f, 1200.56f, 2000.00f, 3200.45f};
		
		double totSalary = 0.0;
		int totDA = 0;
		float totHRA = 0.0f;
		
		//print total and average basic salary
		for (int i = 0; i < 5; i++) {
			totSalary += empBasicSalary[i];
		}
		System.out.println("Total basic salary of all emplouees: " + totSalary);
		System.out.println("Average basic salary of all emplouees: " + totSalary/5);
		
		//print total and average DA
		for (int i = 0; i < 5; i++) {
			totDA += empDA[i];
		}
		System.out.println("Total DA of all emplouees: " + totDA);
		System.out.println("Average DA of all emplouees: " + totDA/5);
		
		//print total and average HRA
		for (int i = 0; i < 5; i++) {
			totHRA += empHRA[i];
		}
		System.out.println("Total HRA of all emplouees: " + totHRA);
		System.out.println("Average HRA of all emplouees: " + totHRA/5);
		
		//print total salary of each employee
		System.out.println();
		double empMonthlySalary = 0;
		double allEmpSalary = 0;
		
		for(int i = 0; i < 5; i++) {
			empMonthlySalary = empBasicSalary[i] + empDA[i] + empHRA[i];
			System.out.println("Monthly salary of employee " + i + " is: " + empMonthlySalary);
			allEmpSalary += empMonthlySalary;
		}
		
		System.out.println();
		System.out.println("All employees total salary is: " + allEmpSalary);
	}

}