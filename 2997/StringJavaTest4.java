package com.htc.core.java.string;

public class StringJavaTest4 {

	public static void main(String[] args) {

		String sentence = "welcome to java";
		String[] str = sentence.split(" ");

		for (int i =0 ;i< str.length; i++)
		{
			System.out.println("changed sequence:"+ 
					str[i].replaceAll(str[i].substring(0,1), str[i].substring(0,1).toUpperCase()));
		}}

} 
