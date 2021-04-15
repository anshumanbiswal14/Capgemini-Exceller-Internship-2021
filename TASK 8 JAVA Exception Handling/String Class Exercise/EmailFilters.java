package day10p2;

public class EmailFilters {
	
	
		static String emails[] = {
				"ramesh@gmail.com",
				"rakesh@outlook.com",
				"lokesh@linkedin.com",
				"mahesh@gmail.com",
				"ganesh@gmail.com",
				"rajesh@outlook.com"
			};


		public static void main(String[] args) {
		
			
			
			int gmail = 0;
			int	linkedin = 0; 
			int	outlook = 0;
			
			for(String em : emails) {
				if(em.endsWith("@gmail.com")) {
					gmail++;
				}
				else if(em.endsWith("@outlook.com")) {
					outlook++;
				}
				else if(em.endsWith("@linkedin.com")) {
					linkedin++;
				}
			}
			System.out.println("Email ends with gmail domain: "+gmail);
			System.out.println("Email ends with outlook domain: "+outlook);
			System.out.println("Email ends with linkedin domain: "+linkedin);
		}

	}