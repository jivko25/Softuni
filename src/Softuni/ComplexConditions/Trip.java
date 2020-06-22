package Softuni.ComplexConditions;

import java.util.Scanner;

public class Trip {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double budget;
		do {
			budget = sc.nextDouble();
		}
		while(budget<10 || budget>5000);
		String season = sc.next();
		switch (season) {
		case "summer":
			if(budget <= 100) {
				System.out.println("Somewhere in Bulgaria");
				System.out.print("Camp - ");
				System.out.format("%.2f", budget*0.3);
			}
			else if(budget<=1000) {
				System.out.println("Somewhere in Balkans");
				System.out.print("Camp - ");
				System.out.format("%.2f", budget*0.4);
			}
			else if(budget > 1000) {
				System.out.println("Somewhere in Europe");
				System.out.print("Hotel - ");
				System.out.format("%.2f", budget*0.9);
			}
			break;
		case "winter":
			if(budget <= 100) {
				System.out.println("Somewhere in Bulgaria");
				System.out.print("Hotel - ");
				System.out.format("%.2f", budget*0.7);
			}
			else if(budget<=1000) {
				System.out.println("Somewhere in Balkans");
				System.out.print("Hotel - ");
				System.out.format("%.2f", budget*0.8);
			}
			else if(budget > 1000) {
				System.out.println("Somewhere in Europe");
				System.out.print("Hotel - ");
				System.out.format("%.2f", budget*0.9);
			}
			break;	

		default:
			break;
		}
		}
}
