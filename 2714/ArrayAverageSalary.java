package com.corejava.exercise;

/**
 * Program to calculate average salary of 5 employees using array
 * 
 */

public class ArrayAverageSalary {

	public static void main(String[] args) {
		
		int salary[] = new int[] {30000,35000,36000,45000,50000};                   //Define an array and assign values for salary
		int sumSalary = 0;
		
		for (int i=0;i<salary.length;i++) {   
			System.out.println(" Salary of employee " +(i+1)+ ": " +salary[i]);     //Display salary of each employee 
			sumSalary = sumSalary + salary[i];                        				//Calculate Sum of salary
		}
		
		double avgSalary = sumSalary/salary.length;									//Calculate Average Salary
		System.out.println("Average salary of 5 employees are: "+avgSalary);        //Display Average Salary to output console

	}

}
