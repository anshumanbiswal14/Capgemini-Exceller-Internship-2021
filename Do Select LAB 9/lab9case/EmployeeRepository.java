package lab9case;


import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

	private static final List<Employee> employees;
	private static final List<Department> departments;
	
	static {
		departments = new ArrayList<Department>();
		//populate departments
		departments.add(new Department(10,"Administration",100));
		departments.add(new Department(20,"Production",201));
		departments.add(new Department(30,"Sales",124));
		departments.add(new Department(40,"Finance",205));
		departments.add(new Department(50,"Customer Support",100));
		//populate employees 
		employees= new ArrayList<Employee>();
		employees.add(new Employee( 100, "Steven", "King", 
				"SKING", "515.123.4567", LocalDate.of(1997,Month.JUNE,17),
				"President", 24000,null, departments.get(0)));
		employees.add(new Employee( 101, "Neena", "Kochhar", 
				"NKOCHHAR", "515.123.4568", LocalDate.of(1999,Month.SEPTEMBER,21),
				"Vice President", 17000,100, departments.get(0)));
		employees.add(new Employee( 102, "Lex", "De Haan", 
				"LDEHAAN", "515.123.4569", LocalDate.of(2003,Month.JUNE,13),
				"Vice President", 17000,100, departments.get(0)));
		employees.add(new Employee( 201, "Michael", "Hartstein", 
				"MHARTSTE", "515.123.5555", LocalDate.of(1996,Month.FEBRUARY,17),
				"Manager", 13000,100, departments.get(1)));
		employees.add(new Employee( 202, "Pat", "Fay", 
				"PFAY", "603.123.6666", LocalDate.of(2007,Month.AUGUST,17),
				"Deputy Manager", 6000,201, departments.get(1)));
		employees.add(new Employee( 124, "Kevin", "Mourgos", 
				"KMOURGOS", "650.123.5234", LocalDate.of(2009,Month.NOVEMBER,16),
				"Manager", 5800,100, departments.get(2)));
		employees.add(new Employee( 141, "Trenna", "Rajs", 
				"TRAJS", "650.121.8009", LocalDate.of(1995,Month.OCTOBER,17),
				"Clerk", 3500,124, departments.get(2)));
		employees.add(new Employee( 205, "Shelley", "Higgins", 
				"SHIGGINS", "515.123.8080", LocalDate.of(2004,Month.JUNE,07),
				"Manager", 12000,101, departments.get(3)));
		employees.add(new Employee( 206, "William", "Gietz", 
				"WGIETZ", "515.123.8181", LocalDate.of(2004,Month.JUNE,07),
				"Accountant", 8300,205, departments.get(3)));
		employees.add(new Employee( 199, "Douglas", "Grant", 
				"DGRANT", "650.507.9844", LocalDate.of(2000,Month.JANUARY,13),
				"Clerk", 2600,205, departments.get(3)));
		employees.add(new Employee( 200, "Jennifer", "Whalen", 
				"JWHALEN", "515.123.4444", LocalDate.of(2007,Month.SEPTEMBER,17),
				"Admin Assistant", 4400,102, departments.get(3)));
		employees.add(new Employee( 198, "Donald", "OConnell", 
				"DOCONNEL", "650.507.9833", LocalDate.of(2009,Month.JUNE,21),
				"Clerk", 2600,null, departments.get(0)));
	}
	
	public static List<Employee> getEmployees() {
		return employees;
	}
	public static List<Department> getDepartments() {
		return departments;
	}
}
