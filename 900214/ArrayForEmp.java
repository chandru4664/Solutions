package com.htc.corejava.day2;

/*Create an array to store the salaries of 5 employees,
assign some values, find the average salary and print
it.*/

public class ArrayForEmp {

	public static void main(String[] args) {
		int[] SalArray = {1000, 3000, 8000, 5000, 6000};
		
		for(int i=0;i<SalArray.length;i++) {
			System.out.print(SalArray[i]+ " ,");
			
		}
		
		int totalSalary=0;
		
		for (int salary : SalArray){
			totalSalary += salary;
		}
		System.out.println("Average Salary : " + totalSalary/SalArray.length);
		
		//int i=0;
		
		/*for (i=0; i<Sal.length;i++){
			System.out.println("Display employee Salary : " + Sal[i]);
			
			avg = avg + Sal[i];
		}
		System.out.println("Average Salary : " + avg/i);*/
	}

}
