package com.htc.core.java.day1;

public class JavaTest18 {

	public static void main(String[] args) {

		int i =10;
		int result = i--%5;
		System.out.println(result);
		i--;
		if (i%5>0)
		{
			System.out.println(true);
		}
	}

}
