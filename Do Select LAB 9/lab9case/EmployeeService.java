package lab9case;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EmployeeService<R> {
	private static EmployeeRepository e;
	private static List<Employee> emp = e.getEmployees();
	private static List<Department> dept = e.getDepartments();;

	
   public static void main(String[] args) {
	EmployeeService obj = new EmployeeService();
	obj.sumOfSalary();
	obj.increaseSalary();
	obj.deptNameCount();
	obj.seniorMostEmployee();
	obj.listOfEmp();
	obj.listOfEmpStartOnFriday();
	
   }
   
   void sumOfSalary() {
	   Stream<Employee> stream = emp.stream();
	   double sum = stream.mapToDouble(i->i.getSalary()).sum();
	   System.out.println("Sum of salary of all the employees "+sum+"\n");
	   System.out.println("=================================\n");
   }
   
   //•	List employee name, salary and salary increased by 15%. 
   void increaseSalary() {
	   Stream<Employee> stream = emp.stream();
	   stream.forEach(i->System.out.println("Employee: "+i.getFirstName()+"\n Salary: "+i.getSalary()+"\n updated salary "+(i.getSalary()+i.getSalary()*0.15)+"\n"));
	   System.out.println("=================================\n");
   }
   
   //•	List out department names and count of employees in each department. 
   void deptNameCount() {
	   Stream<Employee> stream1 = emp.stream();
	   Map<Object, List<Employee>> map = stream1.collect(Collectors.groupingBy(i->i.getDepartment().getDepartmentName()));
	   map.forEach((k,v)->System.out.println("No of emp in "+ k+" is "+v.size()));
	   System.out.println("=================================\n");
   }
   
   //•	Find out the senior most employee of an organization. max(Comparator.naturalOrder()).get(); 
   void seniorMostEmployee() {
	   List<LocalDate> dates = new ArrayList<LocalDate>();
	  
	   for(Employee e: emp) {
		   dates.add(e.getHireDate());
	   }
	   LocalDate d = dates.stream().min(Comparator.naturalOrder()).get();
	   emp.stream().filter(i->i.getHireDate()== d).forEach(i->System.out.println("Senior most "+ i));
   }
   
  //•	List employee name, hire date and day of week on which employee has started. 
   void listOfEmp() {
	   Stream<Employee> stream1 = emp.stream();
	   stream1.forEach(i->System.out.println("-----------------------------\nEmp name: "+i.getFirstName()+"\nHire date: "+i.getHireDate()+"\nDay "+ i.getHireDate().getDayOfWeek()));
	   System.out.println("=================================\n");
   }
   
   //•	List employee name, hire date and day of week for employee started on Friday.
   void listOfEmpStartOnFriday() {
	   Stream<Employee> stream1 = emp.stream();
	   Map<Object, List<Employee>> map = stream1.collect(Collectors.groupingBy(i->i.getHireDate().getDayOfWeek()));
	   map.forEach((k,v)->{
		   String p = k+"";
		   if(p.equals("FRIDAY")) {
			   System.out.println(v);
		   }
	   });
	   
	   
	   System.out.println("=================================\n");
   }
   
   
   
   
   
}























