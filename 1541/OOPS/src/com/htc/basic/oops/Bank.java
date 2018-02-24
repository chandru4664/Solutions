package com.htc.basic.oops;

public class Bank {

	private BankAccount[] accounts = new BankAccount[100];
	
	public Bank() {
		initializeAccount();
	}
	
	public boolean isValidAccount(String accountNumber) {
		if(accountNumber == null) {
			return false; 
		}
		
		for(BankAccount account : accounts) {
			if(account.getAccountNum().equals(accountNumber)) {
				return true;
			}
		}
		return false;
	}
	
	public long printBalance(String accountNumber) throws AccountNotFoundException {
		if(isValidAccount(accountNumber)) {
			for(BankAccount account : accounts) {
				if(account.getAccountNum().equals(accountNumber)) {
					System.out.println("Balance for Account Number : " + account.getAccountBalance());
					return account.getAccountBalance();
				}
			}
		}else {
			throw new AccountNotFoundException();
		}
		return 0;
		
	}
	
	public boolean deposit(String accountNumber, long depositAmount) throws AccountNotFoundException{
		if(isValidAccount(accountNumber)) {
			for(BankAccount account : accounts) {
				if(account.getAccountNum().equals(accountNumber)) {
					System.out.println("Deposting to : " + account.getAccountBalance() + " the amount of " + depositAmount);
					long currentBalance = account.getAccountBalance();
					long newBalance = currentBalance + depositAmount;
					account.setAccountBalance(newBalance);
					System.out.println("New Balance for : " + account.getAccountBalance() + " after deposit is " + newBalance);
					return true;
				}
			}
		}else {
			throw new AccountNotFoundException();
		}
		return false;
	}
	
	public boolean withdraw(String accountNumber, long depositAmount) throws AccountNotFoundException{
		if(isValidAccount(accountNumber)) {
			for(BankAccount account : accounts) {
				if(account.getAccountNum().equals(accountNumber)) {
					System.out.println("Withdrawing from  : " + account.getAccountBalance() + " the amount of " + depositAmount);
					long currentBalance = account.getAccountBalance();
					long newBalance = currentBalance - depositAmount;
					account.setAccountBalance(newBalance);
					System.out.println("New Balance for : " + account.getAccountBalance() + " after withdrawal is " + newBalance);
					return true;
				}
			}
		}else {
			throw new AccountNotFoundException();
		}
		return false;
	}
	
	
	public boolean transferMoney(String fromAccount, String toAccount, long amount) throws AccountNotFoundException {
		if (deposit(toAccount, amount)) {
			// withdraw on successful deposit
			boolean isSuccess = withdraw(fromAccount, amount);
			if (!isSuccess) {
				// rollback the amount if there is withdraw failure
				withdraw(toAccount, amount);
				// return false to indicate transaction failed.
				return false;
			}
		}

		return false;
	}
	
	private void initializeAccount() {
		for(int i=1; i <= 5; i++) {
			BankAccount account = new BankAccount();
			account.setAccountNum(String.valueOf(i));
			account.setAccountName("Account num : " + account.getAccountBalance()  * i);
			accounts[i-1] = account;
		}
	}
 }
