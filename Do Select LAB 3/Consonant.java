package capglab3;
import java.util.Scanner;
public class Consonant {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a String here ---->");
		Scanner sc = new Scanner(System.in);
		Consonant con = new Consonant();
		
		String s = sc.nextLine();
		sc.close();
		con.alterString(s);
	}
    
	public void alterString(String str) {
    	
		char arr[] = str.toCharArray();
    	StringBuffer st = new StringBuffer();
    	
    	for(int j = 0;j < arr.length;j++) {
    	   
    		if(arr[j] == 'a'||arr[j] == 'e'||arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u'||arr[j] == 'A'||arr[j] == 'E'||arr[j] == 'I' || arr[j] == 'O' || arr[j] == 'U') {
    	    		arr[j] = arr[j];
    	    }else if(arr[j] == 'Z') {
    	    	arr[j] = 'A';
    	    }else if(arr[j] == 'z') {
    	    	arr[j] = 'a';
    	    }
    	    else {
    	    	char ch = arr[j];
    	    	arr[j] = (char) (ch + 1);
    	    }
    	}
    	for(int i = 0; i < arr.length; i++) {
    		
    		st.append(arr[i]);
    	}
    	System.out.println(st);
    }
}