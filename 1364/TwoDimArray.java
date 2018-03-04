package com.htc.javabasics;

public class TwoDimArray {

	public static void main(String[] args) {
		// TWO DIMENTIONAL ARRAY IS USED AS WE NEED TO CREATE TABLE OF 3 x 5.
		double salComps [] [] = {{3000.0,4000.0,5000.0,6000.0,7000.0},
				                 {100.0,200.0,300.0,400.0,500.0},
				                 {100.0,200.0,300.0,400.0,500.0}
		                        };
		double avgBasic = 0.0;
		double totalBasic = 0.0;
		double avgDA = 0.0;
		double totalDA = 0.0;
		double avgHRA = 0.0;
		double totalHRA = 0.0;
		double emp1Sal = 0.0;
		double emp2Sal = 0.0;
		double emp3Sal = 0.0;
		double emp4Sal = 0.0;
		double emp5Sal = 0.0;
		
		for (int row=0 ; row < salComps.length; row++) {
			
			for(int col=0; col < salComps[row].length; col++) {
											
					switch(row) {
					case 0: 
					   totalBasic = totalBasic + salComps[row][col];
					   break;
					case 1:
					   totalDA = totalDA + salComps[row][col];
					   break;
					case 2:
					   totalHRA = totalHRA + salComps[row][col];
					 break;
					
						 
					}
					switch(col) {
					case 0 :
						emp1Sal=emp1Sal + salComps[row][0];
						break;
					case 1 :
						emp2Sal=emp2Sal + salComps[row][1];
						break;
					case 2 :
						emp3Sal=emp3Sal + salComps[row][2];
						break;
					case 3 :
						emp4Sal=emp4Sal + salComps[row][3];
						break;
					case 4 :
						emp5Sal=emp5Sal + salComps[row][4];
						break;
					}
				}
				
			}
		
		avgBasic = totalBasic/5;
		avgDA = totalDA/5;
		avgHRA = totalHRA/5;
		
		System.out.println("*******Tatal of each components*******" );
		System.out.println("Tatal Basic  :" + totalBasic);
		System.out.println("Tatal DA     :" + totalDA);
		System.out.println("Tatal HRA    :" + totalHRA);
		System.out.println("*******Average of each components*******" );
		System.out.println("Average Basic:  " + avgBasic);
		System.out.println("Average DA     :" + avgDA);
		System.out.println("Average HRA    :"+ avgHRA);
		System.out.println("*******Salary of individual employee*******" );
		System.out.println("Total salary of employee1  " +  emp1Sal);
		System.out.println("Total salary of employee2  " +  emp2Sal);
		System.out.println("Total salary of employee3  " +  emp3Sal);
		System.out.println("Total salary of employee4  " +  emp4Sal);
		System.out.println("Total salary of employee5  " +  emp5Sal);
		
		
		
		}
	}


