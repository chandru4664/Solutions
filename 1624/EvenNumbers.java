package com.htc.corejava.exercises;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=100;
		
		System.out.println("Print all even numbers from 0 to 100");
		
		for(int j=0;j<i+1;j++) {
			if(j % 2 == 0 && j<i) {
				System.out.print(j + ",");
		}
			else if(j % 2 == 0 && j == i) {
				System.out.println(j);
			}
		
	}

}

}