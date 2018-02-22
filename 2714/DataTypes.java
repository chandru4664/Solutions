package com.corejava.exercise;

/* Java program to declare various data types and print their values */

public class DataTypes {

	public static void main(String[] args) {
		
		//All local variables must be initialized
		//The data types are initialized with corresponding default values 
		byte    byteVar    = 0;
		short   shortVar   = 0;
		int     intVar     = 0;
		long    longVar    = 0L;            // suffix 'L' for Long
		float   floatVar   = 0.0f;          // suffix 'f' for float
		double  doubleVar  = 0.0d;          // suffix 'd' for double
		char    charVar    = '\u0000';      // Unicode null character, value in single quote
		String  stringVar  = null;          // String value should be double-quoted
		boolean booleanVar = false;         // false or true
		
        System.out.println("Default value for byte    is " + byteVar);
        System.out.println("Default value for short   is " + shortVar);
        System.out.println("Default value for int     is " + intVar);
        System.out.println("Default value for long    is " + longVar);
        System.out.println("Default value for float   is " + floatVar);
        System.out.println("Default value for double  is " + doubleVar);
        System.out.println("Default value for char    is " + charVar);
        System.out.println("Default value for String  is " + stringVar);
        System.out.println("Default value for boolean is " + booleanVar);
     
        // Assigning values for a student
        
        stringVar = "Aakash";
        charVar   = 'M';
        byteVar = 5 ;
        shortVar = 12 ;
        intVar = 240;
        longVar = 1120;
        doubleVar = 93.34d;
        floatVar = 8.50f;
        booleanVar = true;
        
        System.out.println("\n******Student details*******\n");       
        
        System.out.println("Student Name :    " + stringVar);
        System.out.println("Student Gender:   " + charVar);
        System.out.println("Student Class:    " + byteVar);
        System.out.println("No of subjects:   " + shortVar);
        System.out.println("Student #of days: " + intVar);
        System.out.println("Student Total:    " + longVar);
        System.out.println("Student GPA :     " + floatVar);
        System.out.println("Student Marks%:   " + doubleVar);
        System.out.println("Student Passed?:  " + booleanVar);
	}

}
