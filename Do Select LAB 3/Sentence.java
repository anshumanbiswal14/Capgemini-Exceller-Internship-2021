package capglab3;

import java.util.Scanner; 
public class Sentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Sentence here --->");
		String s = sc.nextLine();
		
		char arr[] = s.toCharArray();
		System.out.println("No. of Characters--->"+arr.length);
		
		String arr1[] = s.split("\r\n|\r|\n");
		System.out.println("No. of Words--->"+arr1.length);
        
		String arr2[] = s.split(" ");
        System.out.println("No. of Lines--->"+arr2.length);
        sc.close();
	}

}