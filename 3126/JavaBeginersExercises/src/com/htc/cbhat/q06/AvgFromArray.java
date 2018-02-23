package com.htc.cbhat.q06;

public class AvgFromArray {

	public static void main(String[] args) {

		float salArray[] = new float[5];  
		
		// Initializing salaries
		salArray[0] = 95000.00f;
		salArray[1] = 101000.00f;
		salArray[2] = 60000.00f;
		salArray[3] = 125000.00f;
		salArray[4] = 30000.00f;
		
		//Compute Average
		float totalSal = 0;
		for ( int i = 0; i < 5; i++ ) {
			totalSal += salArray[i];
		}
		
		float avgSal = totalSal / 5;
		
		System.out.println("Average Salary of 5 employees is : " + avgSal );
		
	}

}
