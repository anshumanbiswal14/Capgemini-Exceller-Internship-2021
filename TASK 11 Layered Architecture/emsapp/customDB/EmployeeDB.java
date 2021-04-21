package com.capg.emsapp.customDB;

import java.util.ArrayList;
import java.util.List;
import com.capg.emsapp.beans.Employee;

public class EmployeeDB {
	
	public static List<Employee> empList = new ArrayList<Employee>();
		
	static {
		
		Employee e1 = new Employee("Mike",101,2000,"ICICI-Bank", null);
		Employee e2 = new Employee("Suresh",102,2000,"ICICI-Bank", null);
		Employee e3 = new Employee("Ramesh",102,3000,"HDFC-Bank", null);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		
	}
	
	public static boolean addEmployee(Employee e)
	
	{
		return empList.add(e);
		
	}

}
