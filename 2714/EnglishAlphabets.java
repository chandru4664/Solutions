package com.corejava.exercise;

/** 
 *  Program to print english Alphabets from A to Z using ASCII values
 *
 */
public class EnglishAlphabets {

	public static void main(String[] args) {
		
		System.out.println("Alphabets are as follows:");
		for (int i=65;i<=90;i++) {
			System.out.print(" "+ (char)(i));         //Print Alphabet values iterating through loop
		}

	}

}
