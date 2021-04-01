package day3p1;

public class MyBankApp {
	

		public static void main(String[] args) {
			
			System.out.println("<<<-------------------------------------->>>");
			Account Acc = new Account(0, "Anshuman Biswal", 0, null);
			
			Policy HDFC = new Policy(21, "HDFC Life", 800000, 3500, 50);
			
			Acc.addPolicy(HDFC);
			
			Acc.acc_Details();
			
			HDFC.showDetails();
			
			System.out.println("<<<-------------------------------->>>");
			Acc.getPolicyById(1);

		}

	}