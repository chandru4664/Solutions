package com.htc.Hadoopjava.day1;

/*
 * Test literals for various primitive types
 */
public class DataTypeTest {
	
   public static void main(String[] args) {

	   //All local variables must be initialized in Java

      String name = "Narayana Tangudu"; 
      char gender = 'm';           
      boolean isMarried = true;    
      byte numChildren = 2;        
      short yearOfBirth = 1972;    
      int salary = 100000;          
      long netAsset = 8234567890L; 
      double weight = 88.88;       
      float gpa = 3.88f;           
   
      // println() can be used to print value of any type
      
      System.out.println("Name is " + name);
      System.out.println("Gender is " + gender);
      System.out.println("Is married is " + isMarried);
      System.out.println("Number of children is " + numChildren);
      System.out.println("Year of birth is " + yearOfBirth);
      System.out.println("Salary is " + salary);
      System.out.println("Net Asset is " + netAsset);
      System.out.println("Weight is " + weight);
      System.out.println("GPA is " + gpa);
   }
}
