package com.htc.coreexercise.beginers;

public class EvenNumbers {

	public static void main(String[] args) {//print even numbers from 0 to 100
		// TODO Auto-generated method stub
		
		System.out.println("Printing Even Numbers From 0 to 100");
		System.out.println("===================================");
		for(int i=0;i<=100;i=i+2)
		{
			if (i!=100) {
				System.out.print(i + ",");
			}
			else {
				System.out.print(i);
			}
		}

	}
}