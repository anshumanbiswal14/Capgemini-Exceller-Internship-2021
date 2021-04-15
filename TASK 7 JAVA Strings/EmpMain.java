package day9p2;

public class EmpMain {
public static void main(String[] args) {
		
		Employee e1 = new Employee("mike",101,2000,"ICICI-Bank");
		Employee e2 = new Employee("mike",101,2000,"ICICI-Bank");
		Employee e3 = new Employee("Ramesh",102,3000,"HDFC-Bank");
		Employee e4 = e1;
		
		boolean a = (e1 == e2);
		System.out.println(" a "+a);
		
		boolean b = (e1 == e3);
		System.out.println(" b "+b);
		
		boolean c = (e1 == e4);
		System.out.println(" c "+c);
		
		boolean d = (e1.equals(e2));
		System.out.println("d "+d); 
		
		
		
	}

}