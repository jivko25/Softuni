package Softuni.Fundamentals.DataTypesAndVariables;

import java.util.Scanner;

public class SumOfChars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String number;
		int sum = 0;
		for(int i = 0;i<n;i++) {
			number = sc.nextLine();
			char charr = number.charAt(0);
			int num = charr;
//			System.out.println(num);
			sum = sum + num;
			if(i+1==n) {
				System.out.println("The sum equals: " + sum);
			}
		}
//		System.out.println(sum);
	}
}
