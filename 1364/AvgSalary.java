package com.htc.javabasics;

public class AvgSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalSal = 0.0;
		double[] sal = new double[5];
		sal[0] = 50000.0;
		sal[1] = 60000.0;
		sal[2] = 75000.0;
		sal[3] = 67000.0;
		sal[4] = 90000.0;
		for (int i=0;i<sal.length ; i++) {
			totalSal = totalSal + sal[i];
		}
		double avgsal = totalSal / 5;
		System.out.println("average salary : " + avgsal);
	}
 
}
