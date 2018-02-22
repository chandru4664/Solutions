package com.corejava.exercise;

/**
 * Program to create an array to store basic ,DA and HRA of 5 employees.
 * Output : Calculate total and average for each components and Total salary of all employees 
 *
 */
public class ArrayEmployees {

	public static void main(String[] args) {

		int basicSalary[]  = new int[] {30000,35000,36000,45000,50000};                   //Define an array and assign values for basic salary
        int allowanceDA[]  = new int[] {1000,1500,2000,2500,3000};                        //Define an array and assign values for DA allowance
        int allowanceHRA[] = new int[] {5000,6000,7000,8000,9000};                        //Define an array and assign values for HRA allowance
        int totalBasic = 0, totalDA = 0, totalHRA = 0, n=5;                               //Initialize variables
        
        for (int i=0;i<n;i++) {
        	totalBasic = totalBasic + basicSalary[i];                                      //Iterate through loop and calculate total amounts
        	totalDA    = totalDA + allowanceDA[i];
        	totalHRA   = totalHRA + allowanceHRA[i];
        	}
        int totalSalary = totalBasic + totalDA + totalHRA;                                 //Calculate total salary
        
        System.out.println("Basic Salary  ==> Total  : " +totalBasic);                     //Print results in output console    
        System.out.println("Basic Salary  ==> Average: " +totalBasic/n);
        System.out.println("DA Allowance  ==> Total  : " +totalDA);
        System.out.println("DA Allowance  ==> Average: " +totalDA/n);
        System.out.println("HRA Allowance ==> Total  : " +totalHRA);
        System.out.println("HRA Allowance ==> Average: " +totalHRA/n);
        System.out.println("Total salary of all employees: "+ totalSalary);
        }
	}


