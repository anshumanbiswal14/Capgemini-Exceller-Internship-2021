package capglab3;
import java.util.Scanner;

public class NumberDifference {
	
      public static void main(String[] args) {
    	  
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ---->");
		
		String num = sc.nextLine();
		NumberDifference nd = new NumberDifference();
		
		nd.modifyNumber(num);
		sc.close();
	}
      
      public void modifyNumber(String num) {
    	  char arr[] = num.toCharArray();
    	  
    	  StringBuffer str = new StringBuffer();
    	 
    	  for(int i = 0;i < arr.length - 1;i++) {
    		  
    		  int num1 = (int)arr[i];
    		  int num2 = (int)arr[i + 1];
    		  
    		  if(num1 - num2 > 0) {
    		     
    			  str.append(num1-num2);
    			  
    		  }else if(num2 - num1 >0) {
    			  
    			  str.append(num2-num1);
    		  }
    	  }
    	  str.append(num.charAt(num.length()-1));
    	  System.out.println("Number Difference New Number---->" + str);
      }
}