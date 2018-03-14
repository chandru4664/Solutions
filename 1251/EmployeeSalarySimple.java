package com.htc.coreexercise.beginers;

public class EmployeeSalarySimple {
	public static void main(String[] args) {
		int eSalary[]= {1200,2340,1203,2034,2350}; // Initializing and adding salaries of 5 employees to an array
		int averageSal=0;
		for(int i=0;i<eSalary.length;i++)
		{
			averageSal= averageSal+eSalary[i];			
		}
		System.out.println("Average Salary or 5 employees= $" + (averageSal/5));

	}
	
}
