package com.capg.eis.pl;

import com.capg.eis.bean.Employee;
import java.util.Collection;
import java.util.List;

public interface IEmployeeService {

	public boolean insertEmployee(Employee e);
	public Collection<Employee> getAllEmployees();
	public Collection<Employee> getAllEmployeesBySalary(int range1,int range2);
	public Employee getEmployeeById(int id);
	public List<Employee> deleteEmployee(int id);
	public Collection<Employee> getAllEmployeeInsuranceScheme();
}