package com.htc.basic.strings;

public class StringTest1 {

	public static void main(String[] args) {
		String s1 = new String("Java"); 
		String s2 = new String("Java"); 
		if( s1 == s2 )	{  
			System.out.println(" They Are Equal "); 
		} else { 
			System.out.println("They are Unequal "); 
		} 
		//Unequal as they are two different instances, no string pooling. 
		//See below for string pooling for these to be equal
		
		s1 = "Java";
		s2 = "Java";
		if(s1 == s2) {
			System.out.println(" They Are Equal ");
		}
		
		//will be equal as the equals method will compare the toString
		s1 = new String("Java");
		s2 = new String("Java"); 
		if( s1.equals(s2) ) { 
			System.out.println("They Are Equal"); 
		} else {                 
			System.out.println("They are Unequal"); 
		} 
	}

}
