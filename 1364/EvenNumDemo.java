package com.htc.javabasics;

public class EvenNumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int even = 0;

for (int i=0;i<=100;i++) {
	
	even = i % 2;
	if (even == 0) {
       System.out.println(i);
	}
}
	}

}
