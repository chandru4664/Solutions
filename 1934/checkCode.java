package com.htc.javatraining.exercises;

public class checkCode {
	
	public static void main(String[] args) {
		
		int SIZE = 10;
		for (int i = 0; i < SIZE; i++) {
			System.out.println(i);
		}
		
		SIZE = 20;							//final variables cannot be re-assigned. removed final in declaration
		for(int j = SIZE; j > 0; j--) {
			System.out.println(j);
		}
		
	}

}
