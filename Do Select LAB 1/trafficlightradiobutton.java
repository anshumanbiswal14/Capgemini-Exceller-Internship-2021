package capglab;
import java.util.Scanner;
public class trafficlightradiobutton{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("------RadioButtons Available for Operation------");
	System.out.println("      RED----->1");
	System.out.println("      YELLOW-->2");
	System.out.println("      GREEN--->3");
	
	int x = sc.nextInt();
	switch(x) {
	case 1: System.out.println("STOP!");
	break;
	case 2: System.out.println("READY");
	break;
	case 3: System.out.println("GO");
	break;
	default:System.out.println("INVALID"); 
	
		}

	
	}
}
// Anshuman Biswal JA16