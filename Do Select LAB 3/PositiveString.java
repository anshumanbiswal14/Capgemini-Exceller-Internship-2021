package capglab3;

import java.util.Scanner;
public class PositiveString {

	public static void main(String[] args) {
		
		System.out.println("Enter a String here ---->");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		PositiveString ps = new PositiveString();
		System.out.println(ps.string(str));
	}
    public boolean string(String str) {
    	char arr[] = str.toCharArray();
    	
    	for(int i = 0;i < arr.length - 1;i++) {
    			
    			int a = (int)arr[i];
    			int b = (int)arr[i+1];
    			
    			if(a > b) {
    				return false;
    			}
    	}
    	
    	return true;
    }
}