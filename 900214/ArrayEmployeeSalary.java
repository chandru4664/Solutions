package com.htc.corejava.day2;

/*Create an array to store the basic, DA and HRA of 5
employees. Find the total and average for every
component (for all employees) and also the total salary
for all employees.*/

public class ArrayEmployeeSalary {

	public static void main(String[] args) {
		int basicArr[] = { 10000, 20000, 30000, 40000, 50000 };
		int daArr[] = { 5000, 4000, 3000, 2000, 1000 };
		int hraArr[] = { 9000, 7000, 5000, 3000, 1000 };
		int basicTotal = 0, daTotal = 0, hraTotal = 0;
		int totalSalary[] = new int[5];

		for (int i = 0; i < 5; i++) {
			basicTotal += basicArr[i];
			daTotal += daArr[i];
			hraTotal += hraArr[i];
			totalSalary[i] = basicArr[i] + daArr[i] + hraArr[i];
		}
		System.out.println("Total Basic = " + basicTotal + ", Average Basic = " + basicTotal / basicArr.length);
		System.out.println("Total DA = " + daTotal + ", Average DA = " + daTotal / daArr.length);
		System.out.println("Total HRA = " + hraTotal + " Average HRA = " + hraTotal / hraArr.length);

		for (int i = 0; i < totalSalary.length; i++) {
			System.out.println("Total Salary for Employee " + (i + 1) + " = " + totalSalary[i]);
		}
	}

}
