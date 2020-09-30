package Softuni.Fundamentals.DataTypesAndVariables;

import java.util.Scanner;

public class SumOfChars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int sum = 0;
		for(int i = 0;i<n;i++) {
			char charr = sc.next().charAt(0);
			int num = charr;
			sum += num;
		}
		System.out.println("The sum equals: " + sum);
	}
}
