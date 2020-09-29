package Softuni.Fundamentals.BasicSyntaxAndLoops;

import java.util.Scanner;

public class PrintAndSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = Integer.parseInt(sc.nextLine());
		int end = Integer.parseInt(sc.nextLine());
		int sum = 0;
		for(int i = start; i<=end;i++) {
			sum = sum + i;
			System.out.printf("%d ",i);
		}
		System.out.printf("\nSum: %d",sum);
	}
}
