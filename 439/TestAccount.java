package com.htc.corejava.day1;

public class TestAccount {
// Written by Prasanna Mate
// 23-Feb-2018.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount a1 = new BankAccount();
		a1.setAcc("AC001", "Prasanna Mate");
		System.out.println(a1.getAccNo()
				+ " " + a1.getAccName()
				+ " " + a1.getAccBal());
	}
}
