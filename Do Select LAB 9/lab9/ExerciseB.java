package lab9;

import java.util.*;

public class ExerciseB {
   public static void main(String[] args) {
	   
	DemoB obj = ()->{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		return sc.next().replace(""," ").trim();
	};
	System.out.println("Output string: "+ obj.addSpace());
}
}
