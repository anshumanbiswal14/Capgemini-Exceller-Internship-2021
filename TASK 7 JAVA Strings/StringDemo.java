package day9p2;
import java.util.Scanner;

public class StringDemo {
	
	public static void main(String[] args) {
		
		task4();
		
	}
	
	 void task1() {
		
		String str = new String("Hello");
		str = str.concat("Java"); // immutable that's why we use this
		System.out.println(str);
		
		str = str.toLowerCase();
		System.out.println(str);
		
		str = str.toLowerCase();
		System.out.println(str);
	}
	
	 void task2() {
		
		String s1 = new String("   ABC");
		String s2 = new String("abc");
		String s3 = "ABC";
		String s4 = "ABC";
		
		boolean a = (s1==s2); // false
		boolean b = (s3==s4); // true
		
		boolean c = s1.equals(s2); // false
		boolean d = s1.equalsIgnoreCase(s2); //true
	}
	
	static void task3() {
		
		String s1 = "   abc   ";
		System.out.println(s1.length());
		
		s1.trim();
		System.out.println(s1.length());
		
		String s2 = "0123456789";
		s2 = s2.substring(5,8); // 567 output
		
		String s3 = "mike@gmail.com";
		char ch  = s3.charAt(5);
		System.out.println(ch);
		
		
		char chArray[] = s3.toCharArray();
		
		String s4 = "Hello how are you!!";
		String arr[] = s4.split(" ");
		
		for(String str : arr) {
			System.out.println(str);
		
		
		//----------------------------------------------------------------------------------//
		}
	}
	
	static void task4() {
			
			String s1 = "abc.xyz@gmail.com";
			String arr[] = s1.split("\\.");
			
			for(String str : arr) {
				System.out.println("\n"+ str);
			
		}
			
			String s2 = "Spring,Hibernate,Spring-rest,angular,React,JPA";
			String piece[] = s2.split(",");
			for(String str : piece) {
				System.out.println("\n"+str);
			}
			
			String s3= "3+4+5";
			String piece2[] = s3.split("[+]");
			for(String str2 : piece2) {
				System.out.println("\n"+str2);
			}
			
			String s4 = "mike@gmail.com";
			//use regular exp
			String arr4[] = s4.split("gma");
			for (String str : arr4) {
				System.out.println(str);
			}
	
		
		
		
	}
	
	static void task5() {
		
		Scanner sc = new Scanner(System.in);
		String string;
		System.out.println("Enter a String here-->");
		string = sc.next();
		System.out.println(string);
		
		
		
		
		
		
	}
	

		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
