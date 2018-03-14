package com.htc.corejava.day1;
// Written by Prasanna Mate
// 23-Jan-2018
public class BankAccount {
	private String accNo;
	private String accName;
	private int accBal;
	
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public void setAccBal(int accBal) {
		this.accBal = accBal;
	}
	
	//Default constructor...
	public void setAcc() {
	}
	
	//Overloaded constructor...
	public void setAcc(String accNo, String accName) {
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = 1000;
	}
	
	public String getAccNo() {
		return accNo;
	}
	public String getAccName() {
		return accName;
	}
	public int getAccBal() {
		return accBal;
	}

} // BankAccount block complete.

