
package p1;
import java.util.Scanner;
public class DateSuffix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Valid Date here ===> ");
		int date = sc.nextInt();
		
		
		if(date<1 || date>31) {
			System.out.println("Invalid Date");
		}
		
		    else if(date%10 == 1) {
			System.out.println(date + "st");
		}
		
			else if(date%10 == 2) {
			System.out.println(date + "nd");
			}
			
			else {
			System.out.println(date + "th");
			}
		}
	}




	
	
