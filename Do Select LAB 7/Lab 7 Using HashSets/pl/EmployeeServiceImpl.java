package com.capg.eis.pl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.capg.eis.bean.Employee;


public class EmployeeServiceImpl implements IEmployeeService {

	public static Map<Integer, Employee> map = new HashMap<Integer,Employee>();

	public boolean insertEmployee(Employee e) {

		map.put(e.getId(), e);

		if(e.getSalary()>5000 && e.getSalary()<20000) {
			e.setDesignation("System Associate");
			e.setInsuranceScheme("Scheme C");
		
		}else if(e.getSalary()>=20000 && e.getSalary()<40000) {
			e.setDesignation("Programmer");
			e.setInsuranceScheme("Scheme B");
		
		}else if(e.getSalary() >= 40000) {
			e.setDesignation("Manager");
			e.setInsuranceScheme("Scheme A");
		
		}else if(e.getSalary()<=5000) {
			e.setDesignation("Clerk");
			e.setInsuranceScheme("No Scheme");
		}

		return map.put(e.getId(), e) != null;
	}

	public Collection<Employee> getAllEmployees() {

		return map.values();  // select * from Employee
	}

	public Collection<Employee> getAllEmployeesBySalary(int range1,int range2) {

		Map<Integer, Employee> tempList = new HashMap<Integer,Employee>();
		tempList.clear();	

		for (Map.Entry<Integer,Employee> employee : map.entrySet()) {

			if(((Employee) employee).getSalary()>=range1 && ((Employee) employee).getSalary() <= range2)
			{
				tempList.put(((Employee) employee).getId(),(Employee) employee);
			}

		}

		return tempList.values();
	}

	public Employee getEmployeeById(int id) {


		for (Map.Entry<Integer,Employee> employee : map.entrySet()) {
			if(((Employee) employee).getId() == id)
			{
				return employee.getValue();
			}
		}
		System.out.println("No Employee found");
		return null;
	}

	public List<Employee> deleteEmployee(int id) {
		
		List<Employee> tempList = new ArrayList<Employee>();
		tempList.clear();

		for (Entry<Integer, Employee> employee : map.entrySet()) {

			if(employee.getKey() != id)
			{
				tempList.add(employee.getValue());
			}

		}
		map.clear();
		for(Employee employee: tempList) {
			map.put(((Employee) employee).getId(),(Employee) employee);
		}
		return tempList;

	}

	public Collection<Employee> getAllEmployeeInsuranceScheme() {
		return map.values();
	}

}