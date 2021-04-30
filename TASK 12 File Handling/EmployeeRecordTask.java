package day16p2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class EmployeeRecordTask {
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\Anshuman Biswal\\Documents\\EmployeeRecord.txt");
		EmployeeRecordTask obj = new EmployeeRecordTask();
		List<Employee> emp = new ArrayList<Employee>();
		try {
			obj.doReadFromFile(f,emp);
		}catch (Exception e) {
			
		}
		obj.createMap(emp);
	}
	
	public void doReadFromFile(File f,List<Employee> emp)throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line = "";
		
		while((line = br.readLine())!=null) {
			String arr[] = line.split(",");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[3]);
			Employee e = new Employee(a,arr[1],arr[2],b);
			emp.add(e);
		}
		
	}
	public void createMap(List<Employee> list) {
		Map<String,List<Employee>> map = new HashMap<>();
		Iterator<Employee> itr = list.iterator();
		List<Employee> x1 = new ArrayList<Employee>();
		List<Employee> x2 = new ArrayList<Employee>();
		List<Employee> x3 = new ArrayList<Employee>();
		List<Employee> x4 = new ArrayList<Employee>();
		while(itr.hasNext()) {
			Employee e = itr.next();
			if(e.getDept().equals("ICICI-Bank")) {
				x1.add(e);
			}else if (e.getDept().equals("Dell")) {
				x2.add(e);
			}else if (e.getDept().equals("LIC")) {
				x3.add(e);
			}else if (e.getDept().equals("HP")) {
				x4.add(e);
			}
		}
		map.put("ICICI-Bank",x1);
		map.put("Dell",x2);
		map.put("LIC",x3);
		map.put("HP",x4);
		printMap(map);
	}
   public void printMap(Map<String, List<Employee>> map) {
		
		Iterator<String> itr = map.keySet().iterator();
		
		while(itr.hasNext())
		{
			String keyName = itr.next();
			List<Employee> list = map.get(keyName);
			
			System.out.println("============="+" Device Information :- "+keyName+"=============");
			System.out.println();
			
			for (Employee e : list) {
				System.out.println(e);
			}
			System.out.println();
		}
	}
}