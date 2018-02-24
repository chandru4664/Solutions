package com.htc.basic.strings;

public class StringTest2 {

	public static void main(String[] args) {
		int a = 10;   int b = 100;   
		System.out.println("The added value is " + a + b);   
		System.out.println(a+b+" is the added value ");   
		System.out.println(a-b+" is the Subtracted value is ");  
		System.out.println("The Subtracted value is " + (a - b));   
		System.out.println("The Multiplied value is "+ a*b);   
		System.out.println("The Divided value is " + a /b);        
	}
	/*The added value is 10100 -- a + b acts as string concat
	110 is the added value -- a+b will execute first since string concat after that
	-90 is the Subtracted value is a-b will execute first since string concat after that
	The Subtracted value is -90 (compilation error - need to add (a-b) in paran to avoid string concat with -
	The Multiplied value is 1000 multiply and divide will happen first before concat
	The Divided value is 0 */

}
