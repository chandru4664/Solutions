package com.htc.corejava.exercises;

public class BankAccountDemo {

	public static void main(String[] args) {
		BankAccount BankAccount1 = new BankAccount("11111", "Test Account Name 1");
		BankAccount BankAccount2 = new BankAccount("22222", "Test Account Name 2", 50000);
		
		System.out.println("*************************************************************************************");
		System.out.println("BankAccount1 is set up with Constructor Overloading Java Feature");
		System.out.println("Data in BankAccount1 is below:");
		System.out.println("AccountNo: " + BankAccount1.getAccountNo());
		System.out.println("Account Name: " + BankAccount1.getAccountName());
		System.out.println("Account Balance: " + BankAccount1.getBalance());
		System.out.println("*************************************************************************************");
		System.out.println("BankAccount2 is set up with Natural Constructor of a class");
		System.out.println("Data in BankAccount2 is below:");
		System.out.println("AccountNo: " + BankAccount2.getAccountNo());
		System.out.println("Account Name: " + BankAccount2.getAccountName());
		System.out.println("Account Balance: " + BankAccount2.getBalance());
		System.out.println("*************************************************************************************");
		
	}

}
