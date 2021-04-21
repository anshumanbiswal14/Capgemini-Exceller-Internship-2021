package com.capg.emsapp.dao;

import java.util.List;

import com.capg.emsapp.beans.Employee;

public interface IEmployeeDAO {

	public boolean insertEmployee(Employee e);
	public List<Employee> getAllEmployees();
	public List<Employee> getAllEmployeesBySalary(int range1,int range2);
	public Employee getEmployeeById(int id);
	
	
}