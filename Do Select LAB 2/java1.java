package capglab2;

import java.util.Arrays;
import java.util.Scanner;

public class java1 {
	public static void main(String[] args) {
		
		int n;
		java1 one = new java1();
		System.out.println("Enter the number of elements of array===>");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the elements of the array===>");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("The second smallest element of the array is: " + one.getSecondSmallest(arr));
	}
	
	public int getSecondSmallest(int arr[]) {
		Arrays.sort(arr);
		return arr[1];
	}
}