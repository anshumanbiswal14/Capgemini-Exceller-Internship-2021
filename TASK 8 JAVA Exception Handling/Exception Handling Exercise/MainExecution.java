package day10p2;

public class MainExecution {
	
	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeService();
		
		String codes[] = service.getEmployeeCodes();
		String ids[] = service.getDepartmentId();
		String cityCodes[] = service.getCityCodes();
		
		try {
		
			String cityCodes1[] = cityCodes;
			for(int i =0; i<codes.length;i++) {
				if(cityCodes1[i].equals("011")) {
					System.out.println(codes[i]+" ---> "+" Delhi");
				}
				else if(cityCodes1[i].equals("022")) {
				System.out.println(codes[i]+" ---> "+" Banglore");
				}
				else if(cityCodes1[i].equals("080")) {
					System.out.println(codes[i]+" ---> "+" Mumbai");
				}
				else if(cityCodes1[i].equals("020")) {
					System.out.println(codes[i]+" ---> "+" Pune");
				}
				else {
					throw new CityException(" For code "+cityCodes1[i]+" City does not exists !");
				}
				
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		/*for (String empid : codes) {
			System.out.println(empid);
		}
		for (String depid : ids) {
			System.out.println(depid);
		}*/
		/*for (String cityCode : cityCodes) {
			System.out.println(cityCode);
		}*/
	}//end main
}//end class
		

//Perform the following operation
		// Question 1

		//Following is the new requirement from Client
		// Print employee id with their respective job location
		// for example
		// 101 : Delhi
		// 102 : Mumbai
		// and so on
