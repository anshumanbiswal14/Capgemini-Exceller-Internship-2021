package com.capg.emsapp.beans;

public class Employee implements Comparable<Employee> {
	
	private String empName;
	private int id;
	private int Salary;
	private String projectName;
	private Project project;
	
	public Employee() {
		super();
		
	}

	
	public Employee(String empName, int id, int salary, String projectName, Project project) {
		super();
		this.empName = empName;
		this.id = id;
		Salary = salary;
		this.projectName = projectName;
		this.project = project;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSalary() {
		return Salary;
	}


	public void setSalary(int salary) {
		Salary = salary;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public Project getProject() {
		return project;
	}


	public void setProject(Project project) {
		this.project = project;
	}


	public int compareTo(Employee o) {
		
		return this.id - o.getId();
	}


	@Override
	public int hashCode() {
		
		int myHashCode = 0;
		myHashCode = empName.length()+id+projectName.length();
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		
		boolean isSame = false;
		if(obj instanceof Employee) {
			
			Employee e = (Employee) obj;
			
			boolean a = this.empName.equals(e.empName);
			boolean b = (this.id == e.id);
			boolean c = this.Salary == e.Salary;
			boolean d = this.projectName.equals(e.projectName);
			
			return a&&b&&c&&d;
			}
		
		return isSame;
	}


	@Override
	public String toString() {
		
		return "Employee [empName=" + empName + ", id=" + id + ", salary=" + Salary + ", projectName=" + projectName
				+ ", project=" + project + "]";
	}

}
	


