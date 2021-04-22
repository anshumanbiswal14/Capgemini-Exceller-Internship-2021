package com.cg.eis.pl;
import java.util.List;
import com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	public boolean insertEmployee(Employee e);
	public List<Employee> getAllEmployees();
	public List<Employee> getAllEmployeesbyInsurance(String insurance);
	public List<Employee> getEmployeeById(int id, String name);

}
