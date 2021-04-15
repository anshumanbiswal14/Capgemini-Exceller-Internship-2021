package capglab4;

class CurrentAccount extends Account{
	
	private double overdraftLimit;


	public CurrentAccount() {
		super();
		
	}
	
	public CurrentAccount(long accNum, double balance) {
		super(accNum, balance);
		
	}

	@Override
	public void withdraw(double withdrawCash) {
		
		super.withdraw(withdrawCash);
		
		if((super.getBalance() + withdrawCash) > overdraftLimit) {
			System.out.println("Overdraft Limit Exceeded");
		}
		else {
			System.out.println("Overdraft Limit has not Exceeded");
			
		}
	}

	public double isOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	
}
