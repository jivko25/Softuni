package Softuni.Fundamentals.BasicSyntaxAndLoops;

import java.util.Scanner;

public class Vacation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());
		String type = sc.nextLine();
		String day = sc.nextLine();
		double ticket = 0;
		double sum = 0;
		switch (type) {
		case "Students":
			if("Friday".equals(day)) {
				ticket = 8.45;
			}
			else if("Saturday".equals(day)) {
				ticket = 9.80;
			}
			else if("Sunday".equals(day)) {
				ticket = 10.46;
			}
			else {
				System.out.println("Error");
			}
			sum = number*ticket;
			if(number>=30) {
				sum = sum*0.85;
				}
			break;
			
			case "Business":
			if("Friday".equals(day)) {
				ticket = 10.90;
			}
			else if("Saturday".equals(day)) {
				ticket = 15.60;
			}
			else if("Sunday".equals(day)) {
				ticket = 16;
			}
			else {
				System.out.println("Error");
			}
			sum = number*ticket;
			if(number>=100) {
				sum = sum*0.90;
				}
			break;	
			
			case "Regular":
				if("Friday".equals(day)) {
					ticket = 15;
				}
				else if("Saturday".equals(day)) {
					ticket = 20;
				}
				else if("Sunday".equals(day)) {
					ticket = 22.50;
				}
				else {
					System.out.println("Error");
				}
				sum = number*ticket;
				if(number>=10 && number<=20) {
					sum = sum*0.95;
					}
				break;

		default:
			break;
		}
		System.out.printf("Total price: %.2f",sum);
	}
}
