package com.htc.coreexercise.beginers;

public class CodeValidation {

	public static void main(String[] args) {
		testCasting();
	}
	private static void testCasting() {
		byte a=10;
		byte b=20;
		byte c= a*b; //the expected resultant is more than 128 byte(range -127 to 128)  so we will need to use a different data type -->(int)
		System.out.println(c);
	}
	private static void testCheckCode(){
		final int SIZE=10;
		for (int i=0;i<SIZE;i++) {
			
			System.out.println(i);
			
		}
		SIZE=20; // cannot change value of data type that has the final non-access modifier
		for(int j=SIZE;j>0;j--) {
			System.out.println(j);
			
		}
	}
	

}
