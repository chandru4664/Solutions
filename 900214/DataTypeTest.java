package com.htc.corejava.day1;

/*
 * Declare variables of all Java data types, assign them  literal values and print their values on the screen
 */
public class DataTypeTest {
	
   public static void main(String[] args) {

	   //All local variables must be initialized in Java

      String name = "Mayank";         
      boolean isMarried = true;    
      byte numChildren = 127;     
      char gender = 'm';
      short numberS = 32767;    
      int Amount = 880000000;          
      long netAsset = 555555L; 
      double weight = 22.22;       
      float gpa = 22.22f;           
   
      // println() can be used to print value of any type
      
      System.out.println("Name is " + name);
      System.out.println("Gender is " + gender);
      System.out.println("Is married is " + isMarried);
      System.out.println("Number of children is " + numChildren);
      System.out.println("numberS is " + numberS);
      System.out.println("Amount is " + Amount);
      System.out.println("Net Asset is " + netAsset);
      System.out.println("Weight is " + weight);
      System.out.println("GPA is " + gpa);
   }
}