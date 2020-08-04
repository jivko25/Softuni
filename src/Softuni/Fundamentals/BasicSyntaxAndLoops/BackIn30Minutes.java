package Softuni.Fundamentals.BasicSyntaxAndLoops;

import java.util.Scanner;

public class BackIn30Minutes {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int hours = Integer.parseInt(sc.nextLine());
		int minutes = Integer.parseInt(sc.nextLine());
		int newMinutes = minutes+30;
		if(newMinutes>=60) {
			hours++;
		}
		if(newMinutes%60<10) {
			System.out.printf("%d:0%d", hours%24, newMinutes%60);

		}
		else {
		System.out.printf("%d:%d", hours%24, newMinutes%60);
		}
	}
}
