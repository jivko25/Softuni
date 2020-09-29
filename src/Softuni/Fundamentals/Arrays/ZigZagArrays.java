package Softuni.Fundamentals.Arrays;

import java.util.Scanner;

public class ZigZagArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n * 2];
		int[] narr = new int[n * 2];
		int[] karr = new int[n * 2];
		for(int i = 0;i<n;i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
			arr[n+i] = Integer.parseInt(sc.nextLine());
		}
		for(int i = 0;i<n;i++) {
			narr[i] = arr[i];
			karr[i+1] = arr[i+1];
			karr[i+2] = arr[i+2];
			narr[i+3] = arr[i+3];
		}
		System.out.println(narr + " " + karr);
	}
}
