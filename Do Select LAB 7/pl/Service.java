package com.cg.eis.pl;
import java.util.List;

import com.cg.eis.bean.Employee;

import java.util.ArrayList;

public class Service implements EmployeeService {
	
	List<Employee> empList = new ArrayList<Employee>();

	public boolean insertEmployee(Employee e) {
		
		if(e.getSalary() > 5000 && e.getSalary() < 20000 && e.getDesignation().equals("System Associate")) {
			e.setInsuranceScheme("SCHEME C");
		}
		
		else if(e.getSalary() >= 20000 && e.getSalary() < 40000 && e.getDesignation().equals("Programmer")) {
			e.setInsuranceScheme("SCHEME B");
		}
		
		else if(e.getSalary() >= 40000 && e.getDesignation().equals("Manager")) {
			e.setInsuranceScheme("SCHEME A");
		}
		
		else if(e.getSalary() < 5000 && e.getDesignation().equals("Clerk")) {
			e.setInsuranceScheme("NO SCHEME");
		}
		
		boolean b = empList.add(e);
		return b;
		
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empList;
	}

	public List<Employee> getAllEmployeesbyInsurance(String insurance) {
		// TODO Auto-generated method stub
		
		List<Employee> emp = new ArrayList<Employee>();
		for(Employee e : empList) {
			if(e.getInsuranceScheme().equals(insurance)) {
				 emp.add(e);
			}
		}
		
		return emp;
	}

	public List<Employee> getEmployeeById(int id, String name) {
		// TODO Auto-generated method stub
		
		for(Employee e : empList) {
			if(e.getId() == id && e.getName().equals(name)) {
				empList.remove(e);
			}
		}
		
		
		return empList;
	}
	

}
