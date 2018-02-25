package com.htc.corejava.exercises;

public class CheckCode {
	public static void main(String[] args){
		final int SIZE=10;
		for(int i=0;i<SIZE;i++){
		System.out.println(i);
		}
		// Remove new value assignment to variable SIZE as the SIZE variable access identifier is defined final
		//SIZE=20;
		
		for(int j=SIZE;j>0;j--){
		System.out.println(j);
		}
		}

}
