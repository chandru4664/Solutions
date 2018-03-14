package com.htc.corejava.exercises;

public class BankAccount {

	private String accountNo;
	private String accountName;
	private double balance;
	
	public BankAccount(String accountNo, String accountName, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}

	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = 1000;
	}
	
	public BankAccount() {
		super();
		this.accountNo="";
		this.accountName="";
		this.balance=0;
	}
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
