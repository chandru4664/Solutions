package com.htc.cbhat.q09;

public class SalaryDaHRA {

	private final short EMPLOYEE_COUNT = 5;
	
	private float basicArray[];  
	private float daArray[];  
	private float hraArray[];  

	public static void main(String[] args) {

		SalaryDaHRA obj = new SalaryDaHRA();
		
		// Initialize Basic, DA and HRA
		obj.init();
	
		// Display specified information
		obj.displayInfo();

	}

	public void init() {

		basicArray = new float[EMPLOYEE_COUNT];
		
		basicArray[0] = 65000.00f;
		basicArray[1] = 71000.00f;
		basicArray[2] = 40000.00f;
		basicArray[3] = 95000.00f;
		basicArray[4] = 20000.00f;
		
		daArray = new float[EMPLOYEE_COUNT];
		hraArray = new float[EMPLOYEE_COUNT];
		
		for ( int i = 0; i < 5; i++ ) {
			daArray[i] = 0.25f * basicArray[i];
			hraArray[i] = 0.1f * basicArray[i];
		}
		
	}
	
	public void displayInfo() {

		System.out.println("Basic Salary Info :");
		displayTotalAndAverage(basicArray);

		System.out.println("DA Info :");
		displayTotalAndAverage(daArray);

		System.out.println("HRA Info :");
		displayTotalAndAverage(hraArray);
		
		float allEmployeeTotal = 0;
		for ( int i = 0; i < EMPLOYEE_COUNT; i++ ) {
			allEmployeeTotal += basicArray[i] + daArray[i] + hraArray[i];
		}
		
		System.out.println("\nAbsolute Total Salary of all Employees: " + allEmployeeTotal);
		
	}
	
	// Utility Functions
	private void displayTotalAndAverage(float[] array) {

		float total = 0;

		for ( int i = 0; i < EMPLOYEE_COUNT; i++ ) {
			total += array[i];
		}
		
		float average = total / EMPLOYEE_COUNT;

		System.out.println("Total : " + total + "\tAgerage : " + average);
		
	}

}
