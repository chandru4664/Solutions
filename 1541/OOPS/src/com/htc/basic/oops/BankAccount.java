package com.htc.basic.oops;

public class BankAccount {

	private String accountNum;
	private String accountName;
	private long accountBalance;
	
	public BankAccount() {
		super();
		this.accountBalance=1000;
	}
	
	public BankAccount(String accountNum, String accountName) {
		this.accountNum = accountNum;
		this.accountName = accountName;
		this.accountBalance = 1000;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
