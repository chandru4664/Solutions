package com.htc.corejava.day1;

public class Salaries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Written by Prasanna Mate.
		// 23-Feb-2018.
		double[] sal = {23456, 23675, 34534, 56743, 34587};
		double totalSal = 0.0;
		double avgSal = 0.0;
		for (int i = 0; i < sal.length; i++) {
			totalSal += sal[i];
		}
		avgSal = (double) totalSal / sal.length;
		System.out.println("Aaverage salary is " + avgSal);
	}	
}
