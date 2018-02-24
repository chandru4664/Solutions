package com.htc.core.java.day1;

public class JavaTest6 {

	public static void main(String[] args) {
		int[] salaryOfEmployee = new int[] {25000, 30000, 35000, 40000, 45000};
		int sumOfSalary = 0;
		int averageSalary = 0;
		int salary = 0;

		for (int i = 0; i < salaryOfEmployee.length; i++)
		{
			salary = salaryOfEmployee[i];
			sumOfSalary= sumOfSalary + salary;
		}

		averageSalary = sumOfSalary/5;
		System.out.println("The Average of Salaries of 5 Employee:" + averageSalary);
	}

}
