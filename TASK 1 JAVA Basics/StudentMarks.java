package p1;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks in English");
		int a = sc.nextInt();
		
		System.out.println("Enter marks in Java");
		int b = sc.nextInt();
		
		System.out.println("Enter marks in Database Basics");
		int c  = sc.nextInt();
		
		System.out.println("Enter marks in Springtools ");
		int d = sc.nextInt();
		
		int sum = a+b+c+d;
		float avg = a+b+c+d/4;
		
		System.out.println("Total Marks => " + sum);
		System.out.println("Average Marks => " + avg);
		
		
		
	}

}
