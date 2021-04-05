package capglab2;

import java.util.Arrays;
import java.util.Scanner;

public class java3 {
	public static void main(String[] args) {
		int n, i;
		java3 three = new java3 ();
		System.out.println("How many elements in the array?");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the elements:");
		int[] arr = new int[n];
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Output:");
		three.getSorted(arr);
		for(i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public int[] getSorted(int arr[]) {
		int reverse;
		for(int i = 0; i < arr.length; i++) {
			reverse = 0;
			while(arr[i] != 0) {
				int digit = arr[i] % 10;
				reverse = (reverse * 10) + digit;
				arr[i] /= 10;
			}
			arr[i] = reverse;
		}
		Arrays.sort(arr);
		return arr;
	}
}	