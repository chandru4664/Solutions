package com.htc.hadoop.corejava.beginners;

public class ArraySalaryDemo {

	public static void main(String[] args) {
		int salaryArr[] = { 10000, 20000, 30000, 40000, 50000 };
		int totalSalary = 0;
		for (int salary : salaryArr) {
			totalSalary += salary;
		}
		System.out.println("Average Salary = " + totalSalary / salaryArr.length);
	}

}
