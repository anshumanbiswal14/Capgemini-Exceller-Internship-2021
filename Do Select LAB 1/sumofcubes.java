package capglab;
import java.util.Scanner;
class sumofcubes
{
  
    
    public static int sumOfSeries(int n)
    {
        int sum = 0;
        for (int x=1; x<=n; x++)
            sum += x*x*x;
        return sum;
    }
  

    public static void main(String[] args)
    
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Digit here --->");
        int n = sc.nextInt();
        System.out.println("Cube of the Digit is ---->");
        System.out.println(sumOfSeries(n));
  
    }
}
// Anshuman Biswal JA16