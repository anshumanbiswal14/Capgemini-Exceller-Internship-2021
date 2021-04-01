package capglab;

public class DifferenceSquareSum{

static int Square_Diff(int n){

int l, k, m;

	l = (n * (n + 1) * (2 * n + 1)) / 6;
	

	k = (n * (n + 1)) / 2;
	
	k = k * k;
	
	m = Math.abs(l - k);
	
	return m;

}


public static void main(String s[])
{
	int n = 3;
	System.out.println(Square_Diff(n));	
	
}
}
//Anshuman Biswal JA16
