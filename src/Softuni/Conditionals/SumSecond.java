package Softuni.Conditionals;

import java.util.Scanner;

public class SumSecond {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		int sum = first + second + third;
		int minutes = sum/60;
		int seconds = sum%60;
		if(seconds<10) {
		System.out.printf("%d:0%d", minutes, seconds);
		}
		else {
			System.out.printf("%d:%d", minutes, seconds);
		}
	}
}
