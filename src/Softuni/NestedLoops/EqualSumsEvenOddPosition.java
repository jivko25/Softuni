package Softuni.NestedLoops;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int start = Integer.parseInt(sc.nextLine());
		int end = Integer.parseInt(sc.nextLine());
		boolean isDone = false;
		while(start<=end) {
			String startString = String.valueOf(start);
			char part1 = startString.charAt(0);
			char part2 = startString.charAt(1);
			char part3 = startString.charAt(2);
			char part4 = startString.charAt(3);
			char part5 = startString.charAt(4);
			char part6 = startString.charAt(5);
			int num1 = Integer.valueOf(part1);
			int num2 = Integer.valueOf(part2);
			int num3 = Integer.valueOf(part3);
			int num4 = Integer.valueOf(part4);
			int num5 = Integer.valueOf(part5);
			int num6 = Integer.valueOf(part6);
			if((num1 + num3 + num5)==(num2 + num4 + num6)) {
				System.out.print(start + " ");
			}
			start++;
		}
	}
}
