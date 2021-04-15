package capglab4;

public class Account extends Person {
	
	private long accNum;
	private double balance;
	
	
	
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account() {
		super();
		
	}

	public Account(long accNum, double balance) {
		super();
		this.accNum = accNum;
		this.balance = balance;
	}

public void deposit(double depositCash) {
	
	balance = balance + depositCash;
	System.out.println("Cash Deposit Successful!");
	
}


public void withdraw(double withdrawCash) {
	balance = balance - withdrawCash;
	System.out.println("Cash Withdrawal Successful!");
	
}

public void getBalance(double balance) {
	
	System.out.println("Current Balance : " + balance);
	
}

}
