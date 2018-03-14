package com.htc.javabasics;

public class FibnoDemo {


	public static void main(String[] args) {

		int curNum = 0;
		int nextNum= 1;
	    int sumofTwo = 0;

		for (int i=1;i< 15;i++)

		{
			sumofTwo = curNum + nextNum;
			curNum = nextNum;
			nextNum = sumofTwo;
			System.out.print("--> "+ sumofTwo);
		}

	}
	}



