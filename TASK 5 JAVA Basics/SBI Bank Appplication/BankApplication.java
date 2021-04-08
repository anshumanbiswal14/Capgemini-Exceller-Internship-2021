package com.bankdemoapp.capg;
import java.util.Scanner;
public class MainbankApp {
	
	public static void main(String[] args) {
		
		BankAccount c1 = new BankAccount();
		
		c1.setAccountholderName("Anshuman Biswal");
		c1.setBalance(15000);
		
				
		while(true) {
		
		System.out.println("-----------Welcome to State Bank of India-----------");
		System.out.println("1.Check Current Balance");
		System.out.println("2.Deposit Cash");
		System.out.println("3.Withdraw Cash");
		System.out.println("4.Status of Account");
		System.out.println("5.EXIT APP");
		System.out.println("----------------------------------------------------------------");
		
		

		
		Scanner sc = new Scanner(System.in);
		int choise = sc.nextInt();
		
		
		switch(choise) {
		case 1:
			System.out.println(" Holder Name" + "\n" +c1.getAccountholderName());
			System.out.println(" Current Balance" + "\n" +c1.getBalance());
			break;
			
		case 2:
			System.out.println("How much you want to deposit?");
			int depositamt = sc.nextInt();
			c1.doDeposit(depositamt);
			break;
			
		case 3:
			System.out.println("How much you want to withdraw");
			int withdrawamt = sc.nextInt();
			c1.dowithDrawal(withdrawamt);
			break;
			
		case 4:
			System.out.println("Account Status is :" + "\n" +c1.isStatus());
			break;
	
		case 5:
			System.out.println("Thanks for using SBI Banking App");
			System.exit(0);
		}
		
	}
	
		
		
}

}
