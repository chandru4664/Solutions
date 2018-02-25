package com.htc.corejava.exercises;

public class DataTypeExpressions17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/************************************************************************************
		 What are the data types of the following expressions, assuming that i's type is int?
			i > 0
			i = 0
			i++
			(float)i
			i == 0
			"aString" + i
		 ***********************************************************************************/
		
		/* Answer : If i's type is int then, Data Type for Expression
		  i>0 will be int
		  i=0 will be int
		  i++ will be int
		 (float) i will be float
		 i == 0 is boolean as it is decision making operator and assuming earlier type cast step executed
		 "aString" + i will be String and it is concatenated with String
		 */
		int i=1;
		boolean flag=true;
		String s="a";
		
		if( i >0 ) {
		System.out.println("Value of i = " + i);
		}
		
		i=0;
		System.out.println("After assignment value of i = " + i);
		
		i++;
		System.out.println("After Post-fix operator value of i = " + i);
		
		float a = (float) i;
		System.out.println("After Post-fix operator, typecasting and then assigning to float variable, value of a = " + a);
		
		if(i==0) {
			System.out.println("Value of expreseeion i==0 is " + (i==0));
			flag = (i==0f);
			System.out.println("Value of flag = " + flag);
		}
		else {
			System.out.println("Value of expreseeion i==0 is " + (i==0));
			flag = (i==0f);
			System.out.println("After assignment to boolean variable flag, value of expreseeion i==0 is " + flag);
		}
			
		System.out.println("Before assignment value of String s = " + s);
		s = "aString" + i;
		System.out.println("After assignment s = \"aString\" + i, value of s = " + s);
			
	}

}
