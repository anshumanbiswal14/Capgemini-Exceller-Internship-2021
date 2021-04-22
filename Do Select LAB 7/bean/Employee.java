package com.cg.eis.bean;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	
	public Employee() {
		super();
	
	}

	
	public Employee(int id, String name, double salary, String designation, String insuranceScheme) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getInsuranceScheme() {
		return insuranceScheme;
	}


	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		boolean isSame = false;
		// code to compare e1 and e2
		
		if(obj instanceof Employee)
		{
		  Employee e = (Employee)obj;	
		  
		 
		  boolean a = (this.id == e.id);
		  boolean b = (this.name.equals(e.name));
		  boolean c = this.salary == e.salary;
		  boolean d = this.designation.equals(e.designation);
		  boolean n = this.insuranceScheme.equals(e.insuranceScheme);
		 
		  return a&&b&&c&&d&&n;
			
		}
		
		return isSame;
	}
	


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
		
	
	
		}	
	}

