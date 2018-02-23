package com.htc.basic.javabasic;

public class EmployeeDAAndHRA {
	
	public static void main(String args[]) {
		//tried doing without objects 
		int[][] employeeArray = new int[5][4];
		employeeArray[0][0] = 100;
		employeeArray[0][1] = 5000;
		employeeArray[0][2] = 6000;
		employeeArray[0][3] = 1000;
		
		employeeArray[1][0] = 101;
		employeeArray[1][1] = 5000;
		employeeArray[1][2] = 6000;
		employeeArray[1][3] = 1000;

		employeeArray[2][0] = 102;
		employeeArray[2][1] = 5000;
		employeeArray[2][2] = 6000;
		employeeArray[2][3] = 1000;
		
		employeeArray[3][0] = 103;
		employeeArray[3][1] = 5000;
		employeeArray[3][2] = 6000;
		employeeArray[3][3] = 1000;
		
		employeeArray[4][0] = 104;
		employeeArray[4][1] = 5000;
		employeeArray[4][2] = 6000;
		employeeArray[4][3] = 1000;
		
		int employeeBasic=0, employeeDA = 0, employeeAllowance = 0, totalPackage=0;
		for(int i=0; i < employeeArray.length; i++) {
			int employeePackage = employeeArray[i][1] + employeeArray[i][2] + employeeArray[i][3];
			System.out.println("Package for employee id " + employeeArray[i][0] + " " + employeePackage); 
			employeeBasic = employeeBasic + employeeArray[i][1];
			employeeDA = employeeDA + employeeArray[i][2];
			employeeAllowance = employeeAllowance + employeeArray[i][3];
			totalPackage = totalPackage + employeeBasic + employeeDA + employeeAllowance; 
		}
		
		System.out.println("Average Basic Salary " + employeeBasic/employeeArray.length);
		System.out.println("Average DA " + employeeDA/employeeArray.length);
		System.out.println("Average Allowance " + employeeAllowance/employeeArray.length);
		System.out.println("Average Package " + totalPackage/employeeArray.length);
		
		System.out.println("Total Basic Salary " + employeeBasic);
		System.out.println("Total DA " + employeeDA);
		System.out.println("Total Allowance " + employeeAllowance);
		System.out.println("Total Package " + totalPackage);
	}

}
