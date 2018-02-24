package com.htc.basic.oops;

public class Bank {

	private BankAccount[] accounts = new BankAccount[100];
	
	private static int lastAssignedAccountNumber = 0;
	
	public Bank() {
		initializeAccount();
	}
	
	private void incrementAccountNumber() {
		lastAssignedAccountNumber = lastAssignedAccountNumber + 1 ;
	}
	
	public BankAccount createNewAccount(String accountName) {
		BankAccount newAccount = new BankAccount();
		incrementAccountNumber();
		newAccount.setAccountNum(String.valueOf(lastAssignedAccountNumber));
		newAccount.setAccountName(accountName);
		return newAccount;
	}
	
	public BankAccount createNewAccount(String accountName, long accountBalance) {
		BankAccount newAccount = createNewAccount(accountName);
		newAccount.setAccountBalance(accountBalance);
		return newAccount;
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
	
	public boolean deposit(Cheque cheque) throws AccountNotFoundException{
		return deposit(cheque.getAccountNumber() , cheque.getAmount());
	}
	
	public boolean withdraw(Cheque cheque) throws AccountNotFoundException{
		return withdraw(cheque.getAccountNumber(), cheque.getAmount());
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
			lastAssignedAccountNumber = lastAssignedAccountNumber + 1;
			account.setAccountNum(String.valueOf(lastAssignedAccountNumber));
			account.setAccountName("Account num : " + account.getAccountBalance()  * i);
			//array index starts with zero
			accounts[lastAssignedAccountNumber-1] = account;
		}
	}
 }
