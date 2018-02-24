package com.htc.core.java.day1;

public class JavaTest2 {

	public static void main(String[] args) {
		boolean option = false; 
		char character = '\u0000'; 
		int number = 0; 
		short shortNumber = 0;
		long longNumber = 0;
		float floatNumber = 0;
		double doubleNumber = 0;

		option = true;
		character = 'a';
		number = 10;
		shortNumber = 11;
		longNumber = 100000000000L;
		floatNumber = 1.5F;
		doubleNumber = 1.23456d;

		System.out.println("Boolean     :"+ option);
		System.out.println("Character   :"+ character);
		System.out.println("Int         :"+ number);
		System.out.println("ShortNumber :"+ shortNumber);
		System.out.println("LongNumber  :"+ longNumber);
		System.out.println("FloatNumber :"+ floatNumber);
		System.out.println("DoubleNumber:"+ doubleNumber);

	}

}
