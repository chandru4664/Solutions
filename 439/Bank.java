package com.htc.corejava.day1;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Bank {
	public static void main(String[] args) {
		/*
		 * Written by Prasanna Mate
		 * 25-Feb-2018.
		 * 
		 *  Bank has 3 accounts...
		 */
		BankAccount[] acc = new BankAccount[3];
		
		// The statements set the set values of the acc array.
		acc[0] = new BankAccount();    // Make zeroth element points to a valid BankAccount object
		acc[0].setAccNo("AC001");
		acc[0].setAccName("Prasanna");
		acc[0].setAccBal(1000);
		
		acc[1] = new BankAccount();
		acc[1].setAccNo("AC002");
		acc[1].setAccName("Ajay");
		acc[1].setAccBal(500);
		
		acc[2] = new BankAccount();
		acc[2].setAccNo("AC003");
		acc[2].setAccName("Bala");
		acc[2].setAccBal(340);
		
		// The following loop is for getting and printing the account details.
		for (int i = 0; i < acc.length; i++) {
			System.out.println(acc[i].getAccNo() + " " + acc[i].getAccName() + " " + acc[i].getAccBal());
		}
	}
}
