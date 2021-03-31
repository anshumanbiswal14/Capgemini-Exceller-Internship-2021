package day2;

public class RemoveDuplicateEle {
public static void main(String[] args) {
		
	int[] x = new int[]{6,6,7,3,4,2,3,5,5,6,7,1,3,20};
	
	int y = x[0];
	
	boolean foundelement = false;

	for (int i = 0; i < x.length; i++) {
	    
		if (y == x[i] && !foundelement) {
	        
			foundelement = true;
	    } 
		else if (y != x[i]) {
	        
			System.out.print(" " + y);
	        
			y = x[i];
	        foundelement = false;
	    }
	    
	 
	}
	
	System.out.print(" " + y);
	}
}
