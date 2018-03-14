package com.htc.corejava.day1;

public class EmpSal {
/*
 * Create an array to store the basic, DA and HRA 
 * of 5 employees. Find the total and average for every
 * component (for all employees) and also the total salary
 * for all employees.
 * 
 * Written by Prasanna Mate.
 * 23-Feb-2018.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] basicSal = {23456, 34567, 12365, 65437, 87432};
		int[] da = {234, 543, 654, 123, 543};
		int[] hra = {2345, 5432, 3456, 1234, 7654};
		int[] totSal = new int[5];
		int totBasic = 0;
		int totDa = 0;
		int totHra = 0;
		for (int i = 0; i < 5; i++) {
			totBasic += basicSal[i];
			totDa += da [i];
			totHra += hra [i];
		}
		System.out.println("Total Basic: " + totBasic / basicSal.length + " Total DA: " + totDa / da.length + " Total HRA: " + totHra / hra.length);
		for (int j = 0; j < totSal.length; j++) {
			totSal[j] = basicSal[j] + da[j] + hra[j];
			System.out.println("Total salary for employee " + (j+1) + " " + totSal[j]);
		}
		
	}

}
