package com.cg.eis.pl;
import com.cg.eis.bean.Employee;
import java.util.Scanner;

public class Service extends Employee implements EmployeeService  {

	@Override
	public void getEmpDetails() {
		System.out.println("Enters into the get employee details");
		getEmpDetails();
		
	}

	@Override
	public void findInsScheme(double salary) {
		
		if(salary < 90_000 ) {
			System.out.println("Policy-1");
		}else if(salary >= 50_000 && salary < 85_000) {
			System.out.println("Policy-2");
		}else {
			System.out.println("Premium Policy");
		}
		
		
	}

	@Override
	public void displayDetails() {
		
		System.out.println("Employee Id: "+getId());
		System.out.println("Employee Name: "+getName());
		System.out.println("Employee Salary: "+getSalary());
		System.out.println("Employee Deignation: "+getDesignation());
		
		
	}

//ANSHUMAN BISWAL
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
