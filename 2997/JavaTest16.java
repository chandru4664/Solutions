package com.htc.core.java.day1;

import java.util.Scanner;

public class JavaTest16 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a IPAddress: ");
		String ipAddress = reader.next();
		reader.close(); 

		int count = 0;
		System.out.println("ipAddress :" + ipAddress );

		if (ipAddress.length()>=7 && ipAddress.length() <=15 
				&&!(ipAddress.startsWith(".") && ipAddress.endsWith(".")))
		{
			for (int i =0;i<ipAddress.length();i++)
			{
				char character = ipAddress.charAt(i);
				//				

				if (character == '.')
				{
					count++;
				}

			}
			if (count>3)
			{
				System.out.println("IPAddress is Invalid with more that 3 dots");

			}

			for (int i=0,j=1; i<ipAddress.length();i++,j++)
			{
				if (ipAddress.length() == j)
				{
					break;
				}
				char firstCharacter= ipAddress.charAt(i);
				char nextCharacter = ipAddress.charAt(j);
				if (firstCharacter == '.' && nextCharacter == '.')
				{
					System.out.println("IPAddress is Invalid with 2 consecutive dots");
					break;
				}
			}

		}


	}

}











