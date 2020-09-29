package Softuni.Fundamentals.Arrays;

import java.util.Scanner;

public class Train {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		int sum = 0;
		for(int i = 0;i<n;i++) {
			int num = Integer.parseInt(sc.nextLine());
			arr[i] = num;
			sum = arr[i] + sum;
		}
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.printf("\n%d",sum);
	}
}
