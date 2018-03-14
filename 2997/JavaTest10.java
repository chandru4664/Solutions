package com.htc.core.java.day1;

public class JavaTest10 {

	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber= 1;
		int number = 0;
		System.out.print(firstNumber+" "+secondNumber);
		for (int i=1;i< 10;i++)
		{
			number = firstNumber+ secondNumber;

			firstNumber= secondNumber;
			secondNumber = number;

			System.out.print(" "+number);
		}

	}

}
