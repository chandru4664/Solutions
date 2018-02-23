package com.htc.basic.javabasic;

public class EmployeeSalary {

	public static void main(String args[]) {
		
		//Method 1 
		int[] salaries= {1000, 2000 , 3000 , 4000, 5000};
		int totalSalary = 0;
		for(int i=0; i < salaries.length; i++) {
			totalSalary = totalSalary + salaries[i];
		}
		System.out.println("Total Salary Amount : " + totalSalary);
		System.out.println("Average Salary : " + totalSalary/salaries.length);
		
		//Method 2 
		salaries = new int[5];
		salaries[0] = 1000; salaries[1] = 2000 ; salaries[2] = 3000;
		salaries[3] = 4000; salaries[4] = 5000;
		totalSalary = 0;
		for(int i=0; i < salaries.length; i++) {
			totalSalary = totalSalary + salaries[i];
		}
		System.out.println("Total Salary Amount : " + totalSalary);
		System.out.println("Average Salary : " + totalSalary/salaries.length);
		
		//Method 3
		totalSalary = 0;
		for(int salary : salaries) {
			totalSalary = totalSalary + salary;
		}
		System.out.println("Total Salary Amount : " + totalSalary);
		System.out.println("Average Salary : " + totalSalary/salaries.length);
	}
}
