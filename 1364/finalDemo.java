package com.htc.javabasics;

public class finalDemo {
	   public static void main(String[] args){
		   final int SIZE=10;                   
		   for(int i=0;i<SIZE;i++){                           
			   System.out.println(i);                    
			   }                    
		   //SIZE=20;     This code needs to be removed as SIZE is constant and can not be changed , once assigned.               
		   for(int j=SIZE;j>0;j--){                          
			   System.out.println(j);                    
			   }              
		   }          
	   }
	
	

