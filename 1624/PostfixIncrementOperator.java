package com.htc.corejava.exercises;

public class PostfixIncrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int n = i++%5;
		
		/*********************************************************************************/
		/** Value of i will be 10 and n will be 0 after Post-fix Operator initialization ***/
		/*********************************************************************************/
		System.out.println("*************************************************************");
		System.out.println("Value Initialization with Post-fix Operator as below");
		System.out.println("int i = 10" + "\nint n = i++%5");
		System.out.println("Value of i = " + i + ".");
		System.out.println("Value of n = " + n + ".");
		
		

		System.out.println("************************************************************");
		/** Value of i will be 11 and n will be 1 after Pre-fix Operator initialization ***/
		System.out.println("Value Initialization with Pre-fix Operator as below");
		i=10;
		n=++i%5;
		System.out.println("int i = 10" + "\nint n = ++i%5");
		System.out.println("Value of i = " + i + ".");
		System.out.println("Value of n = " + n + ".");
		System.out.println("************************************************************");
	}

}
