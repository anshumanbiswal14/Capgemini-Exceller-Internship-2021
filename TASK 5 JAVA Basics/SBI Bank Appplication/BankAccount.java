package com.bankdemoapp.capg;

public class BankAccount {
	
	private String accountholderName;
	private int balance;
	private boolean status;
	
	public String getAccountholderName() {
		return accountholderName;
	}
	public void setAccountholderName(String accountholderName) {
		this.accountholderName = accountholderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
		if (balance>10000) {
			status = true;
		}
		else {
			status = false;
		}
	}
	public boolean isStatus() {
		if (status == true) {
			System.out.println("ACTIVE");
		}
		else{
			System.out.println("INACTIVE");
		}
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	public int doDeposit(int amt) {
		balance = balance+amt;
		System.out.println("Successfully deposited");
		if(balance<10000) {
			status = false;	
		}
		else {
		status = true;
	}
		return balance;  // new balance
	}
	
	
	public int dowithDrawal(int withdrawamt) {
		
		if(status == true && ((balance -withdrawamt) > 9999)) {
			balance = balance - withdrawamt;
			System.out.println("Successful withdraw!");
		} else {
			System.out.println("Cannot withdraw min.bal has to be 10K2");
		}
		if(balance < 10000) {
			status = false;
		} else {
			status = true;
		}
		return balance; // new balance
		
	}
}
