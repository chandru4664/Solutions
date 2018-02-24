package com.htc.basic.oops;

public class Cheque {

	private String chequeNumber;
	private String accountNumber;
	private String bankName;
	private long amount;
	
	//Cheque cannot be created without basic details
	public Cheque(String chequeNumber, String bankName, long amount, String accountNum) {
		this.chequeNumber = chequeNumber;
		this.bankName = bankName;
		this.amount = amount;
		this.accountNumber = accountNum;
	}
	public String getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
}
