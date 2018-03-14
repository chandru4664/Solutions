package com.htc.core.java.string;

public class StringJavaTest7 {

	public static void main(String[] args) {
		String str="Hai|you|are|how";
		
		String[] splitStr = str.split("\\|");
		
		for (int i =0 ;i< splitStr.length;i++)
			
		{
			System.out.print(splitStr[i]);
		}


	}
}