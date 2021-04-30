package day16p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
	
	public static void main(String[] args) {
		
		String str = "abc@yahoo.in";
		Pattern p = Pattern.compile("[a-z0-9][._][@][a-z][.][a-z]");
		Matcher match = p.matcher(str);
		boolean matchFound = match.find();
		
		if(matchFound) {
			
			System.out.println("String Match found!");
		}
		
		else {
			System.out.println("Not FOUND!");
		}
		
				
		
	}
	

}