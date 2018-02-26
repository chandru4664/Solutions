package com.htc.coreexercise.beginers;
/*
 Implement the following logic to arrive at the loan eligibility for an employee:
(a) For an unmarried permanent job holder, if the service has been for 30 years or more,the loan amount is
Rs.500,000; otherwise the loan amount is Rs.250,000
(b) For a married permanent job holder, if the service has been for 30 years or more, the loan amount is Rs.600,000;
otherwise the loan amount is Rs.350,000
(c) For temporary job holder, the loan amount is Rs.100,000.
Check the loan eligibility with the following input conditions.
(a) a married temporary job holder
(b) an unmarried temporary job holder
(c) a temporary job holder with 30 years of service
(d) a married permanent job holder with 30 years of service
(e) an unmarried permanent job holder with 30 years service
(f) a married permanent job holder with 25 years service. 
 */
public class LoanEligibility {
private String jobNature; // Permanent or Temporary
private boolean isMarried;
private int yearsOfSerice;
private int loanAmount;

public LoanEligibility(String jobNature, boolean isMarried) {// constructor with 2 fields
		super();
		this.jobNature = jobNature;
		this.isMarried = isMarried;
	}

public LoanEligibility(String jobNature, int yearsOfSerice) {// constructor with 2 fields
	super();
	this.jobNature = jobNature;
	this.yearsOfSerice = yearsOfSerice;
}

public LoanEligibility(String jobNature, boolean isMarried, int yearsOfSerice){ // constructor with all 3 fields
	super();
	this.jobNature = jobNature;
	this.isMarried = isMarried;
	this.yearsOfSerice = yearsOfSerice;
	
}
public String getJobNature() {
	return jobNature;
}

public void setJobNature(String jobNature) {
	this.jobNature = jobNature;
}
public boolean isMarried() {
	return isMarried;
}
public void setMarried(boolean isMarried) {
	this.isMarried = isMarried;
}
public int getYearsOfSerice() {
	return yearsOfSerice;
}
public void setYearsOfSerice(int yearsOfSerice) {
	this.yearsOfSerice = yearsOfSerice;
}

private void setLoanAmount(int loanAmount) {
	this.loanAmount = loanAmount;
}
public int getLoanAmount() {
	//business logic to calculate loanAmount
	if (this.isMarried==false & this.jobNature=="Permanent")
	{
		if (yearsOfSerice>=30)
		{
			this.loanAmount=500000;
		}
		else
		{
			this.loanAmount=250000;
		}

	}
	else if (this.isMarried==true & this.jobNature=="Permanent") {
		if (yearsOfSerice>=30)
		{
			this.loanAmount=600000;
		}
		else
		{
			this.loanAmount=350000;
		}
	
	}
	else
	{
		this.loanAmount=100000;
	}
	return loanAmount;
}

}
