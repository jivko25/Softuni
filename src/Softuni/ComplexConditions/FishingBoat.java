package Softuni.ComplexConditions;

import java.util.Scanner;

public class FishingBoat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int budget;
		int fishermans;
		do {
			budget = sc.nextInt();
		}
		while(budget<1 || budget>8000);
		String season = sc.next();
		do {
			fishermans = sc.nextInt();
		}
		while(fishermans<4 || fishermans>18);
		double boatPrice = 0;
		switch (season) {
		case "Spring":
			boatPrice = 3000;
			break;
		case "Summer":
			boatPrice = 4200;
			break;	
		case "Autumn":
			boatPrice = 4200;
			break;	
		case "Winter":
			boatPrice = 2600;
			break;	
		default:
			break;
		}
		if(fishermans<=6) {
			boatPrice = boatPrice*0.9;
			if(fishermans%2 == 0 && season.equals("Autumn")!= true) {
				boatPrice = boatPrice*0.95;
			}
		}
			else if(fishermans<=11 && season!="Autumn") {
			boatPrice = boatPrice*0.85;
			if(fishermans%2 == 0) {
				boatPrice = boatPrice*0.95;
			}
		}
			else if(fishermans<=16 && season!="Autumn") {
			boatPrice = boatPrice*0.75;
			if(fishermans%2 == 0) {
				boatPrice = boatPrice*0.95;
			}
		}
		
		if(budget<boatPrice) {
			System.out.print("Not enough money! You need ");
			System.out.format("%.2f", boatPrice - budget);
			System.out.print(" leva.");
		}
			else if(budget>=boatPrice){
				System.out.print("Yes! You have ");
				System.out.format("%.2f", budget - boatPrice);
				System.out.print(" leva left.");
		}
		
	}

}
