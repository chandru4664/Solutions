package com.htc.corejava.exercises;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int start=1;
		int prev=1;
		int next=0;
		
		System.out.println("====================================================================");
		System.out.println("The first " + i + " positive numbers in Fibonacci Series starting from 1 is below");
				
		for(int counter=1;counter <= i;counter++) {
			if(counter ==1 ){
				System.out.print(start + ",");
			}
			else if(counter == 2){
				System.out.print( prev + ",");
			}
			else if(counter == i) {
				next = start + prev; 
				System.out.print(next + "\n");
				prev = start;
				start = next;
			}
			else { 
			next = start + prev; 
			System.out.print(next + ",");
			prev = start;
			start = next;
			}
		}
		System.out.println("====================================================================");

	}

}
