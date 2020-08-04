package Softuni.ProgrammingBasics.NestedLoops;

import java.util.Scanner;

public class SpecialNumbers {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());
		for(int i = 1111;i<=9999;i++) {
			String text = String.valueOf(i);
			char part1 = text.charAt(0);
			char part2 = text.charAt(1);
			char part3 = text.charAt(2);
			char part4 = text.charAt(3);
			int number1 = part1 - '0';
			int number2 = part2 - '0';
			int number3 = part3 - '0';
			int number4 = part4 - '0';
			System.out.printf(i + "-" + number1 + " " + number2 + " " + number3 + " " + number4 + "\n");
			if(number%number1 == 0 && number%number2 == 0 && number%number3 == 0 && number%number4 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
