package com.htc.coreexercise.beginers;

public class EnglishAlphabets {

	public static void main(String[] args) {// English alphabets from A to Z using 
	int ascii = 65; // this is the ASCII value of upper case A (97 for lower case a)
		
	while (ascii<90)
	{
		System.out.print((char)ascii+ ",");
		ascii++;
	}
		System.out.print((char)(ascii)); // to print the last char Z without the "," in the end
	}

}
