package com.htc.javabasics;

public class seriesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nextNum = 1;
		int curNum = 1;
		 for(int i=1; i<10; i++) {
			if(curNum % 2 == 0) {
				System.out.println(-nextNum + " ");
			}
			else {
				System.out.println(+nextNum + " ");
			}
			 
			nextNum += 2;
			curNum++;
			 
			 
		 }
		 
		 
		
	}

}
