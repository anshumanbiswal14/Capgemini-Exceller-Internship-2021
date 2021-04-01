package capglab;
import java.util.Scanner;
public class PowerTwo{

	  public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter a Number?");
	    int number = in.nextInt();
	    in.close();

	    if (isPowerOfTwo(number)) {
	      System.out.println("yes");
	    } else {
	      System.out.printf("no");
	    }
	  }

	  private static boolean isPowerOfTwo(int number) {

	    if (number % 2 != 0) {
	      return false;
	    } else {

	      for (int i = 0; i <= number; i++) {

	        if (Math.pow(2, i) == number) return true;
	      }
	    }
	    return false;
	  }
	}

//Anshuman Biswal JA16
