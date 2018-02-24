package com.htc.core.java.day1;

public class JavaTest3 {

	public static void main(String[] args) {
		System.out.println("Even Numbers from 0 to 100:");

		for(int i=0;i<=100;i++)
		{
			int j = i % 2; 

			if (j==0)
			{
				System.out.println(+i);
			}
		}
	}

}
