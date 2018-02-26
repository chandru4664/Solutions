package com.htc.javatraining.exercises;

public class printAlphabets {
	
	public static void main(String[] args) {
	
		int lowerASCII = 97;			//starting ascii for lower case alphabets
		int capsASCII = 65;				//starting ascii for upper case alphabets
		
		//print lower case alphabets
		for(int i = lowerASCII; i <= 122; i++) {
			System.out.print((char)i + " ");
		}
		
		//print upper case alphabets
		System.out.println("");
		for(int i = capsASCII; i <= 90; i++) {
			System.out.print((char)i + " ");
		}
	}

}
