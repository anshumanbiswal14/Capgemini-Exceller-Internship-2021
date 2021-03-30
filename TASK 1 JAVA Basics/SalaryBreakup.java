package p1;

import java.util.Scanner;

public class SalaryBreakup {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter your Base/Basic Annual Salary");
	float a = sc.nextInt();
	
	float HRA = (float) (0.4 * a);
	float b = HRA+a;
	float DA = (float) (0.6 * b);
	
	if (a < 200000) {
		float tax = 0;
	}
	if (a > 200000 && a <= 600000) {
		float tax = (float) 0.1;
	}
	if (a > 600000) {
		float tax = (float) 0.2;
	}
	
	float tax = 0;
	float take_home_sal = (float) (a+HRA+DA+tax);
	System.out.println("Your take home Salary is ==>" + take_home_sal  );
	
	}
}

