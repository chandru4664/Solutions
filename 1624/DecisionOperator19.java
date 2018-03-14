package com.htc.corejava.exercises;

public class DecisionOperator19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/****************************************************************************************************
		 What's wrong with the following code snippet:
		if (i = 1) {
		\/* do something \*/
		//}
		 /***************************************************************************************************/
		System.out.println("**************************************************************************************");
		System.out.println("Initial Given Code was ");
		System.out.println("if (i = 1) {");
		System.out.println("/* do something */");
		System.out.println("}");
		System.out.println("**************************************************************************************");
		System.out.println("Answer - Because code has decision making using if, it should be modified as below");
		System.out.println("if(i==1) {");
		System.out.println("/* do something */");
		System.out.println("}");
		System.out.println("**************************************************************************************");
		int i=0;
		
		if(i==1) {
			System.out.println("Initial Value of i is " + i);
			System.out.println("Result of if(i==1) is " + (i==1) );
		}
		else {
			System.out.println("Initial Value of i is " + i);
			System.out.println("Result of if(i==1) is " + (i==1) );
		}
		
		System.out.println("**************************************************************************************");
			
	}

}
