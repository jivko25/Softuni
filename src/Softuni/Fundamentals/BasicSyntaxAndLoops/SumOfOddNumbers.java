package Softuni.Fundamentals.BasicSyntaxAndLoops;

import java.util.Scanner;

public class SumOfOddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int k = 1;
		int sum = 0;
		for(int i = 1;i<=n;i++) {
			System.out.println(k);
			sum = sum + k;
			k+=2;
		}
		System.out.printf("Sum: %d",sum);
	}
}
