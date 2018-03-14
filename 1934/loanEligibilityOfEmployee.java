package com.htc.javatraining.exercises;

import java.util.Scanner;

public class loanEligibilityOfEmployee {
	
	public static void main(String[] args) {
		
		String maritalStatus;
		String empType;
		int yrsService;
		long loanAmt;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter person's marital status (M=Married, U=Unmarried): ");
		maritalStatus = scanner.next().toUpperCase();
		
		System.out.println("Enter person's job type (P=Permanent, T=Temporary): ");
		empType = scanner.next().toUpperCase();

		System.out.println("Enter person's job service: ");
		yrsService = scanner.nextInt();
		
		switch(maritalStatus) {
			case "M":
				switch(empType) {
					case "P":
						if(yrsService >= 30) {
							loanAmt = 600000;
						} else {
							loanAmt = 350000;
						}
						System.out.println("The eligible loan amount is: " + loanAmt);
						break;
					case "T":
						loanAmt = 10000;
						System.out.println("The eligible loan amount is: " + loanAmt);
						break;
					default:
						System.out.println("Invalid job type entered");
						break;
				}
				break;
			case "U":
				switch(empType) {
					case "P":
						if(yrsService >= 30) {
							loanAmt = 500000;
						} else {
							loanAmt = 250000;
						}
						System.out.println("The eligible loan amount is: " + loanAmt);	
						break;
					case "T":
						loanAmt = 10000;
						System.out.println("The eligible loan amount is: " + loanAmt);
						break;
					default:
						System.out.println("Invalid job type entered");
						break;
				}
				break;
			default:
				System.out.println("Invalid gender entered");
				break;
		}
		scanner.close();
	}
}
