package com.htc.coreexercise.beginers;

import java.text.DecimalFormat;

public class CheckLoan {

	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("#,###");
	//	(a) a married temporary job holder
		LoanEligibility le1= new LoanEligibility("Temporary", true);
		System.out.println("Loan amount for a married temporary job holder is : Rs. " + decimalFormat.format(le1.getLoanAmount()));
	//	(b) an unmarried temporary job holder
		LoanEligibility le2= new LoanEligibility("Temporary", false);
		System.out.println("Loan amount for an unmarried temporary job holder is : Rs. " + decimalFormat.format(le2.getLoanAmount()));		
	//	(c) a temporary job holder with 30 years of service
		LoanEligibility le3= new LoanEligibility("Temporary",30);
		System.out.println("Loan amount for a temporary job holder with 30 years of service is : Rs. " + decimalFormat.format(le3.getLoanAmount()));			
	//	(d) a married permanent job holder with 30 years of service
		LoanEligibility le4= new LoanEligibility("Permanent", true, 30);
		System.out.println("Loan amount for a married permanent job holder with 30 years of service is : Rs. " + decimalFormat.format(le4.getLoanAmount()));	
	//	(e) an unmarried permanent job holder with 30 years service
		LoanEligibility le5= new LoanEligibility("Permanent", false, 30);
		System.out.println("Loan amount for an unmarried permanent job holder with 30 years service is : Rs. " + decimalFormat.format(le5.getLoanAmount()));		
	//	(f) a married permanent job holder with 25 years service. 
		LoanEligibility le6= new LoanEligibility("Permanent", true, 25);
		System.out.println("Loan amount for a married permanent job holder with 25 years service is : Rs. " + decimalFormat.format(le6.getLoanAmount()));		
		
	}

}
