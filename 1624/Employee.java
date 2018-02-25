package com.htc.corejava.exercises;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double Basic[] = {10100.90,20200.55,30300.33,40400.88, 60500.77};
		Integer DA[] = {100,200,300,400,500};
		Double HRA[] = {1001.50,2001.70,3003.80,4004.20,5002.40};
		Double basicsum=0.0;
		Integer DAsum=0;
		Double HRAsum=0.0;
		String line="--------------------------------------------------------------------------";
		
		//Total and Average for Basic
		for(Double b:Basic) {
			basicsum = basicsum + b;
		}
		System.out.println("Total Basic Salary for all Employess is " + basicsum);
		System.out.println("Average Basic for Basic Component is " + (basicsum/Basic.length));
		System.out.println("\n" + line + "\n");
		
		
		// Total and Average for DA
		for(Integer d:DA) {
			DAsum = DAsum + d;
		}
		System.out.println("Total DA component for all Employees is " + DAsum);
		System.out.println("Average DA for DA Component is " + (DAsum/DA.length));
		System.out.println("\n" + line + "\n");
		
		// Total and Average for HRA
		for(Double h:HRA) {
			HRAsum = HRAsum + h;
		}
		System.out.println("Total HRA component for all Employess is " + HRAsum);
		System.out.println("Average HRA for HRA Component is " + (HRAsum/HRA.length));
		System.out.println("\n" + line + "\n");
		
		// Total and Average for Entire Salary for Every Employee
		int counter=0;
		for(counter=0; counter<Basic.length; counter++) {
			System.out.println("Total Salary for Employee-" + (counter+1) + " is " + (Basic[counter] + DA[counter] + HRA[counter]));
			;
		}
	}

}
