package com.cg.eis.service;
import com.cg.eis.bean.Employee;
import com.cg.eis.pl.Service;

import java.util.Scanner;
public class MainApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Service e1 = new Service();
		
		while(true) {
		System.out.println("Enter ID Number of Employee");
		int id = sc.nextInt();
		e1.setId(id);
		
		System.out.println("Enter First Name of Employee");
		String name = sc.next();
		e1.setName(name);
		
		System.out.println("Enter Salary of Employee");
		double salary = sc.nextDouble();
		e1.setSalary(salary);
		
		System.out.println("Enter Designation of Employee");
		String designation = sc.next();
		e1.setDesignation(designation);
		System.out.println("_____________________________________________________________");
		
		e1.displayDetails();
		System.out.println("Insurance Policy: ");
		e1.findInsScheme(salary);
		System.out.println("_____________________________________________________________");
		
		}
		
	}

}

//ANSHUMAN BISWAL