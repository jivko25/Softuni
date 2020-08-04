package Softuni.Fundamentals.BasicSyntaxAndLoops;

import java.util.Scanner;

public class TheatrePromotion {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String day = sc.nextLine();
		int age = Integer.parseInt(sc.nextLine());
		int ticket = 0;
		boolean error = false;
		switch (day) {
		case "Weekday":
			if(age>=0 && age<=18) {
				ticket = 12;
			}
			else if(age>18 && age<=64) {
				ticket = 18;
			}
			else if(age>64 && age<=122) {
				ticket = 12;
			}
			else {
				System.out.println("Error!");
				error = true;
			}
			break;
		case "Weekend":
			if(age>=0 && age<=18) {
				ticket = 15;
			}
			else if(age>18 && age<=64) {
				ticket = 20;
			}
			else if(age>64 && age<=122) {
				ticket = 15;
			}
			else {
				System.out.println("Error!");
				error = true;
			}
			break;
		case "Holiday":	
			if(age>=0 && age<=18) {
				ticket = 5;
			}
			else if(age>18 && age<=64) {
				ticket = 12;
			}
			else if(age>64 && age<=122) {
				ticket = 10;
			}
			else {
				System.out.println("Error!");
				error = true;
			}
			break;

		default:
			System.out.println("Error!");
			error = true;
			break;
		}
		if(error == false) {
		System.out.printf("%d$", ticket);
		}
	}
}
