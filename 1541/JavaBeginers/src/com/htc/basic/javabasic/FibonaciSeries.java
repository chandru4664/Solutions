package com.htc.basic.javabasic;

public class FibonaciSeries {
	
	 public static void main(String[] args) {
		 int fibNumber = Integer.parseInt(args[0]);
		 int finalValue=1;
		 for(int i=1; i <= fibNumber; i++) {
			 System.out.print(finalValue + "--->");
			 finalValue = finalValue * i;
			 if(i == (fibNumber)) {
				 System.out.print(finalValue ); 
			 }
		 }
		 System.out.println("\nFibonaci Value for " + args[0] +  " is : " + finalValue);
		 
		 
	}
}
