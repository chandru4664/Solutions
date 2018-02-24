package com.htc.basic.oops;

public class AccountNotFoundException extends Exception{

	private static final long serialVersionUID = 2694491665499054208L;
	private final String ACCOUNT_NOT_FOUND_ERROR_STRING = "Account Not Found for Account Number : ";

	public String getMessage(String accountNum) {
		return ACCOUNT_NOT_FOUND_ERROR_STRING + accountNum;
	}

}
