package com.capg.app.beans;

public class Instructor implements Comparable<Instructor>{
	
	private int instructorCode;
	private String name;
	private int salary;
	private int jobStartYear;
	private String email;
	private String trainerLocation;
	
	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Instructor(int instructorCode, String name, int salary, int jobStartYear, String email,
			String trainerLocation) {
		super();
		this.instructorCode = instructorCode;
		this.name = name;
		this.salary = salary;
		this.jobStartYear = jobStartYear;
		this.email = email;
		this.trainerLocation = trainerLocation;
	}
	public int getInstructorCode() {
		return instructorCode;
	}
	public void setInstructorCode(int instructorCode) {
		this.instructorCode = instructorCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getJobStartYear() {
		return jobStartYear;
	}
	public void setJobStartYear(int jobStartYear) {
		this.jobStartYear = jobStartYear;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTrainerLocation() {
		return trainerLocation;
	}
	public void setTrainerLocation(String trainerLocation) {
		this.trainerLocation = trainerLocation;
	}
	
	@Override
	public int compareTo(Instructor o) {
		
		return this.instructorCode - o.getInstructorCode();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + instructorCode;
		result = prime * result + jobStartYear;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		result = prime * result + ((trainerLocation == null) ? 0 : trainerLocation.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instructor other = (Instructor) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (instructorCode != other.instructorCode)
			return false;
		if (jobStartYear != other.jobStartYear)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		if (trainerLocation == null) {
			if (other.trainerLocation != null)
				return false;
		} else if (!trainerLocation.equals(other.trainerLocation))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Instructor [instructorCode=" + instructorCode + ", name=" + name + ", salary=" + salary
				+ ", jobStartYear=" + jobStartYear + ", email=" + email + ", trainerLocation=" + trainerLocation + "]";
	}

}