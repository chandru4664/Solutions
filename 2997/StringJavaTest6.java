package com.htc.core.java.string;

public class StringJavaTest6 {

	public static void main(String[] args) {
		String s1= "I have to win, Keep this in heart. "
				+ "How I have to Win ,Keep this in brain. Then you will win";
		
		String[] str = s1.split(" ");
		
		int strLength = str.length;
		
		for (int i =0;i<strLength;i++)
		{
			if (i<8) 
			{
				System.out.print(str[i]);
			}
			else
			{
				System.out.print(str[i].toUpperCase());
			}
		}

	}

}
