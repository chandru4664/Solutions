package com.htc.corejava.exercises;

public class DataExpressions18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/******************************************************************************************
		
		Consider the following expression:
		i--%5>0
		What is the result of the expression, assuming that the value of i is initially 10?
		Answer - True
		Modify the expression so that it has the same result but is easier for programmers to read.
		Answer - Define 2 variables to make the code readable
		int j=0;
		boolean result=false;
		j = (i--)%5;
		result = j>0;
	
		******************************************************************************************/

		int i=10;
				
		System.out.println("\n *************************************************************************");
		System.out.println("\n int i=10");
		System.out.println(" Value of Expression i--%5>0 is " + (i--%5>0));
		System.out.println("\n *************************************************************************");
	
		System.out.println("\n To make the code more readable, first re-initiaze value of i to 10");
		i=10;
		System.out.println("\n Modify it as ((i--)%5)>0, to get same result as previous which was " + (((i--)%5)>0));
		System.out.println("\n If continued without re-initialization the result for modified code ((i--)%5)>0 will be " + (((i--)%5)>0) );
		System.out.println("\n *************************************************************************");
	}

}
