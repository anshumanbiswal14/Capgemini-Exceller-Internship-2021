package day16p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
	
	public static void main(String[] args) {
		
		String str = "asdsadsadsad";
		Pattern p = Pattern.compile("[D][1-4]\\d{6}");
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
