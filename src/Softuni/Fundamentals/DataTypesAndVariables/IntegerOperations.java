package Softuni.Fundamentals.DataTypesAndVariables;

import java.util.Scanner;

public class IntegerOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = Integer.parseInt(sc.nextLine());
		int second = Integer.parseInt(sc.nextLine());
		int third = Integer.parseInt(sc.nextLine());
		int forth = Integer.parseInt(sc.nextLine());
		System.out.printf("%d", ((first + second)/third)*forth);
	}
}
