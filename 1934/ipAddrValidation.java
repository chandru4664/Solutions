package com.htc.javatraining.exercises;

import java.util.Scanner;

public class ipAddrValidation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an IP address: ");
		String ipAddr = scanner.next();
		
		if (ipAddr.length() < 7 || ipAddr.length() > 15) {
			System.out.println("Invalid length. The length should be minimum 7 and maximum 15 characters");
		} else {
			if (ipAddr.charAt(0) == '.' || ipAddr.charAt(ipAddr.length()-1) == '.') {
				System.out.println("IP address should not start and end witn a dot");
			} else {
				int dotCount = 0;
				for (int i = 0; i < ipAddr.length(); i++) {
					if (ipAddr.charAt(i) == '.') {
						dotCount++;
					}
				}
				if (dotCount != 3) {
					System.out.println("The IP address shoud have exactly three dots");
				} else {
					boolean isValid = true;
					for (int i = 0; i < ipAddr.length()-1; i++) {
						if (ipAddr.charAt(i) == '.' && ipAddr.charAt(i+1) == '.') {
							isValid = false;
						}
					}
					if(!isValid) {
						System.out.println("The dots should not be in consicutive positions");
					} else {
						boolean isValidIP = true;
						for (int i = 0; i < ipAddr.length(); i++) {
							if (ipAddr.charAt(i) != '.' && !Character.isDigit(ipAddr.charAt(i))) {
								isValidIP = false;
								break;
							}
						}
						if (!isValidIP) {
							System.out.println("IP address should not contain alphabets and special characters");
						} else {
							System.out.println("It is a valid IP address");
						}
					}
				}
			}
		}
		
		
		scanner.close();
	}
	
}
