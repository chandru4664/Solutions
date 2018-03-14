package com.htc.corejava.training;

public class EmployeeAverageSalary {
	public static void main(String args[]) {
		int[] salaryArray = new int[] { 50000, 70000, 60000, 80000, 90000 };
		int sum = 0;
		for (int element : salaryArray) {
			sum = sum + element;
		}
		// calculate average value
		double average = sum / salaryArray.length;
		System.out.println("Average salary is : " + average);
	}

}
