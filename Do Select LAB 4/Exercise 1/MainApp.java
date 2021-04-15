package capglab4;
import java.util.Scanner;

public class MainApp {
	
	public static void main(String [] args) {
		
		Account a1 = new Account();
		Account a2 = new Account();
		
		a1.setName("Smith");
		a1.setAccNum(201834435665L);
		a1.setAge(21);
		a1.setBalance(2000);
		
		a2.setName("Kathy");
		a2.setAccNum(201586754321L);
		a2.setAge(19);
		a2.setBalance(3000);
		
		
		while(true) {
			
			System.out.println("-----------Welcome to Kotak Mahindra Bank-----------");
			System.out.println("1.Smith's Account Access");
			System.out.println("2.Kathy's Account Access");
			System.out.println("3.Smith's Deposit Cash ");
			System.out.println("4.Smith's Withdraw Cash");
			System.out.println("5.Kathy's Deposit Cash");
			System.out.println("6.Kathy's Withdraw Cash");
			System.out.println("7.EXIT APP");
			System.out.println("----------------------------------------------------------------");
			
			
			Scanner sc = new Scanner(System.in);
			int choise = sc.nextInt();
			
			switch(choise) {
			case 1:
				System.out.println("Account Holder Name : " + a1.getName() + "\n"+
									"Account Number : " + a1.getAccNum() + "\n" +
									"Age : " + a1.getAge() + "\n" +
									"Current Balance : " + a1.getBalance() + "\n");
				break;
				
			case 2:
				System.out.println("Account Holder Name : " + a2.getName() + "\n"+
									"Account Number : " + a2.getAccNum() + "\n" +
									"Age : " + a2.getAge() + "\n" +
									"Current Balance : " + a2.getBalance() + "\n");
				break;
				
		
			case 3:
				System.out.println("<< Smith's Account OPEN NOW >>");
				System.out.println("How much you want to Deposit ?");
				int depositamt = sc.nextInt();
				a1.deposit(depositamt);
				break;
				
			case 4:
				System.out.println("<< Smith's Account OPEN NOW >>");
				System.out.println("How much you want to Withdraw ?");
				int withdrawamt = sc.nextInt();
				a1.withdraw(withdrawamt);
				break;
				
			case 5:
				System.out.println("<< Kathy's Account OPEN NOW >>");
				System.out.println("How much you want to Deposit ?");
				int depositamt2 = sc.nextInt();
				a2.deposit(depositamt2);
				break;
				
			case 6:
				System.out.println("<< Kathy's Account OPEN NOW >>");
				System.out.println("How much you want to Withdraw ?");
				int withdrawamt2 = sc.nextInt();
				a2.withdraw(withdrawamt2);
				break;
			
			case 7:
				System.out.println("Thanks for using KOTAK Banking App");
				System.exit(0);
				

			}
			
	}
		}
	
	}//end


