package hr;

import java.util.Scanner;

public class Employee {
	
	private int empId;
	private String empName;
	private String projectName;
	private int exp;
	private int salary;
	
	/*
	 *   trigger
	 *   if (exp is less than 3) :- salary should not be greater than 3000
	 *   
	 *   Salary > 20000 :- Error
	 * 
	 * */
	
	public int checkSalary() {
		if(exp < 3 && salary > 3000) {
			System.out.println("With experience lesser than 3, your salary cannot be greater than 3000! Please enter an appropriate salary:");
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public Employee() {
		empId = -1;
		empName = " No Name Set";
		exp = 0;
		salary = -1;
		projectName = " No Project Allocated";
	}
	
	public Employee(int id)
	{
		empId = id;
	}
	
	
	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getProjectName() {
		return projectName;
	}



	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}



	/* Business Method / operation */
	public void workingOnProject()
	{
		// 1000 lines of code ...
		System.out.println
		(empName +" working on " + projectName + " with salary " + salary);
		
	}
	
}