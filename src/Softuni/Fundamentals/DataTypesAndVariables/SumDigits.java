package Softuni.Fundamentals.DataTypesAndVariables;

import java.util.Scanner;

public class SumDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		int sum = 0;
		for(int i = 0;i<number.length();i++) {
			char charr = number.charAt(i);
			int num = Integer.valueOf(charr);
			sum = sum + (num-48);
		}
		System.out.println(sum);
	}
}
